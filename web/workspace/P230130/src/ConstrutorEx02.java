class Person {
	// 멤버 변수
	int age;
	String name;

	//생성자 : 생성자 안에서 다른 생성자를 호출 할때(= 내껄 쓰니까 this 사용!)는 반드시 생성자 호출이 첫번째 라인에 있어야 한다. 
	Person() {    //매개변수가 없는 생성자
		this(1,"미입력");
		System.out.println("매개변수가 없는 생성자 실행 완료!!");
	}
	
	Person(String name) {  //매개변수가 1개인 생성자
		this(1, name);         //매개변수가 2개인 생성자 호출
		System.out.println("매개변수가 1개인 생성자 실행 완료!!");
	}
	
	Person(int age, String name) {  //매개변수가 2개인 생성자 정의
		this.age = age;
		this.name = name;
	}

	//setter : alt + shift + s -> r=====================
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//멤버 메서드==============================================
	void showInfo() {
		System.out.println("나이 :" + age + ", 이름 : " + name);
	}
}

	public class ConstrutorEx02 {
	public static void main(String[] args) {
		
		Person hong = new Person(47, "홍길동"); //매개변수가 2개인 생성자 호출 실행하세요 : 생성자 호출은 여기서!!!
		System.out.println("<< 객체 생성 후 멤버 변수 출력 >>");
		hong.showInfo();
		
		System.out.println("<< 멤버변수 값 설정 후 변수 출력 >>");
		//[첫 번째 방법] 외부접근을 통한 멤버변수 값 설정
        //초기화 하는거 아니고 덮어쓰기 한 값 >> 추천 안 함. 데이터 쓰레기 나오니까. 그래서 setter생성.
		//hong.age = 27;         
		//hong.name = "홍길동";
		
		//[두 번쨰 방법] setter 통한 멤버변수 값 설정
		//:이미 초기화된 변수에 값 설정(덮어쓰기)
		//hong.setAge(37);
		//hong.setName("홍길동");
		
		hong.showInfo();
		
		
		//[간단한 문제]
		Person park = new Person("박보검"); //매개변수가 1개인 생성자 호출 
		park.showInfo(); // 나이 : 1, 이름 : 박보검
		
		Person choi = new Person(); //인수가 x > 매개변수가 없는 생성자 호출
		choi.showInfo(); // 나이 : 1, 이름 : 미입력
	}
}