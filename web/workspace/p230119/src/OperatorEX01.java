
public class OperatorEX01 {

	public static void main(String[] args) {
		
		//대입 연산자
		int num = 5;
		System.out.println("num : " + num);
		
		//error
		//3 + 5; 
	
		
		//산술 연산자
		// =, -, *, /, 
		// %(나머지) = 짝수/홀수, ~배수를 찾을 때 사용.

		
		//int n1 = 5;
		//int n2 = 3;    > 같은 int일때는 아래와 같이 한 라인으로 사용할 수 있다.
		
		int n1 = 5, n2 = 3;
		
		System.out.println("덧셈 : " + (n1 + n2));
		System.out.println("뺄셈 : " + (n1 - n2));
		System.out.println("곱하기 : " + (n1 * n2));
		System.out.println("몫 : " + (n1 / n2));
		System.out.println("나머지 : " + (n1 % n2));
		
		
		//복합 대입 연산자
		//n1 = n1 + n2; = n1 += n2;
		n1 += n2;
		System.out.println("n1 : " + n1 + ", n2 : " +n2);
		
		

	}

}
