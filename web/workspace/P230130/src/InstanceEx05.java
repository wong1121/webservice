
public class InstanceEx05 {
	
	//메서드 정의============================
	//[반환형]은 객체 명과 같아야 한다. / 참조변수가 return 형이 될 수 있다. 
	public static Robot constructRobot() {
		//객체 생성
		Robot robot = new Robot();
		robot.setProductYear(2000);
		robot.setProductName("옵티머스");
		return robot;
	}
	
	//main 메소드 정의=======================
	public static void main(String[] args) {
		Robot robot = constructRobot();
		System.out.println("로봇 생산년도 >> " + robot.getProductYear());
		System.out.println("로봇 제품명 >> " + robot.getProductName());
		
		//
		Robot robot2 = constructRobot();
		
		System.out.println("같은 로봇이니? >> " + (robot == robot2));
		System.out.println("참조변수 robot에 저장된 주소 >> " + robot);
		System.out.println("참조변수 robot2에 저장된 주소 >> " + robot2);
				

	}

}
