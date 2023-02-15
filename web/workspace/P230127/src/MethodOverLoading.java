/*
 * [method 오버로딩]
 * - 같은 이름의 메서드를 여러 개 정의
 * - 단, 매개변수(개수, 자료형(type) 중 하나가 달라야 함. 이름은 상관없!)의 정보 이름이 달라야 함.
 * - 반환형(return형)과는 관련 없다.
 *       
 */

public class MethodOverLoading {
	/*
	 * [method 정의]
	 * 기능 :  정수 2개를 받아서, 덧셈 결과를 출력
	 * 
	 */
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	//실수출력을 위함
	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	
	public static void main(String[] args) {
		sum(2, 3);
		sum(4.5, 15.3);
	}

}
