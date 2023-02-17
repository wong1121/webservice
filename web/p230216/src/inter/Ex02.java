package inter;

/*
 * [interface] 인터페이스
 * : 추상 클래스보다 엄격해진 자료형
 * : 추상 클래스의 upgrade된 자료형
 * : 객체 생성 불가능 -> 다형성(참조변수형 type)과 상속으로 사용
 * 
 * - field
 * : public static final로 고정 -> constant(변수의 상수화) = 대문자
 * 
 * - method
 * : public acstract : 추상 메서드 (메서드 오버라이딩 하겠다는 말)
 */

interface Variable {
	//field
	int num1 = 100;
	static int num2 = 200;  // static은 class명으로 바로 접근 가능하다
	final int num3 = 300;   // final은 무조건 값을 초기화해야한다
	public static final int num4 = 400;  //기본 값
}

public class Ex02 {
	public static void main(String[] args) {
		// 1. 객체 생성 : interface는 객체 생성 불가능!
//		Variable v = new Variable();
		
		// 2. 멤버 변수 출력 : interface는 멤버 변수를 자동으로, 무조건적으로 public, static, final 시킨다.
		System.out.println(Variable.num1);
//		Variable.num1 = 1;   //error! final 변수로 값 변경 불가능 >> 초기화 값으로 써야함.
		System.out.println(Variable.num2);
		System.out.println(Variable.num3);
		System.out.println(Variable.num4);

		
	}
}
