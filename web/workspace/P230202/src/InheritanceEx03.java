class Student {
	// method overriding >> .toString
	//주소 밖에 안나오는데 해서 뭐해..? 부모꺼 안쓰고 내가 이 class를 재정의 할 꺼야!
    //이 class가 뭔지 나타내거나 대표하는 문자열을 나타내고 싶어! 할 때! 사용한다.
	public String toString() { 
	
		System.out.println("<< 재정의 된 메소드 toString 실행됨>>");
		return "Student Class";
	}
}

public class InheritanceEx03 {
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());

	}
}
 