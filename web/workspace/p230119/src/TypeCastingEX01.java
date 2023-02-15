
public class TypeCastingEX01 {

	public static void main(String[] args) {
		
		/*
		 * [형변환] Type Casting
		 * 강제형변환, 명시적 형변환 > 정수를 실수로 바꾼다.
		 * 자동형변환, 묵시적 형변환 > 작은 타입이 큰 타입으로 바뀔 때 ( 정수 -> 실수 / byte -> int)
		 * 
		 * 
		 * (           정수          )         (     실수    )   
		 * byte - short - int - long     ---    float - double 
		 * 
		 */
		
		
		
		
		// <형변환 1>
		
		int n1 = 9;
		int n2 = 2;
		
		//int n1 = 9, n2 = 2;

		
		// + , /(몫) 중 몫이 우선적용
		//int 값이 변화되는게 아니라! system 라인에 적힌 복사된 n1, n2 값이 변환되는 것!
		
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2 = " + n1 / (float)n2);
		System.out.println("n1 / n2 = " + (float)(n1 / n2));
		
		
		
		//<형변환 2>
		int num = 100;
		
		//강제형변환 : 큰 크기타입 -> 작은 크기타입
		short sh = (short)num;
		byte by = (byte)num;
		
		
		//자동형변환 : 작은 크기 > 큰 크기 / 타입이 전혀 다른 실수와 정수에선, 정수가 표현 범위가 훨씬 큰 실수로 자동으로 된다.(int > float)
		long lo = num;
		float fo = num;
		double db = num;
	
	
		
	}

}
