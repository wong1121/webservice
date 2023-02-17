package abstractclass;

/*
 * [abstract class] 추상 클래스=================
 * - 추상 클래스 내 추상 메서드 필수 요소가 아니다. 
 * - 추상 클래스는 객체 생성 불가능
 * - 다형성, 상속 용도로 사용
 * 
 * 
 * [abstract method] 추상 메서드================
 * - body가 없는 메서드 -> 미완성(불완전) 메서드
 * - 반드시 추상 클래스 내 존재 (일반 클래스 안에는 존재불가)
 * - [강제성] 추상 클래스를 상속 받은 자식 클래스는 반드시 추상 메서드를 오버라이딩해야 함
 * - 오버라이딩한 메서드의 접근권한은 부모의 추상 메서드의 접근 권한보다 크거나 같아야 한다 
 * 
 */


abstract class Parent {
	//field
	private int num; 
	
	//abstract method : 추상 메서드
	abstract public void methodOne(); 
	
	//method : instance method
	public void methodTwo() {
		System.out.println("일반 메서드");
	}
	
	//method : static(class) method
	public static void methodThree() {
		System.out.println("static method");
	}
} 

class Child extends Parent {
	@Override
	public void methodOne() {
		System.out.println("오버라이딩된 추상 메서드!!");
	}
}
public class Ex01 {
	public static void main(String[] args) {
	
//		1. 추상 클래스는 객체 생성할 때, 에러 발생
//		Parent p = new Parent();
		
//		2. 추상 클래스를 type으로 사용 : 참조변수 선언
		Parent p;
		
//		3. 자식 클래스는 객체 생성 가능 >> 불완전하지 않으니까 / 찾아가는 method 또한 자식 자신꺼 (왜? 부모는 메서드는 불완전해서 사용할 수 없어)
		Child c = new Child();
		c.methodOne();
		
//		4. 다형성 >> 부모 참조변수에 자식의 객체가 저장. 부모의 메서드를 자식껄로 재정의해서 사용 가능해짐.
		Parent pr = new Child();
		pr.methodOne();

	}
}
