
public class TypeEX01 {

	public static void main(String[] args) {
		
		//정수형
		
		char ch1 = 97;
		System.out.println("ch1 : " + ch1);
		
		
		
		//실수형 (소수 몇 자리까지 '정확히' 나타내는지에 따라 사용함! = 유효 자릿수)
		//float - double(실수의 기본)
		//크기= 4   -   8
		//소수 '7 자리'까진 정확히 알려줌(0.1234567...) - '16 자리' 까지.
		
		double one = 2.34;
		System.out.println("one : " + one);
		
		//접미사 'F' - double은 필요없다. > 따로 설명
		float two = 2.34F;
		System.out.println("two : " + two);
		
		
		//논리형
		//boolean
		//   1
		// true / false  >   1 / 0 ( 2진수 값 -> 논리값) 
		boolean value = true;
		System.out.println("value : " + value);
		
		
		//참조형
		//Reference type : class (도 자료형(참조형)이다. <<얘도 Type이었어.)
		String str = "즐거운 하루";
		System.out.println("문자열 출력 : " + str);
	

	}

}
