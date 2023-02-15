import java.util.Scanner;

public class SwitchQuiz03 {
	public static void main(String[] args) {
		//자원할당 > input
		Scanner input = new Scanner(System.in);
		
		// 1. [입력]
		System.out.print("가위(1), 바위(2), 보(3) 중 하나 입력 >> ");
		int user = input.nextInt();
		
		// 2. [랜덤값]
		int computer = (int)(Math.random() *3) +1;
		
		// 3. [출력]
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴퓨터는 " + computer + "입니다.");
		
		// 4. [비교] : switch문
		switch(user-computer) {
		case 1: case -2:
			System.out.println("당신이 이겼다.");
			break;
		case 2: case -1:
			System.out.println("당신이 졌다.");
			break;
		case 0:
			System.out.println("우리 비겼다.");
		}
		
		//자원해제 > input 통로 해제
		input.close(); 
	}

}