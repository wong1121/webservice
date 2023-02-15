
public class MethodQuiz03 {
	public static void divide(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("나눗셈 결과 >> " + result);
	}
	
	public static void main(String[] args) {
		divide(5, 3);
		divide(4, 0);
		divide(6, 2);
		
	}
}
