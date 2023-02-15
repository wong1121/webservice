/*
 * [method] 메서드, 메소드
 * -기능, 동작
 * -메소드를 만드는 것을 "메소드를 정의한다"라고 함
 * -메소드는 정의 한 후, "호출"해야 실행됨
 * -메소드는 여러 번 호출 가능함.
 * -public static void:없다 뜻(반환형, 리턴형 타입) main:메소드명(String[] args:변수선언 >매개변수(parameter) { 
 * ============			method body:생략불가 반드시 와야 한다. >>기능을 위한 명령어들이 온다.          ========
 * 	}
 */

public class MethodEx01 {
	
	//메소드 정의 >> 
	//[형태1] 매개변수 있고, return은 없다. ================
	//반환형 메소드명(매개변수, 매개변수) {
	//	명령어;
	//	명령어;
	//	return 값;
	// }
	//클래스 명과 같은 main method를 먼저 출력한다. 
	//메소드를 호출하면 반드시 되찾아 가게 되있다.
	
	public static void increment(int num) {
		num++;
		System.out.println("1증가한 값 >> " + num);
	}		
	
	public static void main(String[] args) {
		System.out.println("<< main method 시작 >>");
		int num = 100;
		
		increment(5);// 메소드 호출 = 인수:argument >> 같은 메서드 멤버라서 가능!
		
		System.out.println("num " + num);
		System.out.println("<< main method 종료 >>");
		

	}

}
