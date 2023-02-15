package two;
import one.TestA;

public class TestE extends TestA {
	void show() {
//		System.out.println(num1); // Error private : 클랙스 내 멤버만 허용
//		System.out.println(num2); // Error default : 같은 패키지가 아니잖아.
		System.out.println(num3);
		System.out.println(num4);
	}
}
