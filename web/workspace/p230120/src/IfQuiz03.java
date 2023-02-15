import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개 입력하세요 : ");
		
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		
		//수를 비교해 큰 값, 작은 값을 추출
		//같은 값은 처리 하지 않은 else if를 사용했기 때문에 같은 수를 넣으면 출력되는게 없음.
		
	
		if(valueOne > valueTwo) {
			System.out.println("큰 값 : " + valueOne + ", 작은 값 : " + valueTwo);
		} else if (valueOne < valueTwo) {
			System.out.println("큰 값 : " + valueTwo + ", 작은 값 : " + valueOne);	
		}
			
		
		//코드 줄인 ver.
		System.out.println("정수 2개를 입력하세요 : ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int max, min;
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		System.out.println("큰 값 : " + max + ", 작은 값 : " + min);
		

	}

}

