import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userValue = 0;
		int factorial = 1;
		
//		while(true) {
//			System.out.print("1~10 정수 사이 입력 : ");
//			userValue = input.nextInt();
//			
//			if(userValue <= 10) {
//				break;
//				
//			}
//		}
		
		
		// 1. 반복문 :  정수 1개 입력
		do {
			System.out.print("1~10 정수 사이 입력 : ");
			userValue = input.nextInt();
		}while(userValue < 1 || userValue > 10); // true 조건
		
		// 2. 팩토리얼 계산
		for(int i=1; i<=userValue; i++)
			factorial = factorial * i;
		
		// 3. 팩토리얼 출력
		System.out.println(userValue + "! = " + factorial);
		input.close();
		// 2. 팩토리얼 계산
		for(int i=1; i<=userValue; i++)
			factorial = factorial * i;
		
		// 3. 팩토리얼 출력
		System.out.println(userValue + "! = " + factorial);
		input.close();
	}
}
