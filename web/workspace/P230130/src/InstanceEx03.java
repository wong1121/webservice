public class InstanceEx03 {
	
	//메서드 정의 : 참조형 매개변수 => 자료형(type)이 class다.
	public static void newYear(Student student) {
		System.out.println("참조 변수 syudent에 저장된 주소 >> " + student);
		System.out.println("이름 >> " + student.name);
		System.out.println("나이 >> " + student.age++);
	}
	
	public static void main(String[] args) {
		
		Student hong = new Student();
		System.out.println("참조 변수 hong에 저장된 객체주소 >> " + hong);
		hong.name = "홍길동";
		hong.age = 25;
		hong.showInfo();
		
		newYear(hong);
		hong.showInfo();
		
		//객체 생성을 인수로 넣어줌. 
		newYear(new Student());
		

	}

}
