import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char grade = ' ';
		char option = '0';
		
		//1. 점수 입력
		System.out.print("점수를 입력하세요. >> ");
		int score = input.nextInt();
		
		//2. 학점 출력
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else
			grade = 'F';
		
		//효율성을 위해 해당값이 더 많은 것을 왼쪽에 둔다.
		//F의 option 값을 제외한 코드를 생각한다. 
		if(score  % 10 >= 7 || score == 100)
			option = '+';
		else if (score % 10 <= 3)
			option = '-';
		
		System.out.println("당신의 학점은 " + grade + option + "입니다.");
		
	}
}
