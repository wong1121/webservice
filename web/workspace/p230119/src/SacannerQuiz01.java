import java.util.Scanner;



public class SacannerQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 정수 2개를 입력 받은 후, 덧셈 결과를 출력하시오.
		 * 
		 * 출력 문구 : 정수 2개를 입력하세요.
		 * 
		 */
		
		
		//1. Scanner 객체 생성 = 하나만 생성 후 'input' 여러번 사용!
		Scanner input = new Scanner(System.in);
		
		//2. 정수 2개 입력
		System.out.print("정수 2개 입력하세요 >>");
		int ValueOne = input.nextInt();
		int ValueTwo = input.nextInt();
		
		
		//3.덧셈 결과 출력 
		System.out.println("덧셈 결과 >> " + (ValueOne + ValueTwo));
		
					
	}

}
