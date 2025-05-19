package project_05_19;

/* 클래스 생성자에 대한 오버로딩 */
/* 클래스 -> 다형성 => 다양하게 */
/* 오버로딩 : 생성자 혹은 메서드의 이름은 같지만 매개변수의 개수나 형태가 다를 경우 */

class User {
	String name;
	String id;
	int age;

	User() {
	}

	User(String name) {
//		this.name = name;
		this(name, "Kim", 25);
	}

	User(String name, String id) {
//		this.name = name;
//		this.id = id;
		this(name, id, 25);

	}

	User(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

}

class Calc {

	public int Add(int a, int b) {
		return a + b;
	}

	public int Add(int a, int b, int c) {
		return a + b + c;
	}

	public int Add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}

class Printer {

	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg);
		}
	}

}

public class Ex_15 {

	public static void main(String[] args) {

//		User user1 = new User();
//		User user2 = new User("홍길동");
//
//		System.out.println("user2 id : " + user2.id);

		/* 계산기 */
		/* Calc 클래스 Add 메서드 */
		/* ex) public int Add() */
		/* 오버로딩을 통해서 숫자 두개 더하기, 숫자 세개 더하기, 숫자 네개 더하기 */

//		Calc c = new Calc();
//
//		System.out.println(c.Add(1, 2));
//		System.out.println(c.Add(3, 4, 5));
//		System.out.println(c.Add(1, 2, 3, 4));

		/* Printer 클래스 => print() 메서드를 생성 */
		/* print(String msg) => 문자열 1번 출력 */
		/* print(String msg, int count) => 문자열을 count 수 만큼 출력 */
		/* print("Bye", 3) => Bye를 3번 출력 */

		Printer p = new Printer();
		p.print("Bye");
		p.print("Bye", 3);

	}

}
