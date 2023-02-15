class Student {
	// 멤버 변수(field:필드)
	int age;
	String name;
	
	//생성자
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
		
	//멤버 메소드 (method)
	void showInfo() {
		System.out.println("나이 : " + this.age);
		System.out.println("이름 : " + this.name);
		System.out.println();
	}
}

public class ArrayInstanceEx01 {
	public static void main(String[] args) {
		
		//[객체 배열] : 1차원 배열
		//타입[] 배열명 = new 타입[길이];
		Student[] smart = new Student[3];
		System.out.println(smart[0]);
		
		smart[0] = new Student(20, "hong");
		smart[1] = new Student(29, "park");
		smart[2] = new Student(37, "choi");
		
		//배열 생성과 동시에 초기화
		Student[] smartTwo = new Student[] {new Student(20, "hong"), 
											new Student(29, "park"), 
											new Student(37, "choi")};
		
		Student[] smartThree = {new Student(20, "hong"), 
								new Student(29, "park"), 
								new Student(37, "choi")};
		
//		smart[0].showInfo();
//		smart[1].showInfo();
//		smart[2].showInfo();
		
		//1) 일반 for문 : 내장변수 length
		for(int idx = 0; idx < smart.length; idx++)
			smart[idx].showInfo();
		
		//2) 향상된 for문
		for(Student student: smart)
			student.showInfo();
		
	}
}
