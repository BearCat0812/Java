package project_05_19;

interface Pet {
	void sound();

	void eat();
}

/* 1번 interface */
/* implements */
/* 강제성 -> 모든 메서드가 추상이고 규칙만 정의 */

class Dog implements Pet {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void eat() {
		System.out.println("개 사료를 먹습니다");
	}
}

/* 2번 abstract */
/* extends */
/* 일부 기능만 구현하고 나머지는 추상화하고 싶을 때 -> 일부는 공통이고 나머지를 추상 */
//abstract class Cat implements Pet {
//	@Override
//	public void sound() {
//		System.out.println("야옹");
//	}
//
//	@Override
//	public void eat() {
//		System.out.println("고양이 사료를 먹습니다");
//	}
//
//	public abstract void age();
//}
//
//class MyCat extends Cat {
//	@Override
//	public void age() {
//		System.out.println("내 고양이");
//	}
//}

interface RemoteControl {
	void turnOn();

	void turnOff();
}

class TV implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다");
	}

}

class AirCon implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다");
	}

}

public class Ex_17 {

	public static void main(String[] args) {
//		Dog d = new Dog();
//
//		d.sound();
//		d.eat();
//		
//		MyCat c = new MyCat();
//		c.sound();
//		c.eat();
//		c.age();

		/* interface => RemoteControl => void 형태 turnOn(), turnOff() */
		/* TV, AirCon 클래스 => RemoteControl 상속 받기 => 각 클래스에서 turnOn과 turnOff */
		/* TV 클래스의 경우 => TV 전원을 켭니다, TV 전원을 끕니다 */
		/* AirCon 클래스의 경우 => 에어컨을 켭니다, 에어컨을 끕니다 */

		TV tv = new TV();

		tv.turnOn();
		tv.turnOff();

		AirCon aircon = new AirCon();

		aircon.turnOn();
		aircon.turnOff();

	}

}
