import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1.출력
		System.out.print("성별 1 또는 2를 입력하세요.");
		
		//2.입력 : 성별 > 1 or 2
		int user_value = input.nextInt();
		
		//2.출력 :  성별 출력 > 남자 or 여자입니다. (실행할 명령어가 하나일 땐, {중괄호}를 생략 가능하지만, 유지보수 차원으로 남겨두는게 좋을 수 있음)
		if(user_value == 1) {
			System.out.println("남자입니다.");
		} else if(user_value == 2) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}

	}

}

