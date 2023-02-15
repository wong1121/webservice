package access;
class Test {
	
}

public class AccessEx01 {
//	field : 멤버 변수
	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
//	method :  메서드 (내부접근을 이용해 사용하기 위함 = getter)
	public int getNum1() {
		return this.num1;
	}
}
