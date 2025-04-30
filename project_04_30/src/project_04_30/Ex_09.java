package project_04_30;

import java.util.*;

public class Ex_09 {

	public static void main(String[] args) {

////		int[] arr = { 3, 5, 6, 9, 10 };
//		int[] arr = new int[5];
//
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < 5; i++) {
//			System.out.print("배열에 들어갈 수를 입력하세요 : ");
//			arr[i] = sc.nextInt();
//		}
//
//		sc.close();
//
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + " 번째 배열 : ");
//			System.out.println(arr[i]);
//		}

//		int[] arr = { 70, 80, 95, 85, 90 };
//		int sum = 0;
//
//		for (int i = 0; i < 5; i++) {
//			sum += arr[i];
//		}
//		int avg = sum / arr.length;
//
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + avg);

		/* 버블 정렬 */

//		int[] arr = { 5, 2, 8, 4, 1 };
//		int temp = 0;
//
////		for (int i = 0; i < arr.length - 1; i++) {
////			for (int j = 0; j < arr.length - 1; j++) {
////				if (arr[j] > arr[j + 1]) {
////					temp = arr[j];
////					arr[j] = arr[j + 1];
////					arr[j + 1] = temp;
////				}
////			}
////		}
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] < arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		/* 선택 정렬 */

//		int[] arr = { 5, 2, 8, 4, 1 };
//
//		for (int i = 0; i < arr.length; i++) {
//			int min = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < arr[min]) {
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		/* 삽입 정렬 */

//		int[] arr = { 5, 8, 4, 2, 1 };
//
//		for (int i = 1; i < arr.length; i++) {
//			int key = arr[i];
//			int j;
//			for (j = i - 1; j >= 0; j--) {
//				if (arr[j] > key) {
//					arr[j + 1] = arr[j];
//				} else {
//					break;
//				}
//			}
//			arr[j + 1] = key;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

//		int[] arr = { 6, 4, 9, 8, 1, 3 };
//
//		/* 버블 정렬 */
//
////		for (int i = 0; i < arr.length - 1; i++) {
////			for (int j = 0; j < arr.length - 1; j++) {
////				if (arr[j] > arr[j + 1]) {
////					int temp = arr[j];
////					arr[j] = arr[j + 1];
////					arr[j + 1] = temp;
////				}
////			}
////		}
////		
////		for (int i = 0; i < arr.length; i++) {
////			System.out.print(arr[i] + " ");
////		}
//
//		/* 선택 정렬 */
//
////		for (int i = 0; i < arr.length; i++) {
////			int min = i;
////			for (int j = i + 1; j < arr.length; j++) {
////				if (arr[j] < arr[min]) {
////					min = j;
////				}
////			}
////			int temp = arr[min];
////			arr[min] = arr[i];
////			arr[i] = temp;
////
////		}
////
////		for (int i = 0; i < arr.length; i++) {
////			System.out.print(arr[i] + " ");
////		}
//
//		/* 삽입 정렬 */
//
////		for (int i = 1; i < arr.length; i++) {
////			int key = arr[i];
////			int j;
////			for (j = i - 1; j >= 0; j--) {
////				if (arr[j] > key) {
////					arr[j + 1] = arr[j];
////				} else {
////					break;
////				}
////			}
////			arr[j + 1] = key;
////		}
////
////		for (int i = 0; i < arr.length; i++) {
////			System.out.print(arr[i] + " ");
////		}

		/* 중복 제거 */

//		int[] arr = { 1, 1, 1, 2, 3 };
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					arr[i] = 0;
//					break;
//				}
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		/* 중복 재입력 */

//		int[] arr = new int[5];
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("배열에 넣을 " + (i + 1) + " 번 째 값을 입력해 주세요. : ");
//			arr[i] = sc.nextInt();
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("이미 입력 되어있는 값 입니다. 다른 값을 입력해주세요. ");
//					i--;
//					break;
//				}
//			}
//		}
//		
//		sc.close();
//
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		/* 2차원 배열 */

//		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

//		int[][] arr = new int[3][3];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print("배열에 넣을 원하는 정수를 입력해주세요. : ");
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		sc.close();
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println("");
//		}

//		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
//		int garosum = 0;
//		int serosum = 0;
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				garosum += arr[i][j];
//			}
//			System.out.print(garosum+" ");
//			garosum = 0;
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				serosum += arr[j][i];
//			}
//			System.out.print(serosum+" ");
//			serosum = 0;
//		}

	}

}
