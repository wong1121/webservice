
public class MethodQuiz01 {
	public static void add(int num1, int num2) {
		int result = 0;
		for(int i = num1; i <= num2; i++) {
			result += i;
		}
		System.out.println("2~5의 누적합 >> " + result);
	}
	public static void main(String[] args) {
			add(2, 5);
			add(5, 2);
	}
}
 