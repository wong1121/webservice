package area;
/*
 * [package]
 * : 현재 파일의 위치(경로)
 * : 1개 이상의 package는 올 수 없음
 * : 파일의 첫 라인에 와야 함
 * : 
 */
//순수 자료형 type으로 바꿈.

public class CircleArea {
	double rad;
	final double PI; //PI는 final 이라서 대문자, 고정값이라서 바로 PI = 3.14;로 사용해도 된다.
	
	//생성자(constructor)(변수r은 메소드를 통해서 사용.)_리턴형이 없고, class와 이름이 같아야 한다.
	public CircleArea(double r) {
		rad = r;
		PI = 3.14;
	}
	public double getArea() {
		return (rad * rad)*PI;
	}
}
//public class CircleArea {
//	public static void main(String[] args) {
//		Circle c = new Circle(1.5);
//		System.out.println("반지름이 1.5인 원의 넓이 : " + c.getArea());
//	}
//}
