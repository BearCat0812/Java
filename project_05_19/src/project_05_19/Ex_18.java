package project_05_19;

import java.util.*;

public class Ex_18 {

	public static void main(String[] args) {
//		/* List */
//		List<Object> list = new ArrayList<Object>();
//		
//		// List 요소 추가
//		// add => 리스트명.add(추가할 값);
//		list.add("123");
//		list.add(123);
//		System.out.println(list);
//		/* 인덱스를 이용한 접근 = 리스트명.get(index) */
//		System.out.println(list.get(0));
//		
//		/* 타입 확인 */
//		/* 값.getClass().getSimpleName(); */
//		System.out.println(list.get(0).getClass().getSimpleName());
//		System.out.println(list.get(1).getClass().getSimpleName());
//
//		/* instanceof */
//		System.out.println(list.get(0) instanceof String);
//		System.out.println(list.get(0) instanceof Integer);
//		
//		list.remove(1);
//		System.out.println(list);

		/* List 만들고 반복문을 통해서 5개의 값(String, Integer, 둘다)을 입력 받아 리스트에 저장 후 리스트 출력 */

		List<Object> list = new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 6; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " 번 째 String 값을 입력해주세요 : ");
				list.add(sc.next());
			} else {
				System.out.println(i + " 번 째 Int 값을 입력해주세요 : ");
				list.add(sc.nextInt());
			}
		}

		sc.close();

		System.out.println(list);
		System.out.println(list.size());
		
		/* add : 요소를 리스트 끝에 추가 */
		/* add(index, 값) : 지정한 인덱스 위치에 요소 추가 */
		/* get(index) : 지정한 인덱스 위치의 요소 반환 */
		/* set(index, 값) : 지정한 인덱스 위치의 요소 변경 */
		/* remove(index) : 지정한 인덱스 위치의 요소 삭제 */
		/* size() : 리스트 크기 반환 */
		/* contains(값) : 해당 값이 있는지 확인 */
		/* isEmpty() : 리스트가 비어 있는지 확인 */
		/* clear() : 리스트의 모든 요소 삭제 */
		/* indexOf(값) : 해당 값의 첫 위치 반환 */
		/* lastIndexOf() : 해당 값의 마지막 위치 반환 */
		/* toArray() : 리스트를 배열로 변환 */
		
	}

}
