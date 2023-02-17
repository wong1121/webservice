package exception;

import java.util.Scanner;

/*
 * [예외] 처리
 * - try ~ catch ~ finally : 직접 처리 >> 순서 무조건 지켜야 함. try, finally는 각 1개씩만 올 수 있고, catch는 여러개 올 수 있다.
//		try {
//		      예외 발생 가능한 코드(중괄호 생략 불가능)  	
//		} catch(예외클래스명 참조변수) { // 엉뚱한 예외 클래스명은 쓰면 안되고 같은 타입의 클래스명을 작성해야 한다.
//			//예외 발생시 처리할 코드 
//		} finally {
//			//예외 발생 여부와 상관 없이, try 구문에 마지막에 무조건 실행영역 (있어도, 없어도 됨 >> 선택사항)
//		}
 * 
 * - throws : 예외 전가 
 *  : 예외 발생은 항상 메소드 내 >> 예외 전가는 메서드 선언부에 위치.
 *  : 
 * 
 * 
 */

public class Ex02 {
	public static void inputData() throws ArithmeticException {
		System.out.println("inputData method 시작");
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int result1 = 0; 
		int result2 = 0;
		
		result1 = n1 / n2;
		result2 = n1 % n2;
		System.out.println("몫 : " + result1);
		System.out.println("나머지 : " + result2);
		
		System.out.println("inputData method 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("메인메서드 시작");
		try {
			inputData();
		} catch(ArithmeticException e) {
			System.out.println("메인메서드 _ 예외처리 >> 분모가 0으로 계산 불능");
		}
		
		System.out.println("메인메서드 끝");
	}
}
