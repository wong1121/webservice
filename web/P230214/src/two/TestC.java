package two;

import one.TestA;

public class TestC {
	//객체 생성
	TestA a = new TestA();
	
	void show() {
//		System.out.println(a.num1); //Error! 접근 범위 private : 멤버만! 내부접근만 가능
//		System.out.println(a.num2); //Error! 접근 범위 default : 같은 패키지 내에서만 허용.
//		System.out.println(a.num3); //Error! 접근 범위 protected : 다른 package이지만, 상속 상태 아니어서 외부접근 허용 안할꺼야.
		System.out.println(a.num4); //접근 범위 public : 아무나 다 써~~
	}

}
