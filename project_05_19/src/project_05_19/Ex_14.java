package project_05_19;

import java.util.*;

class Student {

	/* 속성(필드) */
	/* 기능(메서드){함수} */
	/* 생성자 : 객체 생성 시 초기값 */

}

class Car {

	/* Car 클래스의 속성 */
	/* 속성 접근 : 객체명.속성 */
	/* 메서드 접근 : 객체명.메서드 */
	String company = "KG 모빌리티";
	String model = "티볼리";
	String color = "흰색";
	int maxSpeed = 350;
	int speed;

	/* 생성자 */
	Car(String company, String model, String color) {

		this.company = company;
		this.model = model;
		this.color = color;

	}

	/* 메서드 */
	/* 접근제한자 반환타입 메서드이름(매개변수){코드} */
	void go() {
		System.out.println("자동차가 출발합니다.");
	}

}

class Member {

	String name;
	String id;

	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

}

public class Ex_14 {

	public static void main(String[] args) {

//		Student s1 = new Student();
//		System.out.println("s1 변수가 Student 객체를 참조합니다.");
//
//		Student s2 = new Student();
//		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

//		Car myCar = new Car();
//		System.out.println("제작 회사 : " + myCar.company);
//		System.out.println("모델명 : " + myCar.model);
//		System.out.println("색깔 : " + myCar.color);
//		System.out.println("최고 속도 : " + myCar.maxSpeed);
//		System.out.println("현재 속도 : " + (myCar.speed + 1));
//
//		myCar.speed = 60;
//		System.out.println("현재 속도 : " + myCar.speed);

//		Car myCar = new Car("현대", "코나", "흰색");
//
//		System.out.println("제작 회사 : " + myCar.company);
//		System.out.println("모델명 : " + myCar.model);
//		System.out.println("색깔 : " + myCar.color);
//
//		myCar.go();

		Member user1 = new Member("홍길동", "hong");
		/* 생성자에서 name 필드, id 필드를 외부에서 받은 값으로 초기화 할 수 있도록 클래스 작성 */
		/* Member 클래스 */
		System.out.println("Name : "+user1.name);
		System.out.println("ID : "+user1.id);
		
		/* name, id를 Scanner를 이용해서 입력받고 그 값을 이용해서 user2라는 객체를 생성 */
		/* a = 입력받은 name, b = 입력받은 id */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요 : ");
		String a = sc.next();
		
		System.out.print("아이디를 입력해 주세요 : ");
		String b = sc.next();

		sc.close();
		
		Member user2 = new Member(a, b);
		
		System.out.println("Name : "+user2.name);
		System.out.println("ID : "+user2.id);


	}

}
