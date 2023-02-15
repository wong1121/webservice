
public class OperatorEX02 {

	public static void main(String[] args) {
		
		/*
		 *  관계 연산자
		 *  결과값 : true, false
		 *  
		 *  <  작다, 미만
		 *  >  크다, 초과
		 *  <= 작거나 같다, 이하
		 *  >= 크거나 같다, 이상
		 *  != 다르다
		 *  == 같다
		 */
		 
		int n1 = 5, n2 = 3;
		System.out.println("크니? " + (n1 > n2));
		System.out.println("다르니? " + (n1 != n2));
		System.out.println("같니? " + (n1 == n2));
		
		
		/*
		 * 논리 연산자
		 * 결과값 : true, flase
		 * 
		 * && : 교집합  and연산자                -> 식 && 식 =   왼쪽부터 처리
		 * || : 합집합  or연산자
		 * !  : 여집합  not연산자 > 부정연산자   ->오른쪽에만 식이 온다
		 * 
		 */
		
		System.out.println("교집합 :" + (n1 > 4 && n2 > 4));
		System.out.println(n1 > 4 || n2 > 4);
		System.out.println(! (n1 > 4));
		
	}

}
