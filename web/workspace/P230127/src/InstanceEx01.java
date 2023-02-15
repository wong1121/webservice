/*
 * [클래스] class
 * - 클래스는 "자료형"이다.
 * - 관련 있는 변수, 관련 있는 클래스를 모아 사용하고 싶어요.
 * - 사용자(일반 유저x, 개발자 o) 정의 자료형
 * - 참조형(reference type) = 참조 자료형
 *   (기본 자료형(primitive type) = int, float, double...)
 *   
 * - 클래스 명은 반드시 대문자로 시작
 * - 클래스 내 멤버 : 변수, method(동작과 기능) >> 둘 중 하나만 있어도 되고, 다 있어도 된다.
 * 
 * [객체] object, instance====================================================================
 * - 클래스로 생선된 구체화(실체화)된 대상
 * - 자바는 모든 객체를 ram > 'heap'영역에 생성한다. -> 멤버도 heap 영역에 할당
 * - 객체는 heap 영역에 생성되면 할당된 주소를 리턴(반환)
 * - 생성된 객체는 반드시 주소를 통해 접근 >> heap은 이름을 붙일 수 없어서. 저장된 주소(=참조변수)를 찾는 뿐.
 * 
 * - 객체 생성 문법 > 객체는 이름이 없다. > 참조변수가 없으면 찾을 수 없다.
 *   new 클래스명();
 *  
 * - 참조(referance) 변수 선언 문법 > 주소가 있는 변수!!!
 * - 객체 생성명과 참조변수명이 반드시 같아야 한다. = 같은 주소!!!
 * - 주소가 저장이 된 변수 = 참조형
 *   클래스명 변수명;
 *   
 * - 객체 내에 자기주소를 갖는 'this'가 생긴다.  
 * - 참조변수.멤버변수  
 * - 참조변수.멤버메서드 
 */

//[클래스 정의]============
class Student {
	//멤버 변수(클래스 안에 있는 변수)
	int age;
	String name;
	
	//멤버 메소드
	void study() {
		System.out.println("열심히 공부 중입니다.");
	}
}

public class InstanceEx01 {
	public static void main(String[] args) {
		
		// [기본 자료형]
		// 변수 선언 (기본 자료형을 가지고 만듬)
		// [문법] 자료형 변수명;
		int num = 1;
		
		System.out.println("num >> " + num);
		
		// 참조형==================================
		// [문법] 클래스명>>자료형 변수명;=참조변수;
		// 참조변수에 null = 찾아갈 주소가 없다. 라는 뜻.
		// 참조변수를 통해서 찾아가는 건 heap있는 멤버들 밖에 없다.
		Student hong = new Student();
		
		hong.age = 25;
		hong.name = "gildong";
		
		System.out.println("age >> " + hong.age);
		System.out.println("name >> " + hong.name);
		
		//멤버 메소드 study 호출
		hong.study();
		
		Student hongTwo = hong;
		System.out.println("[hongTwo] age >> " + hongTwo.age);
	}
}
