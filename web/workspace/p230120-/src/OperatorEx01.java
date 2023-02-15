
public class OperatorEx01 {

	public static void main(String[] args) {
		

		/*
		 * <삼항연산자 = 조건 연산자>
		 * 
		 * 문법
		 * 변수_(대입이 되는 형태가 있어야 한다.) = (조건식) ? true일 때 실행시키고 싶은 명령어 : false일 때 실행시키고 싶은 명령어;
		 * 
		 * 
		 */
		
		//num의 값이 5 이상이면, 10을 저장
		//num의 값이 5 미만이면, 0을 저장
		
		int num = 5;
		
		int result = (num >= 5) ? 10 : 0; 
		
		System.out.println("result >> " + result);
		
		

		//.4 출력
		System.out.println("입력한 값은 " + result + "입니다");
		
		
	}

}
