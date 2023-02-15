import java.util.Scanner;

public class QuizEx02_T {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computer =(int)(Math.random() * 10) +1;
		int userValue = 0;
		int count = 0;
		
//		2. 반복문 : 입력 -> 비교
		while(true) {
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();
			count++;
			
			if(computer >  userValue) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			}else if(computer < userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			}else
				break;
			
		}
		System.out.println("\n" + count + "번만에 정답입니다.");
		input.close();

	}
}
