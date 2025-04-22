package project_04_22;

public class Ex_03 {

	public static void main(String[] args) {
		// 조건문 if(조건){조건이 참인 경우}else{조건이 거짓인 경우}
		/*
		 * int x = 5; if (x>5) { System.out.println("x가 5보다 큽니다."); }else if (x==5) {
		 * System.out.println("x가 5와 같습니다."); }else {
		 * System.out.println("x가 5보다 작습니다."); }
		 */
		
		// 반복문: 특정 코드를 반복 실행
		// for, foreach, while, do-while
		// foreach: 배열이나 컬렉션타입에 사용
		
		// for(초기값; 조건; 증감연산){반복할 코드}
		/*
		 * for(int i = 0 ; i < 5 ; i++) { System.out.println("Hello"); }
		 */
		
		// while(조건){반복할 코드}
		// for와의 차이점: while은 증감연산을 반복할 코드에 넣어줘야 함
		/*
		 * int n = 0; while(n<5) { System.out.println("Hello Java"); n++; }
		 */
		
		// do-while
		// 최소 한번은 반복할 코드를 실행
		
		/*
		 * int n = 0; do { System.out.println("Hello Java!!"); }while(n>0);
		 */
		
		// 2중 반복문
		// 반복문{반복문{반복할 코드}}
		
		/*
		 * for(int i = 0; i < 3; i++) { for(int j = 0; j < 3; j++) {
		 * System.out.println("hello"); } }
		 */
		// i = 0, j = 0 => 1번 출력
		// i = 0, j = 1 => 2번 출력
		// i = 0, j = 2 => 3번 출력
		// i = 1, j = 0 => 4번 출력
		// i = 1, j = 1 => 5번 출력
		// i = 1, j = 2 => 6번 출력
		// i = 2, j = 0 => 7번 출력
		// i = 2, j = 1 => 8번 출력
		// i = 2, j = 2 => 9번 출력
		
		// 2중 반복문 이용해서 구구단
		/*
		 * for(int i = 1; i < 10; i++) { for(int j = 1; j < 10; j++) {
		 * System.out.println(i +" X "+ j +" = "+ i*j); } }
		 */
		
		// 2중 반복문 이용해서 별 찍기
		// 줄의 수 = i가 담당
		// 별의 수 = j가 담당
		
		/*
		 * for(int i=0; i<5; i++) { for(int j=0;j<5;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */		 
		
		/*
		 * for(int i = 5; i > 0; i--) { for(int j = i; j < 6; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		 
		/*
		 * for(int i=0; i<5; i++) { for(int k=4; k>i; k--) { System.out.print(" "); }
		 * for(int j=0; j<=i; j++) { System.out.print("*"); } System.out.println(); }
		 * 
		 * for(int i=0; i<5; i++) { for(int k=5; k>i; k--) { System.out.print("*"); }
		 * for(int j=0; j<=i; j++) { System.out.print(" "); } System.out.println(); }
		 * 
		 * for(int i=0 ; i<5 ; i++) { for(int j=0 ; j<=i ; j++) { System.out.print("*");
		 * } for(int k= 0 ; k < 5 ; k++) { System.out.print(" "); }
		 * System.out.println(); } for(int i=0 ; i<5 ; i++) { for(int j=0 ; j<=i ; j++)
		 * { System.out.print(" "); } for(int k= 5 ; k > i ; k--) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		// 역삼각형
		for(int i=0;i<5;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 반대로 별 찍기
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = i; j < 5; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = i; j > -4; j--) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		for(int i = 0; i<5; i++) {
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
