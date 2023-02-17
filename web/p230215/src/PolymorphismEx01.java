/*
 * [다형성]=========================
 * 1. 부모의 참조변수로 자식 객체를 가리킴  >> 부모의 참조변수로 자식의 객체를 찾아간다. = 참조변수 타입이 달라진다.
 * 2. 부모의 참조변수는 부모의 멤버만 접근 가능
 * 	  단, 오버라이딩된 메소드(=자식)는 접근 가능
 * 
 * 3. 참조형의 형변환 :
 *       부모 class type
 *       			 △
 * 	downcasting |    | upcasting(자동형변환: 자식 -> 부모)
 *  강제형변환  |    |
 *  부모->자식  |    |
 *  			▽	 
 *       자식 class type 
 */ 
	 
class Parent {
	private int money = 1000000;
	
	public void spend(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다");
	}
	public void working() {
		System.out.println("부모님은 열심히 일하는 중입니다.");
	}
}

class Son extends Parent {
	public void play () {
		System.out.println("놀고있지");
	}
	
	/*[method overriding]
	 * - 상속관계에서 부모의 멤버 메서드를 자식이 재정의
	 * - 선언부는 그대로 사용하고, body(기능)만 수정
	 * - 접근권한은 부모의 멤버 메서드보다 크거나 같아야 한다
	 */
	@Override
	public void spend(int money) {
		System.out.println("나는 override 된 메서드");
		System.out.println("부모님 용돈 " + money + "원 주세요");
		System.out.println();
	}
}

class Fruits {
	
}

class Daughter extends Parent {
	public void study() {
		System.out.println("공부 중");
	}
	@Override
	public void spend(int money) {
		System.out.println("[overriding 된 메서드]");
		System.out.println("부모님 학원비 " + money + "원 주세요");
		System.out.println();
	}
}

public class PolymorphismEx01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
//		1.[다형성] 부모의 참조변수로 자식의 객체를 가리킴
		Parent p2 = new Son();
		p2.spend(100);
		Parent p3 = new Daughter();
		p3.spend(200);  // 오버라이딩전엔 부모 객체 사용.
		
//		Daughter d = new Parent(); 얘는 다양성이 아니야.
		
		//[객체 배열]
		//[첫 번째 형태] 객체 배열 생성 후 초기화
		Parent[] p4 = new Parent[2];
		p4[0] = new Son();
		p4[1] = new Daughter();
		
		p4[0].spend(50000);
		p4[1].spend(60000);
		
		//[두 번째 형태] 객체 배열 생성과 동시에 초기화
//		Parent[] p5 = new Parent[] {new Son(), new Daughter()};
		Parent[] p5 = {new Son(), new Daughter()};
		
		
		//[형변환] 클래스를 가지고 형변환을 할 때는 부모 자식사이에 가능
		//1. 다형성
		Parent pr = new Son();
//		p2.play();  : 부모는 자식의 객체를 모르기 때문에 error!
		
		//2. 참조형(referance)의 형변환 >> 부모 타입 -> 자식 타입 : 강제 형변환(downcasting) 
		Son so = (Son)pr;
		so.spend(20000);
		so.play();
		
		//cf) 참조형의 자동 형변환 >> 자식 타입 -> 부모 타입 : upcasting(부모쪽으로 올라감)
		Son sn = new Son();
		Parent pt = sn;
		
		//cf) 참조형에서의 형변환은 부모와 자식 관계에서만 가능
		//Fruit f = (Fruit)sn;
		
		//cf) 기본자료형의 형변환
		byte by = 10;
		char ch = (char)by; 
		
		Daughter d = new Daughter();
		Son s = new Son();
		
		//3. 형변환 가능 여부
		//[문법] 참조변수 또는 객체 instnaceof 클래스 ( 하단은 형변환 여부에 대한 값을 출력)
		System.out.println(pr instanceof Son);
		System.out.println(pr instanceof Parent);
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Son);
		
		System.out.println(s instanceof Son);
		
		
		//===============================================
//		Son s = new Son(); // 다형성x, 자기 객체를 찾아감.
//		s.spend(10000);

	}
}