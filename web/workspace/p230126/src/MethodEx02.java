/*
 * [return 의미]
 * -메소드 실행 끝 >> 항상 (return 하단에 코드는 출력 안됨. 의미없다.)
 * -리턴값을 호출한 쪽으로 넘겨 줌 >> 코드에 따라 쓰거나 말거나.
 * -리턴 다음에 오는 '넘겨주는 값'은 하나!! >> 리턴은 기본적으로 하나!만 리턴한다.
 */

public class MethodEx02 {
	//method 정의 02==============
	//[형태2] 매개변수 있고, return값 있음
	//기능 : 인수 2개를 받은 후, 덧셈한 결과 리턴
	public static int sum(int num1, int num2) {
		int result = num1 + num2; //명령어;
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("<< main method 시작 >>");
		int sumResult = sum(2, 8);
		System.out.println("sum 호출 결과 >> " + sumResult);
		System.out.println("<< main method 종료 >>");
	}

}
