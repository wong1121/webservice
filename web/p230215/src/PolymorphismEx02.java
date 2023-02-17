
class Animal {
	private int age;
	private String name;
	
	public Animal() { //자식 때문에 넣어줌. 안 넣어주면 error
	}
	
	//생성자(constructor) 추가 > 생성자를 통한 초기화
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	//getter 추가 -> alt + shift + s -> r
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("나는 한 마리의 동물이지");
	}
}

class Cat extends Animal {
	//생성자 추가 : alt + shift + s -> c
	public Cat(int age, String name) {
		super(age, name); 
//		super.age = age;  >> 부모의 참조변수 age에 접근은 private라서 error
	}
	//override
	public void showInfo() { // error 해결 1.부모 멤버 변수에 접근제어자를 private -> protected
		System.out.println("나이 : " + super.getAge() + ", 이름 : " + super.getName()); //2. private 해결방식 >> getter 추가
	}
}

class Dog extends Animal {
	public Dog(int age, String name) {
		super(age, name);
	}
	//override
	public void showInfo() {
		System.out.println("나는 강아지입니다.\n나이는 " + super.getAge() + ", 이름은 " + super.getName() + "입니다.");
	}
}

public class PolymorphismEx02 {
	public static void main(String[] args) {
		
//		Cat mimi = new Cat(5, "미미");
//		Dog hoya = new Dog(2, "호야");
//		mimi.showInfo();
//		hoya.showInfo();
		
		//[객체 배열] 다형성으로 표현된 객체 배열
		// Animal animal = new Cat(5, "미미");
//		Animal[] animal = new Animal[] {new Cat(5, "미미"), new Dog(2, "호야")};
		Animal[] animal = {new Cat(5,"미미"), new Dog(3, "호야")};
		animal[0].showInfo();
		animal[1].showInfo();
	}
}
