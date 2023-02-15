class Number {
	// 멤버변수 : field
	//                   <메모리 영역>          <할당 시기>
	// instance field  : heap 영역 할당       instance 생성될 때
	// static   field  : static 영역 할당     class가 메모리에 로드될 때
	
	// static은 객체 생성과는 관련없이 메모리에 할당되기 때문에 클래스명으로 관리 된다. >> 객체 생성과 상관없이 쓰고 싶을 때.
	// static은 메모리에 딱 하나만 만들어 진다.
	// static은 프로그램이 종료 될 때까지 메모리를 사용한다. 
	
	static int one = 100;
	int two;
	
	//멤버메소드 : method
	//  <메모리 영역>          <할당 시기>
	// instance field  : heap 영역 할당       instance 생성될 때
	// static   field  : static 영역 할당     class가 메모리에 로드될 때
	// static method에서 쓸 수 있는 건 오로지 static field뿐. 왜? 생성시기가 달라!! static이 먼저 만들어지기 떄문에! instance field 정보는 없어서 에러.
	
	static void staticshow() {
		System.out.printf( "one : %d\n", one);		
	}
	
	void show( ) {
		System.out.printf( "one : %d, two : %d\n", one, two);
	}
}

public class VariableEx03 {
	public static void main(String[] args) {
	
		// static field접근
		// [문법] 클래스명.변수명
		System.out.println( "static 값 >> " + Number.one);
		
		// static method 접근
		// [문법] 클래스명.메서드명()
		Number.staticshow();

		// 객체 생성
		Number number = new Number();
		// instance field 접근
		// [문법] 참조변수.변수명
		System.out.println( "[권장x] instacne field >> " + number.two);  
		System.out.println( "[권장x] 참조변수를 통한 static 멤버 접근 >> " + Number.one);
		
		// instance method 접근
		// [문법] 참조변수.메서드명()
		number.show();
	

	}
}
