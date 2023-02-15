import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int computer = (int)(Math.random() *10) +1;
		int count = 0;
		
		while(num != computer) {
			System.out.print("숫자 입력 : ");
			num = input.nextInt();
			
			if(num < computer) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				count++;    // 조건문 시작 전이나 후에 위치.
			}else if(num > computer) { //크거나 작거나 두 가지 상황이었음으로, else로도 가능.
				System.out.println("컴퓨터의 숫자가 더 작습니다.");			
				count++;
			}
		}
		
		System.out.println("\n" + count + "번만에 정답입니다.");
		input.close();
	}
}
