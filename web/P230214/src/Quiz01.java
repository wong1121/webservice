import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userValue = 0;
		int factorial = 1;
		
		while(true) {      
			System.out.print("1~10 정수 사이 입력 : ");
			userValue = input.nextInt();
			
			if(userValue <= 10) { // 1 ~ 10 정수 사이를 입력, 입력 가능 최저치도 정의해야함.
				break;
			}
		}
//		for(int i=1; i<=userValue; i++)   while문 종료 후 for문으로 factorial 구하는 반복문 시작.
//			factorial = factorial * i;
//		
//		System.out.println(userValue + "! = " + factorial);
//		input.close();  
	}
}
