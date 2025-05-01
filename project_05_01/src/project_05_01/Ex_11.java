package project_05_01;

import java.util.*;

//class Person {
//	String name;
//	int age;
//}

//class Calc {
//
//	int a = 2;
//	int b = 1;
//
//	public int Plus(int a, int b) {
//		return a + b;
//	}
//
//	public int Minus(int a, int b) {
//		return a - b;
//	}
//
//	public int Multiplication(int a, int b) {
//		return a * b;
//	}
//
//	public int Division(int a, int b) {
//		return a / b;
//	}
//
//	public int Remainder(int a, int b) {
//		return a % b;
//	}
//
//	public int Add() {
//		System.out.println(a + b);
//		return a + b;
//	}
//
//	public int Add(int a, int b) {
//		System.out.println(a + b);
//		return a + b;
//	}
//}

//class C {
//	int a;
//
//	public void A(int d, int f) {
//		int a;
//		a = d;
//		this.a = f;
//	}
//}

//class Student {
//	private String name;
//	private int age;
//	
//	Student(String name, int age) {
//		this.name=name;
//		this.age=age;
//	}
//	
//	public String GetName() {
//		return this.name;
//	}
//	
//}

//class Book {
//	private String title;
//	private int price;
//
//	public void Book(String t, int p) {
//		this.title = t;
//		this.price = p;
//	}
//
//	public String GetTitle() {
//		System.out.println(this.title);
//		return this.title;
//	}
//
//	public String SetTitle(String t) {
//		this.title = t;
//		return this.title;
//	}
//
//	public int GetPrice() {
//		System.out.println(this.price);
//		return this.price;
//	}
//
//	public int SetPrice(int p) {
//		this.price = p;
//		return this.price;
//	}
//
//}

public class Ex_11 {

	public static void main(String[] args) {

		/* 클래스명 객체명 = new 클래스명(); */

//		Person a = new Person();
//
//		/* 객체명.속성명 */
//		a.name = "이동준";
//		a.age = 27;
//
//		System.out.println(a.name);
//		System.out.println(a.age);
//
//		Person b = new Person();
//		b.name = "정채원";
//		b.age = 27;
//
//		System.out.println(b.name);
//		System.out.println(b.age);

		/* 접근 제한자 */
		/* public -> 기본 */
		/* private -> 같은 클래스 내 */
		/* protected -> 자기 자신, 상속 받은 클래스 */

		/* 클래스 반환 타입과 리턴 값 타입이 일치해야 함 */
		/* return x => void */
		/* 매개변수 x => () */

//		Calc c = new Calc();
//
//		System.out.println(c.Plus(10, 20));
//		System.out.println(c.Minus(10, 20));
//		System.out.println(c.Multiplication(10, 20));
//		System.out.println(c.Division(10, 20));
//		System.out.println(c.Remainder(10, 20));
//
//		c.Add();
//		c.Add(10, 20);

//		Calc c = new Calc();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("첫 번째 수를 입력해주세요. : ");
//		int num1 = sc.nextInt();
//
//		System.out.print("연산자를 입력해주세요. : ");
//		String op = sc.next();
//
//		System.out.print("두 번째 수를 입력해주세요 : ");
//		int num2 = sc.nextInt();
//
//		sc.close();
//		
//		if (op.equals("+")) {
//			System.out.println(c.Plus(num1, num2));
//		} else if (op.equals("-")) {
//			System.out.println(c.Minus(num1, num2));
//		} else if (op.equals("*")) {
//			System.out.println(c.Multiplication(num1, num2));
//		} else if (op.equals("/")) {
//			System.out.println(c.Division(num1, num2));
//		} else if (op.equals("%")) {
//			System.out.println(c.Remainder(num1, num2));
//		}

		/* 생성자 */
		/* this.a */
		
		/* 생성자로 접근 제어 */

//		Book book = new Book();
//
//		String a = "JAVA";
//		int b = 10000;
//
//		book.Book(a, b);
//		book.GetTitle();
//		book.GetPrice();
//
//		System.out.println();
//
//		System.out.println(book.GetTitle());
//		System.out.println(book.GetPrice());
		
		/* Get, Set으로 접근 제어 */
		
//		Book book = new Book();
//
//		String a = "JAVA";
//		int b = 10000;
//		
//		book.SetTitle(a);
//		book.SetPrice(b);
//		
//		System.out.println(book.GetTitle());
//		System.out.println(book.GetPrice());

	}

}
