package inter;
import java.util.Vector;

interface Vehicle {
	void printNumber();
}

class Car implements Vehicle {
	int carNumber;
	
	public Car() {
	}

	public void drive() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}

	@Override
	public void printNumber() {
		this.carNumber = carNumber;
		System.out.println("자동차 등록번호 : " + this.carNumber);
	}
}

class Yacht implements Vehicle {
	int yachtNumber;
	
	public void sail() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}

	@Override
	public void printNumber() {
		this.yachtNumber = yachtNumber;
		System.out.println("요트 등록번호 : " + this.yachtNumber);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Vehicle[] myVehicle = new Vehicle[2];
//		myVehicle[0] = new Car(8586);
//		myVehicle[1] = new Yacht(67911);  >> 한 라인으로 만들 수 있어 꺨꼼하니까.
	
		
//		[반복문] 사용_ 배열 -> 향상된 for문(배열용)
//		: drive method와 sail method 호출 >> 정의되어 있음
//		: printNumber method 정의 후 호출 >>
//		<실행결과>
//		자동차 등록번호 : 8586
//		자동차가 고속도로를 달립니다. \n
		
//		요트 등록번호 : 679111
//		요트가 한강 위를 떠다닙니다.
		

	}
}
