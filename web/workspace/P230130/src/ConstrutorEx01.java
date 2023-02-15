///*
// * [객체 생성시 순서]
// * 1. 메모리 할당 (heap 영역)
// * 2. 생성자 호출
// * 
// * 
// * [생성자] constructor 
// * 
// * << 생성자를 사용하는 이유 >>=======================================
// * - 객체 생성할 때, 멤버변수를 원하는 값으로 초기화 : 멤버변수 초기화  >> 대부분의 이유!
// * - 객체 생성할 때, 원하는 기능(특정 member method) 실행하기 위해
// * 
// * << 특징 >>================================
// * - 객체 생성시, 무조건 하나의 생성자 호출
// * 
// * - 생성자는 '메서드'이다.  
// *   >> 메소드 오버로딩(method overloading) 가능
// * 	 >> 생성자 여러 개 정의 가능
// * 		
// * - 생성자명은 = 클래스명과 같아야 함
// * - 생성자는 반환값(return, 리턴값)이 없음.  
// *   >> 반환형(리턴형) 명시하지 않음.
// *    
// * - 생성자를 명시하지 않으면, default 생성자(기본 생성자)가 실행   
// * 	 >> default 생성자는 매개변수 없고, 하는 일도 없음(= body에 코드 조차 없다는 것) >> 형식상 실행
// * 	 >> 생성자가 하나라도 명시되어 있다면, default 생성자는 실행되지 않음.
// * 
// */
//
//class Person {
//	// 멤버 변수
//	int age;
//	String name;
//	
//	// 기본 생성자(default constructor)===============
//	//Person() {
//	//}
//
//	//생성자
//	Person() {    //매개변수가 없는 생성자
//		this.age = 1;
//		this.name = "미입력";
//	}
//	
//	Person(String name) {  //매개변수가 1개인 생성자
//		this.age = 1;
//		this.name = name;
//	}
//	
//	Person(int age, String name) {  //매개변수가 2개인 생성자
//		this.age = age;
//		this.name = name;
//	}
//
//	//setter : alt + shift + s -> r=====================
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	//멤버 메서드==============================================
//	void showInfo() {
//		System.out.println("나이 :" + age + ", 이름 : " + name);
//	}
//}
//
//	public class ConstrutorEx01 {
//	public static void main(String[] args) {
//		
//		Person hong = new Person(47, "홍길동"); //매개변수가 2개인 생성자 호출 실행하세요 : 생성자 호출은 여기서!!!
//		System.out.println("<< 객체 생성 후 멤버 변수 출력 >>");
//		hong.showInfo();
//		
//		System.out.println("<< 멤버변수 값 설정 후 변수 출력 >>");
//		//[첫 번째 방법] 외부접근을 통한 멤버변수 값 설정
//        //초기화 하는거 아니고 덮어쓰기 한 값 >> 추천 안 함. 데이터 쓰레기 나오니까. 그래서 setter생성.
//		//hong.age = 27;         
//		//hong.name = "홍길동";
//		
//		//[두 번쨰 방법] setter 통한 멤버변수 값 설정
//		//:이미 초기화된 변수에 값 설정(덮어쓰기)
//		//hong.setAge(37);
//		//hong.setName("홍길동");
//		
//		hong.showInfo();
//		
//		
//		//[간단한 문제]
//		Person park = new Person("박보검"); //매개변수가 1개인 생성자 호출 
//		park.showInfo(); // 나이 : 1, 이름 : 박보검
//		
//		Person choi = new Person(); //인수가 x > 매개변수가 없는 생성자 호출
//		choi.showInfo(); // 나이 : 1, 이름 : 미입력
//	}
//}