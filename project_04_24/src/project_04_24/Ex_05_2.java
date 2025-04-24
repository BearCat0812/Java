package project_04_24;

import java.lang.Math;
import java.util.*;

public class Ex_05_2 {

	public static void main(String[] args) {
		
		/* 배열, 랜덤, 사용자가 번호 배열(Scanner), 반복문(if 번호 비교) */
		/* 로또 번호 6자리 배열의 길이 6, 로또 번호 1~45 (랜덤) */
				
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		int[] me = new int[6];
//		int[] lotto = new int[6];
//		int n = 0;
//		
//		for(int i = 0 ; i < me.length ; i++) {
//			n++;
//			System.out.print("1과 45 사이의 원하시는 "+n+"번째 로또 번호를 입력해주세요 : ");
//			me[i] = sc.nextInt();
//			if (me[i]<1 || me[i]>45) {
//				System.out.println("입력 범위를 벗어났습니다. 1과 45 사이의 숫자를 입력해주세요.");
//				i--;
//				n--;
//			}
//			
//			for(int j=0 ; j < i ; j++) {
//				if (me[i]==me[j]) {
//					System.out.println("중복 값이 있습니다. 다시 입력해 주세요.");
//					i--;
//					n--;
//				}
//			}
//		}
//		
//		sc.close();
//		
//		n = 0;
//		
//		for(int i = 0 ; i < lotto.length ; i++) {
//			lotto[i] = rand.nextInt(45) + 1;
//			for(int j = 0 ; j < i ; j++) { // 중복 제거
//				if (lotto[i]==lotto[j]) {
//					i--;
//				}
//			}
//		}
//		
//		Arrays.sort(me); // 내 번호 순차 정렬
//		Arrays.sort(lotto); // 로또 번호 순차 정렬
//		
//		for(int i = 0 ; i < me.length ; i++) {
//			for(int j = 0; j < lotto.length ; j++) {
//				if (me[i]==lotto[j]) {
//					n++;
//					System.out.println("입력한 번호와 "+n+"개가 일치합니다.");
//				}
//			}
//		}
//		
//		System.out.print("당신의 로또 번호 :	");
//		
//		for(int i = 0 ; i < me.length ; i++) {
//			System.out.print("	"+me[i]+"	");
//		}
//		
//		System.out.println("");
//		System.out.print("이번 주의 로또 번호 :	");
//
//		for(int i = 0; i < lotto.length ; i++) {
//			System.out.print("	"+lotto[i]+"	");
//		}
		
		/* 숫자 야구 게임 (1~9, 중복 없음) */
		/* 1~9 사이 중복없는 랜덤 숫자 3개 배열에 입력 */
		/* 사용자가 3개의 숫자를 입력해서 배열에 입력 */
		/* 위치의 숫자가 맞으면 스트라이크, 숫자만 맞으면 볼 */
		/* ex) com = {1, 6, 7}, user = {1, 7, 6} */
		/* 1 스트라이크 2 볼 */
		/* 3 스트라이크 종료 */
		
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		int[] user = new int[3];
//		int[] com = new int[3];
//		int n = 0;
//		int kai = 1;
//		int rkai = 1;
//		int strike = 0;
//		int ball = 0;
//		String st = new String();
//		
//		for(int i = 0 ; i < com.length ; i++) {
//			com[i] = rand.nextInt(9) + 1;
//			for(int j = 0 ; j < i ; j++) { // 중복 제거
//				if (com[i]==com[j]) {
//					i--;
//				}
//			}
//		}
//		
//		while(true) {
//			
//			if(kai%2==1) {
//				st="초";
//			}else if (kai%2==0) {
//				st="말";
//			}
//			
//			System.out.println(rkai+"회 "+st+" 입니다.");
//			System.out.println("");
//			for(int i = 0 ; i < user.length ; i++) {
//				n++;
//				System.out.print("1과 9 사이의 원하시는 "+n+"번째 번호를 입력해주세요 : ");
//				user[i] = sc.nextInt();
//		
//				if (user[i]<1 || user[i]>9) {
//					System.out.println("입력 범위를 벗어났습니다. 1과 9 사이의 숫자를 입력해주세요.");
//					i--;
//					n--;
//				}
//		
//				for(int j=0 ; j < i ; j++) {
//					if (user[i]==user[j]) {
//						System.out.println("중복 값이 있습니다. 다시 입력해 주세요.");
//						i--;
//						n--;
//					}
//				}
//			}
//			
//			n = 0;
//		
//			for(int i = 0 ; i < user.length ; i++) {
//				for(int j = 0 ; j < com.length ; j++) {
//					if ((user[i] == com[j]) && i == j) {
//						strike++;
//					}else if (user[i] == com[j]) {
//						ball++;
//					}
//				}
//			}
//			
//			System.out.println("");
//			System.out.println(strike+" 스트라이크 "+ball+" 볼 입니다.");
//			System.out.println("");
//			
//			if(strike == 3) {
//				System.out.println("3 스트라이크! 당신의 승리입니다.");
//				break;
//			}else if (kai > 17){
//				System.out.println("9회 말 종료! 당신의 패배입니다.");
//				break;
//			}else {
//				strike = 0;
//				ball = 0;
//				kai++;
//				if(kai%2==1) {
//					rkai++;
//				}
//			}
//		
//		}
//		
//		System.out.print("당신의 숫자 :	");
//		for (int i = 0; i < user.length ; i++) {
//			System.out.print(user[i]+"	");
//		}
//		System.out.println("");
//	
//		System.out.print("상대의 숫자 :	");
//		for (int i = 0; i < com.length ; i++) {
//			System.out.print(com[i]+"	");
//		}
//		System.out.println("");
//		sc.close();
		
		/* Scanner와 연산자, 조건문(if) */
		/* 계산기 */
		/* 첫 번째 수를 입력하세요: 1, 연산자를 입력하세요: , 두 번째 수를 입력하세요: 2, 결과값: 3 */
		
//		Scanner sc = new Scanner(System.in);
//		int first = 0;
//		int second = 0;
//		String sign = null;
//
//		System.out.print("첫 번째 수를 입력하세요 : ");
//		first = sc.nextInt();
//		
//		System.out.print("연산자를 입력하세요 : ");
//		sign = sc.next();
//		
//		System.out.print("두 번째 수를 입력하세요 : ");
//		second = sc.nextInt();
//
//		if(sign.equals("+")) { // equals() 말고 charAt() 사용하는 방법도 있음
//			System.out.println(first+" "+sign+" "+second+" = "+ (first + second));
//		}else if(sign.equals("-")) {
//			System.out.println(first+" "+sign+" "+second+" = "+ (first - second));
//		}else if(sign.equals("*")) {
//			System.out.println(first+" "+sign+" "+second+" = "+ (first * second));
//		}else if(sign.equals("/")) {
//			System.out.println(first+" "+sign+" "+second+" = "+ (first / second));
//		}else if(sign.equals("%")) {
//			System.out.println(first+" "+sign+" "+second+" = "+ (first % second));
//		}else {
//			System.out.println("정확한 연산자를 입력해주세요.");
//		}
//		
//		sc.close();
		
		/* 숫자 맞추기 게임 */
		/* 랜덤으로 1~100 까지 */
		/* 사용자가 수를 입력 => 랜덤 숫자와 비교 => 맞으면 종료, 아니면 Up, Down 표시 */
		/* 맞을때까지 무한 반복, 시행 횟수도 출력 or 기회 5번 */
		
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		int num = 0;
//		int kai = 1;
//		int min = 1;
//		int max = 100;
//		int op = 5;
//		
//		int randnum = rand.nextInt(100) + 1;
//		
//		while(true) {
//			
//			System.out.println(kai+"회째 입니다.");
//			System.out.println("");
//			
//			System.out.print(min+" 이상 "+max+" 이하의 번호를 "+op+" 번 만에 맞춰보세요! : ");
//			num = sc.nextInt();
//			System.out.println("");
//
//			if(num==randnum) {
//				System.out.println("축하드립니다! 정답입니다! "+kai+" 번 만에 맞추셨습니다!");
//				System.out.println("");
//				break;
//			}else if (num>randnum){
//				System.out.println("DOWN!");
//				System.out.println("");
//				max = num - 1;
//				kai++;
//				op--;
//			}else if (num<randnum) {
//				System.out.println("UP!");
//				System.out.println("");
//				min = num + 1;
//				kai++;
//				op--;
//			}
//			if (op == 0) {
//				System.out.println("실패하셨습니다. 수고하셨습니다.");
//				System.out.println("");
//				break;
//			}
//			
//		}
//	
//		System.out.print("상대의 숫자 :	");
//		System.out.print(randnum);
//		System.out.println("");
//		sc.close();
		
		/* 1. 사용자의 키, 몸무게 입력 받기. 단, 키는 단위가 m ex) 180cm = 1.8m */
		/* BMI = 몸무게/키 * 키 */
		/* BMI가 18.5 미만 저체중, 18.5 이상 23미만 정상, 23이상 25미만 과체중, 25이상 비만 */
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("키를 입력해주세요. (단위 m) : ");
//		double m = sc.nextDouble();
//		
//		System.out.print("몸무게를 입력해주세요. (단위 kg) : ");
//		double kg = sc.nextDouble();
//		
//		sc.close();
//
//		double BMI = kg / (m * m);
//		
//		if (BMI<18.5) {
//			System.out.println("저체중입니다.");
//		}else if (18.5<=BMI&&BMI<23) {
//			System.out.println("정상입니다.");
//		}else if (23<=BMI&&BMI<25) {
//			System.out.println("과체중입니다.");
//		}else if (25<=BMI) {
//			System.out.println("비만입니다.");
//		}
//		
//		sc.close();
		
		
		/* 2. 화폐 단위 계산 */
		/* 가격이 6850원 => 만원 0개, 오천원 1개, 천원 1개, 오백원 1개, 백원 3개, 오십원 1개, 십원 0개 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("얼마를 계산해드릴까요? (10원 단위) : ");
//		int money = sc.nextInt();
//		int cash = 0;
//		sc.close();
//		
//		if(money != 0) {
//			cash = money/10000;
//			System.out.println("만원 "+cash+"개");
//			money = money%10000;
//			
//			cash = money/5000;
//			System.out.println("오천원 "+cash+"개");
//			money = money%5000;
//			
//			cash = money/1000;
//			System.out.println("천원 "+cash+"개");
//			money = money%1000;
//			
//			cash = money/500;
//			System.out.println("오백원 "+cash+"개");
//			money = money%500;
//			
//			cash = money/100;
//			System.out.println("백원 "+cash+"개");
//			money = money%100;
//			
//			cash = money/50;
//			System.out.println("오십원 "+cash+"개");
//			money = money%50;
//			
//			cash = money/10;
//			System.out.println("십원 "+cash+"개");
//		}else {
//			System.out.print("잘못된 값입니다. 다시 입력해주세요.");
//		}

		/* 피보나치수열 계산 hint(배열 사용) */
		/* 사용자가 입력한 갯수만큼 수열의 수 구하기 */
		/* ex) 사용자가 5를 입력 => 1, 2, 3, 5, 8, 사용자가 7을 입력 => 1, 2, 3, 5, 8, 13, 21 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력해주세요 : ");
//		int num = sc.nextInt();
//		System.out.println("");
//		
//		int[] arr= new int[num];
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			
//			if(i == 0) {
//				arr[i] = 1;
//			}else if(i==1) {
//				arr[i] = arr[0] + arr[0];
//			}else if(i>=2) {
//				arr[i]=arr[i-1] + arr[i-2];
//			}
//		}
//		
//		System.out.print(num+"개의 피보나치 수열 : ");
//		for(int i = 0; i < arr.length ; i++) {
//			System.out.print(arr[i]+"	");
//		}
//		System.out.println("");
//
//		sc.close();

	}

}
