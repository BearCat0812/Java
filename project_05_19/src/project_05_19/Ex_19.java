package project_05_19;

import java.util.*;

public class Ex_19 {

	public static void main(String[] args) {
		/* Set */
		/* 중복을 허용하지 않고, 순서가 없다 */
		/* [1, 2, 3, 4, 1, 1] => set => [2, 3, 1, 4] */

		Set<String> set = new HashSet<String>();

		/* 요소 추가 add */
//		set.add("홍길동");
//		set.add("신용권");
//		set.add("홍길동");

//		System.out.println(set);

		/* 1~25 중복 제거 한 후 배열 [1~25] */
		/* set 1~25 중복된 수 만큼 빠지기 때문에 길이가 25가 아니다 */

//		for(String str : set) {
//			System.out.println(str);
//		}

		/* 입력받은 단어를 set에 저장하고 입력받은 단어가 이미 set에 존재할 경우 "이미 입력한 단어입니다" 출력 */
		/* 아니면 "단어가 저장되었습니다" 출력 */
		/* 무한 반복문을 통해서 while(true) 저장하고 => 종료하고 싶으면 exit 입력 */
		/* 문자열.equals() 비교하고 => 종료 */

//		System.out.println(set.add("홍길동"));
//		System.out.println(set.add("김하나"));

		while (true) {
			String word;
			Scanner sc = new Scanner(System.in);

			System.out.println("단어를 입력해주세요. : ");
			word = sc.next();

			if (word.equals("exit")) {
				System.out.println(set);
				sc.close();
				break;
			} else {
				if (set.add(word) == false) {
					System.out.println("이미 입력한 단어입니다.");
				} else {
					set.add(word);
					System.out.println("단어가 저장되었습니다.");
				}
			}
		}

		/* add : Set에 요소 추가 */
		/* remove(index) : 값 제거 */
		/* contains(값) : 값 존재 여부 확인 */
		/* size() : Set의 크기 */
		/* clear() : 모든 값 제거 */
		/* isEmpty() : 리스트가 비어 있는지 확인 */
		/* iterator() : 반복자 반환 */
		/* iterator => hasNext() : 다음 요소가 있는지 확인 (있으면 true) */
		/* next() : 다음 요소를 반환 */
		/* remove() : 요소 제거 */

		Iterator<String> iterator = set.iterator();
		System.out.println(iterator.next());

		for (String item : set) {
			System.out.println(item);
		}
	}
}
