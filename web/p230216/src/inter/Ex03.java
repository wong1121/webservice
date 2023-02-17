package inter;

interface Method {
	//method :  public abstract (interface method는 무조건 추상 메서드)
	void one();
	public abstract void two();
	
	//[java 8 부터 지원] 
	// default를 붙이면 완전한 메서드로 만들 수 있지! >> interface에서만 사용
	default void method() {
		System.out.println("interface 내 default method");
	}
	
	// static method
	public static void staticMethod() {
		System.out.println("interface 내 static method");
	}
}

class Sub implements Method {

	@Override
	public void one() {
		System.out.println("[Sub class] 오버라이딩된 메서드 one()");
	}

	@Override
	public void two() {
		System.out.println("[Sub class] 오버라이딩된 메서드 two()");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Method m = new Sub();
		m.one();
		m.two();
		m.method();
		
//		interface 내 static method 호출
//		m.staticMethod();  // Error! static은 참조변수를 통한 접근을 허용하지 않는다. 
		Method.staticMethod(); // 메소드는 메소드타입을 통해서 접근
	}
}
