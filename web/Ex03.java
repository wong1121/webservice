package abstractclass; //현재 패키지 앱스트럭트클래스 

abstract class Animal {//추상클래스 애니멀 
	String name; //문자열타입 네임 변수생성.
	
	public Animal(String name) { //문자열타입 네임인 매개변수 1개인 애니멀 생성자 생성.
		this.name = name; //매개변수 네임을 내 멤버변수 네임에 대입.
	}
//		추상 메서드
	public abstract void play(); //불완전 메서드
	
	public static void ainmalPlay(String name) {
		
	}
}

class Cat extends Animal {//상속_캣 클래스는 추상클래스 애니멀을 부모로 삼음. 
	public Cat(String name) { //문자열타입 네임인 매개변수 1개인 캣 생성자 생성.
		super(name); //부모의 네임 생성자 호출.
	}

	@Override
	public void play() { // 메소드 오버라이딩. 리턴형없는 플레이 메서드 정의.
		System.out.println("베어는 낚시대 놀이 중입니다."); // 문자열 출력.		
	}
}

class Dog extends Animal { //상속_도그클래스는 추상클래스 애니멀을 부모로 삼음.
	public Dog(String name) { //문자열타입 네임인 매개변수 1개인 도그 생성자 생성.
		super(name); //부모의 네임 생성자 호출.
	}

	@Override
	public void play() { //메소드 오버라이딩. 리턴형 없는 플레이 메서드 정의.
		System.out.println("로이는 터그 놀이 중입니다.");	// 문자열 출력.	
	}
}


public class Ex03 {
	public static void main(String[] args) { //메인 메서드.
		Dog roy = new Dog("로이"); //인수가 로이인 dog 객체(힙영역) 생성 후, 참조변수 로이에 주소 대입  
		Cat bear = new Cat("베어");// 인수가 베어인 cat 객체(힙영역) 생성 후, 참조변수 베어에 주소 대입. 
		
		ainmalPlay(roy); //인수가 로이, 메소드 명이 애니멀플레이인 메소드 호출. 
		ainmalPlay(bear);//인수가 베어, 메소드 명이 애니멀플레이인 메소드 호출.

	}
}
