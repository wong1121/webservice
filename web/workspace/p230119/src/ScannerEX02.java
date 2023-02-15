import java.util.Scanner;

public class ScannerEX02 {

	public static void main(String[] args) {
		
		//1.Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		//2-1. 문자열 입력 : next() - 첫번째 공백까지만 입력(space bar전까지)
		System.out.print("문자열 입력하세요 >> ");
		String strOne = input.next();
		
		
		//2-2. 문자열 입력 : nextLine() - 문자열 끝ㅡ Enter까지 입력 
		//Enter : CRLF - \r\n
		//CR : Carriage Return ->\r
		//LF : Line Feed -> \n
		//Windows에서는 Enter를 \r\n으로 사용하여 표현
		System.out.print("문자열 입력하세요 >> ");
		String strTwo = input.nextLine();
		
		//버퍼비우기(ram에 남아있는 enter기호를 버퍼에서 지우기 위해)
		input.nextLine();
		
			
		//3-1. 출력
		System.out.println("입력 받은 문자열 >> " + strOne);
		
		
		//3-2. 출력
		System.out.println("입력 받은 문자열 >> " + strTwo);
		

		
	}

}
