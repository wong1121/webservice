package polymorphism;

class Product {
	int price;
	int bonusPoint;
	
	//생성자
	Product(int price) {
		this.price = price;
		bonusPoint=(int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}	
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
}

//멤버변수 2개에 멤버메소드 하나.
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	String[] list;
	
	void setList(int length) {
		this.list = new String[length];
	}
	
	void buy(Product p) {  //여기서 이뤄지는 다형성 Product p가 tv, computer를 받아줌.
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		System.out.println("구입하신 물픔의 총금액은 " + this.money + "입니다.");
		System.out.println("구입하신 제품은" + this.list + "입니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.setList(10);
			
		b.buy(new Tv()); //멤버 메서드 buy를 찾아서 간다.
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.summary();
		
		//출력은 메소드를 통해서. = summary method 추가 : 구매한 가전 제품 정보 출력 >> 총금액, 제품명
	}
}
