class Student {
	//class 안 멤버 변수 = 멤버 변수
	int age;
	String name;
	
	//멤버 메소드
	void study() {
		System.out.println("공부해요~");
	}
	
	void showInfo() {
		System.out.println("나이 >> " + age + " name >> " + name);
	}
}


public class InstanceEx01 {
	public static void main(String[] args) {
		
		//참조 변수 선언
		//[문법] 클래스명 변수명;
		//참조변수는 객체의 주소 저장
		Student hong;
		
		//객체 생성 : 메모리 할당 ==> heap 영역 할당
		//[문법] new 클래스 명()
		//생선된 객체는 객체의 주소를 알면, 접근 가능
		hong = new Student();
		
		//멤버 접근
		//[문법1] 참조 변수.멤버변수 = 외부접근 >> 권장x
//		System.out.println("멤버 변수 age : 초기값 >> " + hong.age);
//		System.out.println("멤버 변수 name : 초기값 >> " + hong.name);

		//[문법2] 참조 변수.멤버메서드 = 내부접근(heap에서 정보를 가지고 옴)
		hong.showInfo();

	}

}
