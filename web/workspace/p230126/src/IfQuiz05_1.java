// F는 F로만 나오게 하는 법

import java.util.Scanner;

public class IfQuiz05_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char grade = ' ';
		char option = '0';
		
		//1. 점수 입력
		System.out.print("점수를 입력하세요. >> ");
		int score = input.nextInt();
		
		//option을 학점 위로 올려줌.
		if(score  % 10 >= 7 || score == 100)
			option = '+';
		else if (score % 10 <= 3)
			option = '-';
		
		//2. 학점 출력
		if(score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else
			grade = 'F';
			option = ' ';
		
		System.out.println("당신의 학점은 " + grade + option + "입니다.");
		
	}
}
