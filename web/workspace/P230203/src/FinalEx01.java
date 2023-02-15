/*
 *  [final] 금지
 *  final field : 값 변경 금지
 *  final method : 오버라이딩(상속관계에서 이뤄짐) 금지 >> 자식이 왜 내 껄 맘대로 써? 원형 그대로 써!!!
 *  final class : 타입 그대로 사용을 원해! 상속, 자식 생기는거 원치 않아!!
 *  
 */

//예약어 순서는 상관없다. final, class 이런 애들
class Fruit {
	int count;
	
	//constructor
	Fruit () {
	}
	
	Fruit(int count) {
		this.count = count;
	}
	
	// [method]
	void showCount() {
		System.out.println("현재 남은 개수는 " + this.count + "입니다.");
	}
	
	void showInfo() {
		System.out.println("과일 정보를 출력하는 메소드입니다.");
	}
}

class Banana extends Fruit {
	
		public Banana() {
		}
		
		public Banana(int count) {
			super(count);            //곧 바로 초기화.
//			super.count = count;     필드 접근해서 초기화.
		}

		void showInfo() {
		System.out.println("현재 과일은 바나나입니다.");
		System.out.println("현재 남은 개수는 " + this.count + "입니다.");
	}
}

public class FinalEx01 {
	public static void main(String[] args) {
		
		//[문제1] 
		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		
		//[문제2]
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();

	}
}
