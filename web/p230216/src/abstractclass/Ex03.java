package abstractclass;

abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
//		추상 메서드
	public abstract void play();
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("베어는 낚시대 놀이 중입니다.");		
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("로이는 터그 놀이 중입니다.");		
	}
}


public class Ex03 {
	public static void main(String[] args) {
		Dog roy = new Dog("로이");
		Cat bear = new Cat("베어");
		
		ainmalPlay(roy);
		ainmalPlay(bear);

	}
	public static void ainmalPlay(Animal animal) {
		
	}
}
