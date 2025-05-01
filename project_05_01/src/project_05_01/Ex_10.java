package project_05_01;

public class Ex_10 {

	public static void main(String[] args) {

//		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
//		int sum = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (i == j) { // 대각선 출력 // if (i + j == 2) { // 역대각선 출력
//					System.out.print(arr[i][j] + " ");
//					sum += arr[i][j];
//				}
//			}
//		}
//		System.out.println();
//		System.out.println("합계 : " + sum);

//		int[][] arr = new int[5][5];

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				arr[i][j] = 1;
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				arr[i][j] = 1;
//				if (((i >= 1) && (i <= 3)) && ((j >= 1) && (j <= 3))) {
//					arr[i][j] = 0;
//				}
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if ((i == j) || i + j == 4) {
//					arr[i][j] = 1;
//					System.out.print(arr[i][j] + " ");
//				} else {
//					arr[i][j] = 0;
//					System.out.print(arr[i][j] + " ");
//				}
//			}
//			System.out.println();
//		}
//
//		System.out.println();

		/* 나선형 출력 (본인 작성) */

//		int num = 1;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 0 && arr[i][j] == 0) {
//					arr[i][j] = num++;
//				} else if (j == 4 && arr[i][j] == 0) {
//					arr[i][j] = num++;
//				} else if (i == 4 && arr[i][j] == 0) {
//					for (int k = 4; k >= 0; k--) {
//						arr[i][k] = num++;
//					}
//				}
//
//			}
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j == 0 && arr[i][j] == 0) {
//					for (int k = 3; k >= 1; k--) {
//						arr[k][j] = num++;
//					}
//				} else if (i == 1 && arr[i][j] == 0) {
//					arr[i][j] = num++;
//				} else if (j == 3 && arr[i][j] == 0) {
//					arr[i][j] = num++;
//				} else if (i == 3 && arr[i][j] == 0) {
//					for (int k = 3; k >= 1; k--) {
//						arr[i][k] = num++;
//					}
//				}
//			}
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j == 1 && arr[i][j] == 0) {
//					for (int k = 2; k >= 2; k--) {
//						arr[k][j] = num++;
//					}
//				} else if (i == 2 && arr[i][j] == 0) {
//					arr[i][j] = num++;
//				}
//			}
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "	");
//			}
//			System.out.println();
//		}

		/* 나선형 출력 (모범 답안) */

//		int[][] arr = new int[5][5];
//
//		int num = 1;
//		int left = 0, right = 4, top = 0, bottom = 4;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = left; j <= right; j++) {
//				arr[top][j] = num++;
//			}
//			top++;
//			for (int k = top; k <= bottom; k++) {
//				arr[k][right] = num++;
//			}
//			right--;
//			for (int l = right; l >= left; l--) {
//				arr[bottom][l] = num++;
//			}
//			bottom--;
//			for (int m = bottom; m >= top; m--) {
//				arr[m][left] = num++;
//			}
//			left++;
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "	");
//			}
//			System.out.println();
//		}
		
		/* 역방향 나선형 출력 */
		
//		int[][] arr = new int[5][5];
//
//		int num = 1;
//		int left = 0, right = 4, top = 0, bottom = 4;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = bottom; j >= top; j--) {
//				arr[j][right] = num++;
//			}
//			right--;
//			for (int k = right; k >= left; k--) {
//				arr[top][k] = num++;
//			}
//			top++;
//			for (int l = top; l <= bottom; l++) {
//				arr[l][left] = num++;
//			}
//			left++;
//			for (int m = left; m <= right; m++) {
//				arr[bottom][m] = num++;
//			}
//			bottom--;
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "	");
//			}
//			System.out.println();
//		}

	}

}
