class Fruit {
	// 멤버 변수(field)
	String sort;
	int count;
	
	// 생성자
	Fruit(String sort, int count) {
		this.sort = sort;
		this.count = count;
	}
	
	// 멤버 메소드(method)
	void Fruitinfo() {
		System.out.println(this.sort + " 가 "  + this.count + "개 있습니다.");
	}
}

public class ArrayInstanceEx01 {
	public static void main(String[] args) {
		
		//길이가 3인 객체 배열 생성
		Fruit[] fruit = new Fruit[3];
		
		//System.out.println(fruit[0]); >> 객체 확인용
		
		fruit[0] = new Fruit("사과", 5);
		fruit[0] = new Fruit("바나나", 2);
		fruit[0] = new Fruit("망고", 3);
		
		//[향상된 for문] 멤버 메소드 호출 >> 요소 확인
		for(Fruit f: fruit)
			f.Fruitinfo();

	}

}
