package polymorphism;

class Fruit {
	//field : 멤버 변수
	String name;
	int count;
	
	//constructor : 생성자 = alt + shift + s -> o
	Fruit() {} //자식꺼 때문에 생성함
	
	public Fruit(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	//method
	public void show() {
		System.out.println("부모 클래스 Fruit입니다.");
	}
}

class Banana extends Fruit {

	// 생성자 : (부모의 변수 사용) alt + shift + s -> c 
	public Banana(String name, int count) {
		super(name, count);
	}
	@Override  // toStirng = object. << Fruit 부모.
	public String toString() {
		return "바나나는 멸종 위기지";
	}
	public void nameAndCount() {
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("개수는 " + super.count + "개 있습니다.");
	}
}

class Apple extends Fruit {

	public Apple(String name, int count) {
		super(name, count);
	}
	@Override
	public String toString() {
		return "나는 사과 아삭아삭하지";
	}
	public void showInfo() {
		System.out.println(" >>> 사과 종류는 " + super.name + "입니다.");
		System.out.println(" >>> 갯수는 " + super.count + "개 입니다.");
	}
}

//class Person() {
//	
//}

public class Ex01 {
	
	public static void main(String[] args) {
//		Banana banana = new Banana("레드바나나", 10);
//		System.out.println(banana);
		fruitInfo(new Banana("레드바나나", 10));
		
//		Apple apple = new Apple("아오리", 5);
//		System.out.println(apple);
		fruitInfo(new Apple("아오리", 5));
		
		//fruitInfo(new Person()); //올 수 없어. 왜냐면 fruit랑 관련이 없는 애거든 얘는.
		
	}
	
	//method 정의 (클래스의 멤버로 오는 것.) = Banana = 매개변수 Banana banana >> Fruit fruit로 바꾼건 fruit 본인 뿐 아니라 자식인 banana와 apple까지 다 받아준다는 것. 
	//[다향성] 부모의 참조변수로 자식 객체를 가리킴
	public static void fruitInfo(Fruit fruit) {
		System.out.println("fruit 메서드 시작");
		
		System.out.println(fruit);  // (fruit) = (fruit.toString)과 같다. override 여서, 부모가 유일하게 찾을 수 있는 자식 거라서 실행됨.
		fruit.show();
		// [문제] nameAndCount 메서드 호출
		//banana에만 있는 method 이기 때문에 형변환해야함.(이건 부모타입이니까) : upcasting이 이뤄질 때 자동형변환, downcasting은 강제형변환(부모는 자식을 모르잖아).
		//우선순위_ 강제형변환 << . 접근연산자 = 그래서 소괄호 처리해줌 
		if(fruit instanceof Banana) // 형변환이 가능할 때 (객체 타입이 바나나 일 때만)만, 하단 메서드 실행. (apple는 해주지 마!)
			((Banana)fruit).nameAndCount();
		else if(fruit instanceof Apple)
			((Apple)fruit).showInfo();
		
		System.out.println("fruit 메서드 종료\n");
		
	}
}
