
public class WhileQuiz03 {
	public static void main(String[] args) {
		
		//누적합 1 + 2 + 3 + .... + 10
		//1씩 증가하는 변수가 필요.
		//1이 바뀌기 전 숫자를 보관할 변수가 필요.
		
		//변수 선언
		int idx = 1;
		int sum = 0;
		
		//누적합
		while(idx <= 10) {
//			sum = sum + idx;  //sum은 idx의 증가된 값이 계속 더해진다.
//			idx = idx + 1;	
			sum += idx;
			System.out.println("누적합 >> " + sum);
			idx++;
			
		}
		
		//출력
		System.out.println(" 1 ~ 10 누적합 : " +sum);
		System.out.println("idx >> " + idx);
	}
}