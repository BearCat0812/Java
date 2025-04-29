package project_04_29;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {

//		char ch = 'A';
//		System.out.print(ch == 'A');
//
//		Scanner sc = new Scanner(System.in);
//
//		String str = "Hello";
//		String str2 = sc.next();
//		String str3 = "Hello";
//
//		sc.close();
//
//		System.out.print(str == str2);
//		System.out.print(str == str3);

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("첫 번째 값을 입력해주세요. : ");
//		int first = sc.nextInt();
//
//		System.out.print("연산자를 입력해주세요. (+, -, *, /, %) : ");
//		String op = sc.next();
//
//		System.out.print("두 번째 값을 입력해주세요. : ");
//		int second = sc.nextInt();
//
//		sc.close();
//
////		if (op.equals("+")) {
////			System.out.println(first + " " + op + " " + second + " = " + (first + second));
////		} else if (op.equals("-")) {
////			System.out.println(first + " " + op + " " + second + " = " + (first - second));
////		} else if (op.equals("*")) {
////			System.out.println(first + " " + op + " " + second + " = " + (first * second));
////		} else if (op.equals("/")) {
////			System.out.println(first + " " + op + " " + second + " = " + (first / second));
////		} else if (op.equals("%")) {
////			System.out.println(first + " " + op + " " + second + " = " + (first % second));
////		}
//
//		switch (op) {
//		case "+":
//			System.out.println(first + " " + op + " " + second + " = " + (first + second));
//			break;
//
//		case "-":
//			System.out.println(first + " " + op + " " + second + " = " + (first - second));
//			break;
//
//		case "*":
//			System.out.println(first + " " + op + " " + second + " = " + (first * second));
//			break;
//
//		case "/":
//			System.out.println(first + " " + op + " " + second + " = " + (first / second));
//			break;
//
//		case "%":
//			System.out.println(first + " " + op + " " + second + " = " + (first % second));
//			break;
//		}

//		for (int i = 1; i < 6; i++) {
//			System.out.println("i = " + i);
//		}

//		int i = 0;
//		while (i < 3) {
//			System.out.println("i = " + i);
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("원하시는 단을 입력해주세요. : ");
//
//		int gugu = sc.nextInt();
//
//		sc.close();
//
//		for (int i = 1; i < 10; i++) {
//			System.out.println(gugu + " * " + i + " = " + (i * gugu));
//		}

//		int i = 0;
//
//		do {
//			System.out.println("i = " + i);
//			i++;
//		} while (i < 3);

//		int j = 2;
//
//		do {
//			System.out.println("j = " + j);
//			j++;
//		} while (j == 3);

//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println("i = " + i + " j = " + j);
//			}
//		}

////		for (int i = 1; i < 10; i++) {
////			for (int j = 1; j < 10; j++) {
////				System.out.println(i + " * " + j + " = " + (i * j));
////			}
////		}
//
////		int i = 1;
////		int j = 1;
////
////		while (i < 10) {
////			while (j < 10) {
////				System.out.println(i + " * " + j + " = " + (i * j));
////				j++;
////			}
////			j = 1;
////			i++;
////		}
//
////		int i = 1;
////
////		while (i < 10) {
////			for (int j = 1; j < 10; j++) {
////				System.out.println(i + " * " + j + " = " + (i * j));
////			}
////			i++;
////		}
//
////		int j = 1;
////
////		for (int i = 1; i < 10; i++) {
////			while (j < 10) {
////				System.out.println(i + " * " + j + " = " + (i * j));
////				j++;
////			}
////			j = 1;
////		}

		/* 1. 5x5 별 출력 */

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* 2. 순차 별 출력 */

//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* 3. x축 반전 별 출력 */

//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* 4. y축 반전 별 출력 */

//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* 5. x, y축 반전 별 출력 */

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 5 - i; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* 6. 피라미드 별 출력 */

//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			for (int k = 0; k < i - 1; k++) {
//				System.out.print("**");
//			}
//			System.out.println("");
//		}

//		for (int i = 0; i < 5; i++) {
//			for (int k = 0; k < 4 - i; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* 7. 마름모 별 출력 */

//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			for (int k = 0; k < i - 1; k++) {
//				System.out.print("**");
//			}
//			System.out.println("");
//		}
//
//		for (int i = 1; i < 6; i++) {
//			System.out.print(" ");
//			for (int k = 0; k < i - 1; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 9 - (2 * i); j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		/* 8. 피라미드 숫자 출력 */

//		for (int i = 1; i < 6; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print(k + 1);
//			}
//			for (int l = 1; l < i; l++) {
//				System.out.print(i - l);
//			}
//			System.out.println("");
//		}

	}

}
