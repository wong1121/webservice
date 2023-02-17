package exception;

import java.util.Scanner;

/*
 * [예외] 처리
 * - try ~ catch ~ finally : 직접 처리 >> 순서 무조건 지켜야 함. try, finally는 각 1개씩만 올 수 있고, catch는 여러개 올 수 있따.
//		try {
//		      예외 발생 가능한 코드(중괄호 생략 불가능)  	
//		} catch(예외클래스명 참조변수) { // 엉뚱한 예외 클래스명은 쓰면 안되고 같은 타입의 클래스명을 작성해야 한다.
//			//예외 발생시 처리할 코드 
//		} finally {
//			//예외 발생 여부와 상관 없이, try 구문에 마지막에 무조건 실행영역 (있어도, 없어도 됨 >> 선택사항)
//		}
 * 
 * - throws : 예외 전가 
 * 
 * 
 */

public class Ex01 {
	public static void inputData() {
		System.out.println("inputData method 시작");
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int result1 = 0;  // try 영역 밖에서도 사용할 거라면 예외 구문 전에 이렇게 변수 선언, 영역 밖에서 사용 안 해도 된다면 try 내에 선언 가능 = 왜? try 안에 선언되면 지역변수가 된다. } 빠져나오면 사라지지.
		int result2 = 0;
		
//		예외처리 구문================================
		try {
			result1 = n1 / n2;
			result2 = n1 % n2;
			System.out.println("몫 : " + result1);
			System.out.println("나머지 : " + result2);
		} catch(ArithmeticException e) { // exception이 발생되는 순간 객체가 생성된다. 객체의 주소를 받는 참조변수(ArithmeticException e) 가 있는 catch를 찾아 옴.
//			예외 발생시 처리할 코드 >> exception이 발생하는 순간 이곳으로 넘어 옴
			System.out.println("분모가 0으로 계산 불능입니다.");
		} finally {
			System.out.println("예외처리 구문 실행 종료");
		}
		
		System.out.println("inputData method 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("메인메서드 시작");
		inputData();
		System.out.println("메인메서드 끝");
	}
}
