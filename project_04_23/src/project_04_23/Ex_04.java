package project_04_23;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {

//		int[] nums = new int[5];
//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
//		nums[3] = 4;
//		nums[4] = 5;
//
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//		System.out.println("==================");
//		for (int num : nums) {
//			System.out.println(num);
//		}

		/* 1. int[] scores = {70,85,90,100,65}; 의 총합과 평균 구하기 */

//		int[] scores = { 70, 85, 90, 100, 65 };
//		int sum = 0;
//		int avg = 0;
//
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		avg = sum / scores.length;
//
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + avg);

		/* 2. 사용자에게 정수 6개를 입력받아 배열에 저장하고 짝수만 출력하기 */

//		Scanner sc = new Scanner(System.in);
//		int numbers[] = new int[6];
//
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print("정수를 입력해 주세요 : ");
//			numbers[i] = sc.nextInt();
//		}
//		sc.close();
//
//		for (int j = 0; j < numbers.length; j++) {
//			if (numbers[j] % 2 == 0) {
//				System.out.println("numbers[" + j + "]은 짝수입니다 : " + numbers[j]);
//			}
//		}

		/* 이차원 배열 */

//		int[][] numbers = new int[3][3];
//
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers.length; j++) {
//				numbers[i][j] = i;
//			}
//		}

		/* 1. int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} 행의 합, 열의 합 구하기 */
		/* arr[0][0] + arr[0][1] + arr[0][2] */

//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int row_sum = 0;
//		int col_sum = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				row_sum += arr[i][j];
//			}
//			System.out.println("행의 합 : " + row_sum);
//			row_sum = 0;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				col_sum += arr[j][i];
//			}
//			System.out.println("열의 합 : " + col_sum);
//			col_sum = 0;
//		}

		/* 2. 사용자에게 정수 9개를 입력받아 3*3 배열 채우고 출력하기 */

//		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[3][3];
//		int n = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				n++;
//				System.out.print(n + "번째 정수를 입력하시오 : ");
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		sc.close();

		/* 3. 4명의 학생의 이름과 국어/영어/수학 점수를 입력받아 2차원 배열에 저장한 뒤 총점과 평균 계산 */
		/* =====출력===== */
		/* 이름 국어 영어 총점 평균 */
		/* 이동준 80 90 70 240 80 */

//		Scanner sc = new Scanner(System.in);
//		String[] name = new String[4];
//		int[][] arr = new int[4][3];
//		String sub = null;
//		int[] sum = new int[4];
//		int[] avg = new int[4];
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("이름을 입력하시오 : ");
//			name[i] = sc.next();
//			for (int j = 0; j < arr[0].length; j++) {
//				if (j == 0) {
//					sub = "국어";
//				} else if (j == 1) {
//					sub = "영어";
//				} else if (j == 2) {
//					sub = "수학";
//				}
//				System.out.print(name[i] + "님, " + sub + " 점수를 입력해주세요 : ");
//				arr[i][j] = sc.nextInt();
//				sum[i] += arr[i][j];
//			}
//			avg[i] = sum[i] / arr[0].length;
//		}
//
//		sc.close();
//
//		System.out.println("	==========출력==========	");
//		System.out.println("이름	국어	영어	수학	총점	평균 ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(name[i]);
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print("	" + arr[i][j]);
//			}
//			System.out.println("	" + sum[i] + "	" + avg[i]);
//		}

		/* 4. 문자를 입력해서 문자열 배열에 넣고 사용자가 입력한 문자가 배열에 어디 위치에 존재하는지와 개수를 출력하기 */
		/* ex) 문자열 application 일 때 사용자 입력문자 i인 경우 i가 존재하는 위치 및 i의 개수 출력 */

		/* split(), equals()을 사용한 방법 */

//		Scanner sc = new Scanner(System.in);
//		String word = null;
//		String[] alpha = new String[1];
//		int n = 0;
//
//		System.out.print("단어를 입력해주세요 : ");
//		word = sc.next();
//
//		String[] arr = word.split("");
//
//		System.out.print("찾을 알파벳을 입력해주세요 : ");
//		alpha[0] = sc.next();
//
//		sc.close();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (alpha[0].equals(arr[i])) {
//				n++;
//				System.out.println(i + 1 + "번째에 " + n + "개째 발견했습니다.");
//			}
//		}
//		System.out.print(alpha[0] + " 총 " + n + "개 발견했습니다.");

		/* str.charAt(0) = 'a', str.charAt(1) = 'p'를 사용한 방법 */

//		Scanner scan = new Scanner(System.in);
//		System.out.print("문자를 입력하세요 : ");
//		String str = scan.next();
//
//		char[] arr = new char[str.length()];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = str.charAt(i);
//		}
//		System.out.print("찾는 문자를 입력하세요 : ");
//		String ch = scan.next();
//		char a = ch.charAt(0);
//		int count = 0;
//
//		System.out.println(str + "에 " + a + "가 존재하는 위치: ");
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == a) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println(a + " 개수: " + count);

		/* 5. 사용자가 배열의 길이를 직접 입력하여 배열을 선언하고 배열의 값을 사용자가 입력하여 배열 전체의 총 합 출력하기 */
		/* ex) 3 입력 시 3 크기 배열 , 4 입력 시 4 크기 배열 */

//		Scanner sc = new Scanner(System.in);
//		int row = 0;
//		int col = 0;
//		int sum = 0;
//
//		System.out.print("row값을 입력해주세요 : ");
//		row = sc.nextInt();
//
//		System.out.print("col값을 입력해주세요 : ");
//		col = sc.nextInt();
//
//		int[][] arr = new int[row][col];
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print("arr[" + i + "]" + "[" + j + "]" + "에 들어갈 값을 입력해주세요 : ");
//				arr[i][j] = sc.nextInt();
//				sum += arr[i][j];
//			}
//		}
//
//		sc.close();
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(arr[i][j] + "	");
//			}
//			System.out.println();
//		}
//		System.out.println("총 합 : " + sum);

	}

}
