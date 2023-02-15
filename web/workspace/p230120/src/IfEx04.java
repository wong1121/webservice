import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {

		// 사용자가 입력한 정수를 짝수, 홀수 구분하여 출력
		// 1. scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 1개 입력
		System.out.print("정수 1개 입력하세요... ");
		int user_value = input.nextInt();
		
		// 3. 짝수, 홀수 구분하여 출력 > 2로 나눈 '나머지 값을 보는 거다.
		// 입력한 값은 짝수입니다. or 입력한 값은 홀수입니다. = 조건이 2개
//		if(user_value % 2 == 0) {
//			System.out.println("입력한 값은 짝수입니다");
//		} else {
//			System.out.println("입력한 값은 홀수잆니다");
//		}
		
		
		//아래와 같은 코드도 나올 수 있다.
		
		
		//3-1. [if문] 짝수, 홀수 구분
//		String result = "";
//		
//	
//		if(user_value % 2 == 0)
//			result = "짝수";
//		else
//			result = "홀수";
		
		//3-2. [삼항연산자=조건연산자] 짝수, 홀수 구분 > 와 같이 조건이 단순할 때 잘 좋다.
		//변수 = (조건식) ? true일 때 : false일 때 ; 
		String result = (user_value % 2 == 0) ? "짝수" : "홀수";
		
		
		
		//.4 출력
		System.out.println("입력한 값은 " + result + "입니다");
			 
		
		
		
		
	}

}
