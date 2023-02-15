class Robot {
	//멤버 변수
	int productYear;
	String productName;
	
	//멤버 메서드
	//setter / getter 추가 >> alt + shift + s > r
	public int getProductYear() {
		return productYear;
	}
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}

public class InstanceEx02 {
	public static void main(String[] args) {
		
		//첫 번째 로봇 생성
		Robot r1 = new Robot();
		r1.setProductYear(2017);
		r1.setProductName("Emmet");
		
		System.out.println("r1의 생산년도 >> " + r1.getProductYear());
		System.out.println("r1의 제품명 >> " + r1.getProductName());
		
		//두 번째 로봇 생성, 객체만 생성할 수도 있다. 
		new Robot().setProductYear(2032);
		
		//주소 복사 >> r1 주소를 r3 저장함. 같은 값 저장했다.
		Robot r3 = r1;
		System.out.println("r3의 제품명 >> " + r3.getProductName());

	}

}
