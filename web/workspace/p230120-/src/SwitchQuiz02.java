import java.util.Scanner;

public class SwitchQuiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("정수 2개를 입력하시오... ");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		
		System.out.print("사칙연산(+,-,*,/) 중 하나를 입력하시오. ");
		String operator = input.next();
		
		String expression = valueOne + operator + valueTwo + "=";
		
		//출력] 식과 결과값
		switch (operator) {
		case "+":
			System.out.println(expression + (valueOne + valueTwo));
			break;
		case "-":
			System.out.println(expression + (valueOne - valueTwo));
			break;
		case "*":
			System.out.println(expression + (valueOne * valueTwo));
			break;
		case "/":
			System.out.println(expression + (valueOne / valueTwo));
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨군요!");	
		}
		
	}

}

