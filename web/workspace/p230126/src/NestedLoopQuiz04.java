import java.util.Scanner;

public class NestedLoopQuiz04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//1. 정수 1개 입력
		System.out.print("짝수 단은 0, 홀수 단은 1을 입력 : ");
		int userValue = input.nextInt();
//		int startDan;
//		
//		if(userValue==0)
//			startDan = 2;
//		else
//			startDan = 3;

		int startDan = (userValue == 0) ? 2 : 3;   //삼항연산자를 쓰면 간단!
		
		//2. 단 출력
		for(int i = startDan; i < 10; i+=2) {
			for(int j = 1; j < 10; j++)
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			
			System.out.println();
		}
		
		input.close();
	}
}
