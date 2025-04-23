package project_04_22;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		/* 변수: 데이터를 저장하는 공간 */
		/* x = 10; */
		/* 데이터 타입: 숫자형 데이터, 문자형 데이터 */
		
		/* 1) 숫자형 데이터: int(정수), float(실수), double(실수), long(실수) */
		
		/* 변수 이름 규칙 */
		/* 1. 영문자, 숫자, _, $만 사용가능. 단, 숫자로 시작할 수 없다. */
		/* 2. 이름에 공백이 표함될 수 없다. ex) my age(x) */
		/* 3. 자바의 예약어를 사용할 수 없다. */
		
		//* 한줄 주석: //, 문단 주석 : /*문단*/, 전체 드래그+ (ctrl+shift+/) */
		int num = 1;
		System.out.print(num);
		
		/* 2) 문자형 데이터: char(문자 하나), String(문자열) */
		char ch = 'a'; // char는 ''(홀따옴표)를 사용
		String str = "abc"; // String은 ""(쌍따옴표)를 사용

		System.out.println(ch);
		System.out.println(str);
		System.out.println("Hello Java");
		System.out.println("str: "+str);
		
		/* 입력: Scanner, 문자열(String): scan.next()한 단어, scan.nextline()한 줄 */
		/* 정수(int): scan.nextInt() */
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		System.out.println("입력한 숫자: "+number);
		
		System.out.print("이름을 입력하세요: ");
		String name = scan.next();
		System.out.println("이름: "+name);
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		System.out.print("나이: "+age);
		
		scan.close();
	}

}
