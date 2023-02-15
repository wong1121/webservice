class Customer {
	int Id;
	String name;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void showInfo() {
		System.out.println("Id : " + Id + ", NAME : " + name);
	}
}

public class InstanceQuiz02 {
	public static void main(String[] args) {
		Customer hong = new Customer();
		hong.setId(1);
		hong.setName("홍길동");
		hong.showInfo();
		
		Customer park = new Customer();
		hong.setId(2);
		hong.setName("박보검");
		hong.showInfo();
		
		

	}

}
