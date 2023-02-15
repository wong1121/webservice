import java.util.Scanner;



public class ScannerEX01 {

	public static void main(String[] args) {

		int num = 5;
		
		System.out.println("num에 저장된 값 >> " + num);
		
		
		// (Scanner 객체 생성)
		//Scanner를 사용할땐 메인 메소드 맨 위에 import 쓰고 위치를 적어줘야 함.
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 1개 입력 >> ");
		
		//(정수 입력)
		num = input.nextInt();
		System.out.println("입력 받은 값 >> " + num);
		
	}

}
