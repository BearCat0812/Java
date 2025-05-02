package project_05_02;

//class A {
//	static int static_int = 0;
//
//	public static void show() {
//		System.out.println("스태틱 메소드 입니다.");
//	}
//
//}

//class Student {
//
//	static int total = 18;
//	int korean;
//	int math;
//	int rank;
//
//	public void show() {
//		System.out.println("2/" + total + "등 입니다");
//	}
//
//	public static void static_show() {
////		System.out.println(korean);
//		System.out.println(total);
//	}
//
//}

//class Static {
//	public int a = 20;
//	static int b = 10;
//}

public class Ex_12 {

//	public static int Fac(int n) {
//		System.out.println(n);
//		if (n == 1) {
//			return 1;
//		} else {
//			return n * Fac(n - 1);
//		}
//	}

//	public static String Show(int n) {
//		if (n == 1) {
//			return "1";
//		} else {
//			return n + Show(n - 1);
//		}
//	}

//	public static int PMFac(int n) {
//		if (n == 1) {
//			return n;
//		} else if (n % 2 == 0) {
//			return -n * PMFac(n - 1);
//		} else {
//			return n * PMFac(n - 1);
//		}
//	}

//	public static int compute(int num) {
//		if (num <= 1) {
//			return num;
//		} else {
//			return compute(num - 1) + compute(num - 3);
//		}
//	}

	public static void main(String[] args) {

		/* Static */
		/* 정적, 고정 */
		/* 객체 없이 사용 가능 */

		/* 클래스명 객체명 = new 클래스명(); */
		/* A a = new A() */
		/* a.show(); */
		/* A.show() */

//		A b = new A();
//		A c = new A();
//
//		System.out.println(b.static_int++);
//		System.out.println(b.static_int);
//		System.out.println(A.static_int);
//
//		A.static_int++;
//		System.out.println(b.static_int++);
//		System.out.println(++A.static_int);
//
//		c.static_int++;
//		System.out.println(c.static_int++);
//
//		int test = 0;
//
//		test++;
//		System.out.println(test++);
//		System.out.println(++test);
//		test++;
//		System.out.println(test);

//		Student s1 = new Student();
//		Student s2 = new Student();
//
//		s1.total--;
//		s2.total--;
//
//		System.out.println(s1.total);
//		System.out.println(s2.total);

//		int a;
//		a = 10;
//		Static.b = a;
//
//		Static st = new Static();
//
//		System.out.println(Static.b++);
//		System.out.println(st.b);
//		System.out.println(a);
//		System.out.println(st.a);

//		int a = 10;
//		Static.b = 15;
//		Static st = new Static();
//
//		System.out.println(st.b);
//		st.b = 10;
//		System.out.println(Static.b);

//		System.out.println(Fac(5));

//		System.out.println(Show(5));

		/* Fac n이 짝수면 음수로 곱하고 n이 홀수면 양수로 곱하기 */

//		System.out.println(PMFac(5));
//		System.out.println(PMFac(6));
		
//		System.out.println(compute(7));

	}

}
