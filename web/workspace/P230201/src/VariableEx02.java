class Item {
	//멤버변수final >> 1. 멤버변수 만들면서 초기화 한 값을 아예고정 / 2. 생성자를 통해 원하는 값으로 고정. 
	int year;
	String name;
	final String company;
	
	//생성자
	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}	
	
	//메소드. >> final 멤버 변수는 setter를 통한 초기화는 하지 않는다. setter는 객체가 생성된 후 호출 되기 때문이지. 	>> 생성자를 통해서 한다. 객체가 생성되는 중에!
//		void setCompany(String company) {
//		this.company = company;
//	}

	void showInfo() {
		System.out.println("생산년도 : " + this.year);
		System.out.println("제품명 : " + this.name);
		System.out.println("제조회사 : " + this.company);
	}
}

public class VariableEx02 {
	public static void main(String[] args) {
		
		Item item = new Item(2022, "곰돌이", "다이소");
		item.showInfo();
//		item.setCompany("까르푸");
		Item itemTwo = new Item(2022, "곰순이", "이마트");
		itemTwo.showInfo();

	}

}
