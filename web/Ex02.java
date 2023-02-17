package polymorphism;  // 다향성 패키지 

class Product { //프로덕트 클래스 정의 
	int price; //멤버 변수 선언_초기값 없는 int 타입 이름이 price.
	int bonusPoint; //int타입 이름이 보너스포인트.
	
	//생성자
	Product() {//매개변수 없는 product 생성자 생성. product 클래스 내에 매개변수 있는 생성자가 생성되어있음.
	}  // 자식 클래스에 매개변수 없는 부모 생성자가 자동 추가 되기 때문에 생성해줌.
	
	Product(int price) { //Proudct에 매개변수(int타입 price) 1개인 생성자 생성   
		this.price = price; //참조 변수 this.price(자기 int형 price 주소)에 price 대입.
		bonusPoint=(int)(price/10.0); // int타입 bonusPoint에 price 나누기 10 = 정수 몫 대입.
	}
}

class Tv extends Product { // 상속 클래스. Tv 클래스가 Product를 부모로 삼음 >> 부모의 멤버 변수, 메서드를 사용.
	Tv() { //매개 변수 없는 TV 생성자 생성.
		super(100); // 매개변수가 있는 부모 생성자 호출. -> int형 price에 100 대입.
	}	
	
	public String toString() { //string[문자열]타입의 반환형 toString 메서드 정
		return "Tv"; //"Tv"에 반환 후, 메소드 실행 끝.
	}
}

class Computer extends Product { // 상속클래스. Computer 클래스가 Product를 부모로 삼음.
	Computer() { //매개 변수 없는 Computer 생성자 생성.
		super(200); //매개변수가 있는 부모 생성자 호출. -> int형 price에 100 대입.
	}
}

//멤버변수 2개에 멤버메소드 하나.
class Buyer { //class buyer 정의
	int[] list;
	int money = 1000; // int형 money에 1000만원 대입. 변수생성과 동시 초기화.
	int bonusPoint = 0; //int형 bonuspoint에 0 대입.

	void buy(Product p) {  //여기서 이뤄지는 다형성 Product p가 tv, computer를 받아줌.
		if(money < p.price) { //조건문 if: money가 product 멤버변수 price 보다 작으면,
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다."); // "잔액이 부족하여 물건을 살 수 없습니다." 출력.
		}
		
		money -= p.price; // 멤버 변수 int형 money에 money - p.price 값 대입.
		bonusPoint += p.bonusPoint; // 멤버 변수 int형 bonuspoint에 bonus+p.bonuse 값 대입.
		System.out.println(p + "을/를 구입하셨습니다."); //문자열 출력.
	}
	
	public void setList(int i) {	
		this.list = new int[i];
	}
	
	void summary() { // 반환형 없는 summary method 정의.
		System.out.println("구입하신 물픔의 총금액은 " + this.money + "입니다."); // 문자열 내 출력 
		System.out.println("구입하신 제품은" + this.list + "입니다."); // 문자열 출력 
	}
}

public class Ex02 {
	public static void main(String[] args) { // 메인메서드.
		Buyer b = new Buyer(); // buyer객체 생성 후, 참조변수 b에 대입.
		b.setList(10); //참조변수 b 메소드 setlist에 접근.
			
		b.buy(new Tv()); //멤버 메서드 b 메소드 buy에 접근. 동작 실행.
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.summary();  //멤버 메서드 b 메소드 summary에 접근, 동작 실행.
		
		//출력은 메소드를 통해서. = summary method 추가 : 구매한 가전 제품 정보 출력 >> 총금액, 제품명
	}
}
