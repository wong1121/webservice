import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요 >>> ");
		int result = input.nextInt();
		int n = result;
		String season = "";
		
		switch (n/3) {
		case 1:
			season = "봄";
			break;
		case 2:
			season = "여름";
			break;
		case 3:
			season = "가을";
			break;
		default:
			season = "겨울";
		}
			
		System.out.println("현재의 계절은 " + season + "입니다.");

	}

}
