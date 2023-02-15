import java.util.Scanner;

public class WhildQuiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
			
		// 1. [입력] 정수 1 ~ 10 하나
		int userValue = 0;
		int random = (int)(Math.random() * 10) + 1;
		int count = 0;
		
		// 2. [반복] 랜덤값과 입력값 비교
		while(userValue != random) {
			System.out.print("1~10 정수 1개 입력하세요 >> ");
			input.nextInt();
			
			if(userValue > random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다");
			}else if (userValue < random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다");
			}
			count ++;
		}
		
		// 3. [출력] 실행 횟수
		System.out.println("\n" + count + "번만에 정답입니다.");
		input.close();
	}

}
