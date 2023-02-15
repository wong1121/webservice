class GrandParent {
	
}

class Parent {
	//[field] instance field
 	int money;
	
 	//[construtor]
 	public Parent() {
 		this.money = 1_000_000;
 		System.out.println("[Parent] 매개변수가 없는 생성자 실행");
	}
 	
 	public Parent(int money) {
 		this.money = money;
 		System.out.println("[Parent] 매개변수가 1개인 생성자 실행");
	}
 	
	//[method] instance method
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}
}

//다중 상속 : 부모가 하나 이상 >> 자바는 허용하지 않아!!
//단일 상속 : 부모가 하나.

class Child extends Parent{
	// [construtor] 
	public Child() {
//		super();  >> 원래는 안 보임, 이해를 위해서 넣어둔 코드임. 자식의 생성자 첫 번째 라인에는 부모의 생성자를 호출하는 super가 들어가 있다.
		System.out.println("[Child] 생성자 실행");
	}
	
	public Child(int money) {
		super(money);
		System.out.println("[Child] 매개 변수가 1개인 생성자 실행");
	}
	
	//[method] instance method
//	  [메소드 오버라이딩] method overriding
//
//	- 상속관계에서 자식(sub) class가 부모(super) class의 멤버 메소드 재정의
//	- 부모 class의 멤버 메소드에서 선언부 그대로, 바디(기능)만 수정
//	- 선언부 그대로 : 반환형, 메소드명, 매개변수 정보가 같아야 함

	void buy(int money) {
		System.out.println("용돈 " + money + "주세요.");
	}
}
/*
 * [메소드 오버로딩] method overloading
 * - 같은 이름의 메소드를 여러 개 정의
 * - 단, 매개변수의 정보가 달라야 함 
 * - 반환형과는 관련 없음
 */

public class InheritanceEx01 {
	public static void main(String[] args) {
		System.out.println("1. Child 객체 생성 : new Child()");
		Child c = new Child();
		c.buy(100_000);  // buy는 부모에 있는 buy 꺼. 왜? child는 없어!!아무것도!!!
		
		System.out.println("\n \n2. Child 객체 생성 : new Child(500_000)");
		Child c2 = new Child(500_000);
		c2.buy(50000);
		

	}
}
