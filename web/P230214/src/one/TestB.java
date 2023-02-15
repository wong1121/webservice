package one;

public class TestB {
	//객체 생성
	TestA a = new TestA();
	
	void show() {
//		System.out.println(a.num1); //Error! 접근 권한이 private = 객체가 있는데 외부에서는 드러나지 않아서 사용불가.
		System.out.println(a.num2); //default
		System.out.println(a.num3); //protected
		System.out.println(a.num4); //public
	}
}
