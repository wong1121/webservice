package p230118;

public class Type {
	public static void main(String[] args) {
		
		/*[자료형]
		 * : 데이터 종류
		 * 
		 * 크기 : ram에서 실행할때 쓰이는 메모리 값, 값의 범위(정수형만!)
		 * 
		 * <<정수형 : 정수 자료형>>
		 * byte - char(문자코드표사용> 음수 사용 안 함) - short(음수표현) - int - long
		 *  1                     2                          2(byte)         4     8 
		 *  
		 * <<실수형 : 실수 자료형>>
		 * float - double
		 *   4       8
		 *    
		 * <<논리형>>
		 * boolean : true / false
		 *    1
		 * 
		 * [변수]
		 * :메모리(기본 RAM이라 함) 공간에 부여한 이름
		 * :부여한 이름을 통해서 메모리에 접근
		 * :변하는 값
		 */
		
		
		// [변수 선언] 
		// 형태 : 자료형 변수명;
		byte num;
		//System.out.println("num : " + num); > 얘만 쓸 수는 없다./ 변수를 선언하고 초기화 하지 않으면 에러가 남.(=쓰레기 값)
		
		//초기화 / '='의 뜻은 같다가 아니라 대입연산자. 오른쪽에 있는걸로 대입해줘.
		num = 5;
		System.out.println("num : " + num);
		
		// [변수 선언과 동시에 초기화] 권장
		short two = 2;
		System.out.println("two : " + two);
		
		two = 220;
		System.out.println("값 변경 후 two : " +two);
		
		
	}

}
