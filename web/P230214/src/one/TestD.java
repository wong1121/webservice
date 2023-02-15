package one;

//상속(extends)_TextD가 TestA의 자식이 된다.
public class TestD extends TestA{	
	
	//멤버 메서드
	void show() {
//		System.out.println(num1); // 자식은 부모의 모든것을 사용할 수 있지만, private멤버는 부모의 사적멤버기 때문에 접근할 수 없다. 
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
