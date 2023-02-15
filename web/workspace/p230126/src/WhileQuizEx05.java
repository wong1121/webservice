import java.util.Scanner;

public class WhileQuizEx05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userNumber = 0;  //>> 변수선언은 반복문 밖으로.
		int sum = 0;         //>> 누적합용 > while 안에 있으면 매번 0으로 초기화 되기 때문에 밖에 있어야 함.
		//반복문 내에 반복 횟 수가 정해져 있으면 >> 1. while.
		//-1은 더하지 않고 종료의 의미로.
		//출력문 안에서 입출력 해야함.
		
		// 1. 반복문 : while
		while(true) {  //무한 반복문
			System.out.print("정수를 입력하시오(종료 -1) >> ");
			userNumber = input.nextInt();
			
			//1-2. 탈출 조건
			if(userNumber == -1)
				break;
			
			//1-3. 누적합
			sum += userNumber;
			
		}
		
		//2. 누적합 출력
		System.out.println("누적합 >> " +sum);
		input.close();
	}

}
	