package inter; // inter 패키지 현재 위치.
import java.util.Vector; // vector타입에 위치.

interface Vehicle { //객체 생성이 불가능 한 interface타입 vehicle.
	void printNumber(); //추상메서드 printNumber 정의.
}

class Car implements Vehicle {
	int carNumber; // 초기값 없는 인트형 카넘버 멤버변수 생성.
	
	public Car() { //매개변수 없는 생자 생성.
	}

	public void drive() { //리턴값 없는 드라이브 메서드 정의.
		System.out.println("자동차가 고속도로를 달립니다.\n"); // 문자열 출력.
	}

	@Override
	public void printNumber() { //프린트넘버 메소드 오버라이딩. 부모꺼 말고 자식 자기가 재정의 해 사용하겠다.
		this.carNumber = carNumber; // 매개변수 카넘버를 내 멤버변수 카넘버에 대입.
		System.out.println("자동차 등록번호 : " + this.carNumber); //문자열 출력
	}
}

class Yacht implements Vehicle {
	int yachtNumber;// 초기값 없는 인트형 요트넘버 멤버변수 생성.
	
	public void sail() { //리턴값 없는 세일 메서드 정의.
		System.out.println("요트가 한강 위를 떠다닙니다.\n"); //문자열 출력
	}

	@Override
	public void printNumber() { // 프린트넘버 메소드 오버라이딩.
		this.yachtNumber = yachtNumber; // 매개변수 요트넘버를 내 멤버변수 요트넘버에 대입. 
		System.out.println("요트 등록번호 : " + this.yachtNumber);// 문자열 출력.
	}
}

public class Ex04 {
	public static void main(String[] args) { //메인 메서드.
		Vehicle[] myVehicle = new Vehicle[2]; // 
		myVehicle[0] = new Car(8586); //배열에 인덱스 0번 myvehicle에 힙영역에 메모리 할당된 인수 8586을 갖는 카 대입.  
		myVehicle[1] = new Yacht(67911); //배열에 인덱스 1번 myvehicle에 힙영역에 메모리 할당된 인수 67911을 갖는 요트 대입.
//		
		
//		[반복문] 사용
//		: drive method와 sail method 호출 >> 정의되어 있음
//		: printNumber method 정의 후 호출 >>
//		<실행결과>
//		자동차 등록번호 : 8586
//		자동차가 고속도로를 달립니다. \n
		
//		요트 등록번호 : 679111
//		요트가 한강 위를 떠다닙니다.
		

	}
}
