
public class IfQuiz01 {

	public static void main(String[] args) {
		 
		int num1 = 11, num2 = 5;
		
		//if문을 사용하여 큰 값, 작은 값을 출력하시오. > 조건 2개
		//결과
		//큰 값 : 11, 작은 값 : 5
		
		
//		if(num1 > 7)
//			System.out.println("큰 값 : " + num1 +", 작은 값 :  "+ num2 +" 이다." );
//		
	
		//선생님 풀이, 같은 수는 표시하고 싶지 않아서 else if 사용
	 
		if(num1 > num2) {
			System.out.println("큰 값 : " + num1 + ", 작은 값 : " +num2);
		} else if(num1 < num2) {
			System.out.println("큰 값 : " + num2 + ", 작은 값 : " +num1);
		}
		
	
		//두 번째 방법 >> 코드 줄이기
		//int max, min; 처럼 출력값이 없는 코드는 권장하지 않는다. = 쓰레기값만 존재함.
		int num3 = 12, num4 = 12;
		
		int max, min;
		
		if(num3 > num4) {
			max = num3;
			min = num4;
		} else {
			max = num4;
			min = num3;
		}
		System.out.println("큰 값 : " + max + ", 작은 값 : " + min); //>> else if로 하면 오류가 뜨는데 else에 대한 걸 지정 해주지 않아서! 
		

	
	}
}
