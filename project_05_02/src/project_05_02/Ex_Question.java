package project_05_02;

import java.util.*;

//class Calc {
//	int Plus(int a, int b) {
//		return a + b;
//	}
//
//	int Minus(int a, int b) {
//		return a - b;
//	}
//}
//
//class Student {
//	String name;
//	int age;
//
//	void Student() {
//		System.out.println(this.name);
//		System.out.println(this.age);
//	}
//
//	String Student(String n) {
//		this.name = n;
//		return this.name;
//	}
//
//	int Student(int a) {
//		this.age = a;
//		return this.age;
//	}
//}
//
//class Book {
//	private String title;
//	private int price;
//
//	void setTitle(String s) {
//		this.title = s;
//	}
//
//	String getTitle() {
//		return this.title;
//	}
//
//	void setPrice(int p) {
//		this.price = p;
//	}
//
//	int getPrice() {
//		return this.price;
//	}
//}
//
//class BankAccount {
//	int money = 10000;
//
//	int Check() {
//		return this.money;
//	}
//
//	void deposit(int m) {
//		this.money += m;
//		System.out.println("입금이 확인되었습니다.");
//
//	}
//
//	void Withdrawal(int m) {
//		if (this.money < m) {
//			System.out.println("계좌에 잔액이 부족합니다.");
//		} else if (m < 0) {
//			System.out.println("음수는 입력이 불가능합니다.");
//		} else {
//			this.money -= m;
//			System.out.println("출금이 확인되었습니다.");
//		}
//
//	}
//}

public class Ex_Question {

	public static void main(String[] args) {

		/* 1. 정수 두 개를 입력받아 합을 출력하는 코드를 작성하시오. */

//		Scanner sc = new Scanner(System.in);
//
//		int num1, num2;
//
//		System.out.print("첫 번째 수를 입력해주세요. : ");
//		num1 = sc.nextInt();
//
//		System.out.print("두 번째 수를 입력해주세요. : ");
//		num2 = sc.nextInt();
//
//		sc.close();
//
//		System.out.println(num1 + num2);

		/* 2. 나이를 입력받고 나이가 20세 이상이면“성인” 아니면“미성년자”를 출력하는 코드를 작성하시오. */

//		Scanner sc = new Scanner(System.in);
//
//		int age;
//
//		System.out.print("나이를 입력해주세요. : ");
//		age = sc.nextInt();
//
//		sc.close();
//
//		if (age >= 20) {
//			System.out.print("성인");
//		} else {
//			System.out.print("미성년자");
//		}
//		

		/* 3. 1~100까지의 정수 중 짝수만 출력하는 코드를 작성하시오. */

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		/* 4. 1~100까지의 정수 중 홀수의 합을 출력하는 코드를 작성하시오. */

//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 1) {
//				sum += i;
//			}
//		}
//
//		System.out.println(sum);

		/* 5. 사용자로부터 1~9 사이의 수를 입력받아 해당하는 구구단을 작성하시오. */
		/* ex) 3입력 -> 3단출력 3x1=3 3x2=6 */

//		Scanner sc = new Scanner(System.in);
//
//		int dan;
//
//		System.out.print("원하시는 단을 입력해주세요. : ");
//
//		dan = sc.nextInt();
//
//		sc.close();
//
//		for (int i = 1; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}

		/* 6. 5명의 이름을 입력받아 배열에 저장한 뒤 모두 출력하는 프로그램을 작성하시오. */

//		Scanner sc = new Scanner(System.in);
//
//		String[] name = new String[5];
//
//		for (int i = 0; i < name.length; i++) {
//			System.out.print("배열에 넣을 이름을 입력해주세요. : ");
//			name[i] = sc.next();
//		}
//
//		sc.close();
//
//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}

		/* 7. 3x3 2차원 배열을 선언한 후 1부터 증가하는 수를 배열에 저장한 뒤 모두 출력하시오. */

//		int[][] arr = new int[3][3];
//
//		int num = 1;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = num++;
//				System.out.print(arr[i][j]+"	");
//			}
//			System.out.println();
//		}

		/* 8. 3x3 2차원 배열을 10,20,30,40,50,60,70,80,90을 순차적으로 저장한 후 모든 수의 합을 출력하시오. */

//		int[][] arr = new int[3][3];
//
//		int num = 1;
//		int sum = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = 10 * num++;
//				System.out.print(arr[i][j] + "	");
//				sum += arr[i][j];
//			}
//			System.out.println();
//		}
//
//		System.out.println("합계 : " + sum);

		/*
		 * 9. Calc 클래스를 만들고 두 수의 덧셈과 뺼셈을 수행하는 메서드를 만들고 두 수를 입력받아 해당 메서드를 실행시키는 코드를 작성하시오
		 */

//		Calc c = new Calc();
//
//		Scanner sc = new Scanner(System.in);
//
//		int num1;
//		int num2;
//
//		System.out.print("첫 번째 수를 입력해주세요. : ");
//		num1 = sc.nextInt();
//
//		System.out.print("두 번째 수를 입력해주세요. : ");
//		num2 = sc.nextInt();
//
//		sc.close();
//
//		System.out.println(c.Plus(num1, num2));
//		System.out.println(c.Minus(num1, num2));

		/* 10. Student 클래스를 생성자를 통해 이름과 나이를 저장한 후 출력하는 메서드를 구현하세요. */

//		Student s = new Student();
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("학생의 이름을 입력해주세요. : ");
//		s.Student(sc.next());
//
//		System.out.print("학생의 나이를 입력해주세요. : ");
//		s.Student(sc.nextInt());
//
//		sc.close();
//
//		System.out.println(s.name);
//		System.out.println(s.age);
//
//		s.Student();

		/* 11. 3x3 배열에 10,20,30,40,50,60,70,80,90을 순차적으로 저장한 후 행의 합과 열의 합을 출력하시오. */

//		int num = 1;
//		int garosum = 0;
//		int serosum = 0;
//
//		int[][] arr = new int[3][3];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = 10 * num++;
//				garosum += arr[i][j];
//			}
//			System.out.println((i + 1) + " 번째 가로 합 : " + garosum + " ");
//			garosum = 0;
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				serosum += arr[j][i];
//			}
//			System.out.println((i + 1) + " 번째 세로 합 : " + serosum + " ");
//			serosum = 0;
//		}

		/* 12. 5x5 배열을 모두 1로 채운 뒤 테두리를 제외한 곳은 0으로 채우고 출력하시오. */

//		int[][] arr = new int[5][5];
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = 1;
//				if (i >= 1 && i <= 3 && j >= 1 && j <= 3) {
//					arr[i][j] = 0;
//				}
//
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		/* 13. 1,4,9,2,5,7을 배열에 저장한 뒤 버블정렬을 하고 정렬된 배열을 출력하시오. */

//		int[] arr = { 1, 4, 9, 2, 5, 7 };
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < arr[i]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		/* 14. 2,9,4,1,6,3을 배열에 저장한 뒤 선택정렬을 하고 정렬된 배열을 출력하시오. */

//		int[] arr = { 2, 9, 4, 1, 6, 3 };
//
//		for (int i = 0; i < arr.length; i++) {
//			int min = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < arr[min]) {
//					min = j;
//				}
//				int temp = arr[min];
//				arr[min] = arr[i];
//				arr[i] = temp;
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		/* 15. 1,2,3,2,4,3,3,1을 배열에 저장한 뒤 중복제거를 통해 중복되는 값을 0으로 만든 뒤 배열을 출력하시오 */

//		int[] arr = { 1, 2, 3, 2, 4, 3, 3, 1 };
//
//		for (int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//			for (int j = i + 1; j < arr.length; j++) {
//				if (num == arr[j]) {
//					arr[j] = 0;
//				}
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		/*
		 * 16. Book 클래스를 만들고 private으로 title, price를 선언한 뒤 get/set 메서드를 통해 값을 설정하고
		 * 출력하시오.
		 */

//		Book b = new Book();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("제목을 입력해주세요. : ");
//		b.setTitle(sc.next());
//		
//		System.out.print("가격을 입력해주세요. : ");
//		b.setPrice(sc.nextInt());
//		
//		System.out.println("제목 : "+b.getTitle());
//		System.out.println("가격 : "+b.getPrice());
//
//		sc.close();

		/* 17. BankAccount 클래스를 만들어 잔액확인, 입금, 출금 메서드를 구현하시오( 음수 출금 불가) */

//		BankAccount ba = new BankAccount();
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("잔액 확인을 원하시면 1번, 입금을 원하시면 2번, 출금을 원하시면 3번을 입력해주세요. : ");
//		int function = sc.nextInt();
//
//		if (function == 1) {
//			System.out.println("계좌에 "+ba.Check()+" 원이 있습니다.");
//		} else if (function == 2) {
//			System.out.print("입금하실 금액을 입력해주세요. : ");
//			ba.deposit(sc.nextInt());
//			System.out.println("계좌에 "+ba.Check()+" 원이 있습니다.");
//		} else if (function == 3) {
//			System.out.print("출금하실 금액을 입력해주세요. : ");
//			ba.Withdrawal(sc.nextInt());
//			System.out.println("계좌에 "+ba.Check()+" 원이 있습니다.");
//		} else {
//			System.out.println("올바른 숫자를 다시 입력해주시기 바랍니다.");
//		}

		/* 18. 오른쪽아래에서 왼쪽 아래로 시작하는 5x5 달팽이관 배열을 구현하시오. */

//		int[][] arr = new int[5][5];
//
//		int num = 1;
//
//		int left = 0, right = 4, top = 0, bottom = 4;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = right; j >= left; j--) {
//				arr[bottom][j] = num++;
//			}
//			bottom--;
//			for (int k = bottom; k >= top; k--) {
//				arr[k][left] = num++;
//			}
//			left++;
//			for (int l = left; l <= right; l++) {
//				arr[top][l] = num++;
//			}
//			top++;
//			for (int m = top; m <= bottom; m++) {
//				arr[m][right] = num++;
//			}
//			right--;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + "	");
//			}
//			System.out.println();
//		}

		/* 19. 1101이란 2진수를 10진수로, 13이란 10진수를 2진수로 변환하는 코드를 작성하시오. */

//		int num1 = 1101;
//		int num2 = 13;
//
//		int sum = 0;
//
//		sum += num1 / 1000 * 8;
//		if (num1 / 1000 == 1) {
//			num1 -= 1000;
//		}
//
//		sum += num1 / 100 * 4;
//		if (num1 / 100 == 1) {
//			num1 -= 100;
//		}
//
//		sum += num1 / 10 * 2;
//		if (num1 / 10 == 1) {
//			num1 -= 10;
//		}
//
//		sum += num1 / 1 * 1;
//		if (num1 / 10 == 1) {
//			num1 -= 1;
//		}
//
//		System.out.println(sum);
//
//		System.out.print(num2 / 2 / 2 / 2 % 2);
//		System.out.print(num2 / 2 / 2 % 2);
//		System.out.print(num2 / 2 % 2);
//		System.out.print(num2 % 2);

	}

}
