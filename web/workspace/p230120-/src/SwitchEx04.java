
public class SwitchEx04 {

	public static void main(String[] args) {
		
		int n = 24;
		
		//[첫 번째 방법 ] if문
		
//		if(n>=0 && n<10)
//			System.out.println("0이상 10미만의 수");
//		else if(n>=0 && n<20)
//			System.out.println("0이상 20미만의 수");
//		else if(n>=0 && n<30)
//			System.out.println("0이상 30미만의 수");		
//		else
//			System.out.println("30이상의 수");
//		
			
		//[두 번째 방법] switch문 (위 if문에서 공통된 점을 찾아서 간단한 식을 만든다...따라)
		
		switch(n/10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("0이상 20미만의 수");
			break;
		case 2:
			System.out.println("0이상 20미만의 수");
			break;
		default:
			System.out.println("30이상 수");
	}
		

	}

}
