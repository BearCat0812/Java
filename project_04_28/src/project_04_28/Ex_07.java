package project_04_28;

import java.util.*;

public class Ex_07 {

	public static void main(String[] args) {

//		System.out.println("Hello JAVA");

//		int i = 1;
//		float f = 2;
//		char c = 'c';
//		String s = "string";
//		boolean b = true;
//
//		System.out.println(i);
//		System.out.println(f);
//		System.out.println(c);
//		System.out.println(s);
//		System.out.println(b);

//		int a = 1;
//		double b = 1;
//		String c;
//
//		System.out.print(a);
//		System.out.println("a = " + a);
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("입력 정수 : ");
//		a = sc.nextInt();
//		System.out.print("입력 실수 : ");
//		b = sc.nextDouble();
//		System.out.print("입력 문자열 : ");
//		c = sc.next();
//
//		sc.close();
//
//		System.out.println("출력 정수 : " + a);
//		System.out.println("출력 실수 : " + b);
//		System.out.println("출력 문자열 : " + c);

//		float f = (float) 12.15;
//		int i = 1;
//		String s = "123";
//
//		System.out.println((int) f + i);
//
//		System.out.println(Integer.parseInt(s) + i);

//		Scanner sc = new Scanner(System.in);
//
//		String str;
//
//		System.out.print("입력 값 : ");
//		str = sc.next();
//
//		System.out.println("출력 값 : " + (Integer.parseInt(str) + 1));
//
//		sc.close();

//		int a = 3;
//		int b = 5;
//
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a - b = " + (a - b));
//		System.out.println("a * b = " + (a * b));
//		System.out.println("a / b = " + (a / b));
//		System.out.println("a % b = " + (a % b));
//
//		System.out.println(a > 0 && a < 5);
//		System.out.println(b > 0 && b < 5);

//		int i = 1;
//
//		System.out.println(++i * i++);

////		int x = 10;
////		int y = 20;
////		int z = x++ + y--;
//
////		int x = 10;
////		int y = 20;
////		int z = ((x + y) == 30) ? x++ : y++;
//
////		System.out.println(x);
////		System.out.println(y);
////		System.out.println(z);

//		int money;
//		int change;
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("금액을 입력하세요 : ");
//		money = sc.nextInt();
//
//		sc.close();
//
//		change = money / 50000;
//		System.out.println("오만원 : " + change + " 장");
//		money = money % 50000;
//
//		change = money / 10000;
//		System.out.println("만원 : " + change + " 장");
//		money = money % 10000;
//
//		change = money / 5000;
//		System.out.println("오천원 : " + change + " 장");
//		money = money % 5000;
//
//		change = money / 1000;
//		System.out.println("천원 : " + change + " 장");
//		money = money % 1000;
//
//		change = money / 500;
//		System.out.println("오백원 : " + change + " 개");
//		money = money % 500;
//
//		change = money / 100;
//		System.out.println("백원 : " + change + " 개");
//		money = money % 100;
//
//		change = money / 50;
//		System.out.println("오십원 : " + change + " 개");
//		money = money % 50;
//
//		change = money / 10;
//		System.out.println("십원 : " + change + " 개");
//		money = money % 10;

//		Scanner sc = new Scanner(System.in);
//
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//
//		System.out.print("2진수로 변환할 10진수를 입력하세요 : ");
//		int num = sc.nextInt();
//
//		sc.close();
//
//		while (true) {
//			if (num == 0) {
//				break;
//			}
//			arr.add(num % 2);
//			num = num / 2;
//		}
//		System.out.println(arr.reversed());

//		int six = 6;
//
//		String bi = "";
//
//		while (six > 0) {
//			bi = (six % 2) + bi;
//			six = six / 2;
//		}
//
//		System.out.println(bi);
//
//		int a = (((six / 2) / 2) % 2);
//		int b = ((six / 2) % 2);
//		int c = (six % 2);
//
//		System.out.print(a);
//		System.out.print(b);
//		System.out.println(c);
//
//		String str1 = Integer.toString(a);
//		String str2 = Integer.toString(b);
//		String str3 = Integer.toString(c);
//
//		System.out.println(str1 + str2 + str3);

//		int x = 0;
//
//		switch (x) {
//
//		case 0:
//			System.out.print("x = 0 입니다.");
//			break;
//		case 1:
//			break;
//		case 2:
//			break;
//		default:
//		}

//		int x = 0;
//
//		if (x == 0) {
//			System.out.print("x = 0 입니다.");
//		} else if (x == 1) {
//
//		} else if (x == 2) {
//
//		} else {
//
//		}

//		Scanner sc = new Scanner(System.in);
//
//		int score;
//
//		System.out.print("점수를 입력해주세요. : ");
//		score = sc.nextInt();
//
//		sc.close();
//
//		if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else if (score < 60) {
//			System.out.println("F");
//		}

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("년도를 입력해주세요. : ");
//		int date = sc.nextInt();
//
//		sc.close();
//
//		if (((date % 4) == 0) && ((date % 100) != 0) || ((date % 400) == 0)) {
//			System.out.println("윤년입니다.");
//		} else {
//			System.out.println("윤년이 아닙니다.");
//		}

	}

}
