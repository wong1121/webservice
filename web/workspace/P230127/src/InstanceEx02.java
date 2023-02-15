// 클래스 정의
class Person {
	//멤버 변수========================
	int age;
	String name;
	String address;
	
	//멤버 메서드======================
	// setter = 멤버 변수에 값 설정을 하는 메서드
	// [문법] set멤버변수명
	// this.age >> this. = 참조변수인데 이 뒤에 나오는 애가 멤버변수~야 하고 알려줌.
	void setAge(int age) {
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}

	// getter 
	//[문법] set멤버변수명
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}

public class InstanceEx02 {
	public static void main(String[] args) {
		
		// 1. 참조 변수 선언 ==============
		// [문법] 자료형  변수명;
		//       class명  참조변수;
		Person p1;
		
		// 2. 객체 생성=====================
		// [문법] new 클래스명();
		// new : (연산잔데)heap 영역에 할당하세요.
		// type이 메모리 ram >> heap에 저장 되었다. = 객체화, 구체화 되었다.
		p1 = new Person();
		
		// 3.  멤버 접근====================
		// 3-1. 멤버 변수 값 설정
		//      참조 변수를 통한 멤버 변수 값 설정 : 외부 접근
		//		==> 객체지향에서는 권장하지 않아요.
		// p1.age = 27; 권장 안 함.
		p1.setAge(100);
		p1.setName("홍길동");
		
		//System.out.println("나이 >> " + p1.age); >> 권장 하지 않아요.
		System.out.println("나이 >> " + p1.getAge());
		System.out.println("이름 >> " + p1.getName());

	
		}
	}
}
