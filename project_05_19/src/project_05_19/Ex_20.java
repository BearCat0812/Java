package project_05_19;

import java.util.*;

public class Ex_20 {

	public static void main(String[] args) {

		/* Map */
		/* JS 객체와 비슷 */
		/* key-value 쌍으로 이루어져 있음 */
		/* key는 중복 X, value는 중복 O */
//		Map<Object, Object> map = new HashMap<Object, Object>();
//
//		map.put("name", new String[] { "홍길동", "김하나" });
////		map.put("name", "김하나");
//		map.put("age", 123);
////		System.out.println(map);
//		System.out.println(map.get("name"));
//		for (String name : (String[]) map.get("name")) {
//			System.out.println(name);
//		}
//		System.out.println(map.get("age"));

		/* put(key, value) : 키-값 추가 */
		/* get(key) : 키에 해당하는 값 반환 */
		/* containsKey(key) : 해당 키가 존재하는지 확인 */
		/* containsValue(value) : 해당 값이 존재하는지 확인 */
		/* remove(key) : 해당 키-값 삭제 */
		/* size() : map 항목 수 반환 */
		/* isEmpty() : 비어있는지 확인 */
		/* clear() : 모든 항목 제거 */
		/* keySet() : 모든 키만 set으로 반환 */
		/* values() : 모든 값 반환 */

		/* Map<String, int[]> 맵이름 = new HashMap<>() */
		/* 키에 이름을 넣고, 값에는 정수 3개를 입력 => Scanner 써도 되고 안쓰고 바로 넣어도 됨 */
		/* get(키) => 배열 값 => 점수의 평균 출력 */

		Map<String, int[]> map = new HashMap<String, int[]>();
		Scanner sc = new Scanner(System.in);

		int first = 0, second = 0, third = 0;
		int total = 0;

		for (int i = 1; i < 4; i++) {
			System.out.println(i + " 번 째 점수를 입력해주세요. : ");
			if (i == 1) {
				first = sc.nextInt();
			} else if (i == 2) {
				second = sc.nextInt();
			} else if (i == 3) {
				third = sc.nextInt();
			} else {
				break;
			}
		}

		map.put("score", new int[] { first, second, third });

		for (int score : (int[]) map.get("score")) {
			System.out.println(score);
			total += score;
		}
		
		System.out.println(total);

	}

}
