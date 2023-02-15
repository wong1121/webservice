import java.util.Scanner;
//매개변수는 1, 리턴값은 필요없다.
public class MethodRefactoring {
	/*
	 * [메서드 정의]
	 */
	public static void increment(int args) {
		args++;
		System.out.println(args);
	}

	public static void main(String[] args) {
		int num = 5;
		increment(num);
		
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();	
		increment(userNum);
		
		int var = 10;
		increment(var);

	}

}
