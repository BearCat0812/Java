package project_05_19;

class CellPhone {

	String model;
	String color;

	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원을 켭니다");
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
	}

	void bell() {
		System.out.println("벨이 울립니다");
	}

}

/* class 자식클래스 extends 부모클래스 {} */
/* 오버라이드 or 오버라이딩 */
/* 메서드를 재정의 => 부모 클래스의 메서드를 자식클래스에서 재정의 */
/* @Override => 어노테이션 : 특별한 의미를 가지며 동작에 영향을 줄 수 있다 */
/* 1. 부모의 메서드와 동일한 형태 */
/* 2. 접근제한자를 바꿀 수 없다 */
/* 3. */

//class DmbCellPhone extends CellPhone {
//	DmbCellPhone(String model, String color) {
//		super(model, color);
//	}
//
//	@Override
//	void bell() {
//		System.out.println("벨 땡땡");
//	}
//}

//class Animal {
//	String name;
//
//	void sound() { // 추상화
//
//	}
//
//}
//
//class Dog extends Animal {
//
//	@Override
//	void sound() {
//		System.out.println("멍멍");
//	}
//
//}
//
//class Cat extends Animal {
//	
//	@Override
//	void sound() {
//		System.out.println("야옹");
//	}
//
//}

public class Ex_16 {

	public static void main(String[] args) {
////		DmbCellPhone phone = new DmbCellPhone();
//		DmbCellPhone phone = new DmbCellPhone("갤럭시", "흰색");
//
////		phone.model = "갤럭시";
//		System.out.println(phone.model);
////		phone.color = "흰색";
//		System.out.println(phone.color);
//		phone.powerOn();
//		phone.powerOff();
//		phone.bell();

		/* Animal 클래스 생성 => name 필드, sound() 메서드 생성 */
		/* Dog 클래스 생성 => Animal 클래스 상속 받기 => sound() 오버라이딩해서 멍멍 출력 */
		/* Cat 클래스 생성 => Animal 클래스 상속 받기 => sound() 오버라이딩해서 야옹 출력 */
		/* Dog를 이용한 객체 => sound() 출력 => 멍멍 */
		/* Cat를 이용한 객체 => sound() 출력 => 야옹 */

//		Dog d = new Dog();
//		Cat c = new Cat();
//
//		d.sound();
//		c.sound();
//
//		Dog d2 = new Dog();
//		d2.sound();
	}

}
