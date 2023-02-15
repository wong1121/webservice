import java.util.Scanner;

public class ScannerQuiz02 {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 1.정수를 1개 입력 받은 후 출력
		 * 2.문자열 1개 입력 받은 후 출력
		 * 
		 * 
		 * 큰 뼈대부터 세우고 코드 작성 > 코드 > 수정 및 보완
		 * 
		 * 1. Scanner 객체 생성
		 * Scanner input(변수명_이름) = new Scanner(System.in);
		 * 
		 * 2. 정수 1개 입력
		 * 특정값을 고정해서 쓰고 싶으면 = '변수'를 만든다.
		 * System.out.println("정수열 1개 입력하세요 >> " + num);
		 * int user_num = input.nextInt();   >>문제의 원인 nextInt는 정수만 가져가 변수 user_num에 저장. 엔터기호는 남겨두고...
		 * 
		 * 3. 입력 받은 정수 출력
		 * System.out.println("입력 받은 정수 >> " + num);
		 * 
		 * !문제 해결 > 버퍼비우기(엔터기호를 가져오는건 nextLine! 엔터기호만 가져가기 때문에 이름은 없다.)!
		 * input.nextLine();
		 * 
		 * 
		 * 4. 문자열 1개 입력
		 * System.out.println("문자열 1개 입력하세요 >> ");
		 * String user_str = input.nextLine();  >> nextLine은 문자열을 받아오는데 nextInt에 남아있는 엔터기호를 가져와 실행이 안됌.
		 * 
		 * 5. 입력 받은 문자열 출력
		 * System.out.println("입력 받은 문자열 >> " + str);
		 * 
		 * 
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("정수 1개 입력하세요.");
		//String num = input.nextLine(); >내가 맨처음 쓴거 정수 해결 방법 몰라서 문자열 String사용함. 쉽게 갔네
		int num = input.nextInt();
		System.out.println("입력 받은 정수 >> " + num);
		
		//해결방법 
		input.nextLine();
		
		System.out.println("문자열 입력하세요.");
		String str = input.nextLine();
		System.out.println("입력 받은 문자열 >>" + str);
		
				
		
	}

}
