import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수 범위 : ");
		int user_value = input.nextInt();
		
		char result = ' ';
		
		if(user_value >= 90 && user_value <= 100)
			result = 'A';
		else if(user_value >= 80)
			result = 'B';
		else if(user_value >= 70)
			result = 'C';
		else
			result = 'D';
			
		System.out.println("당신의 학점은 " +result+ " 입니다.");

	}

}
