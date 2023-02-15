
public class SwitchEx05 {

	public static void main(String[] args) {
		
		//Class를 쓰고 변수를 씀 = 문자열이 저장되 있는 ram의 '주소'를 가지고 비교. 주소 = 'int' 정수를 사용하기에 
		String fruit = "복숭아";
		
		switch(fruit) {
		case "사과":
			System.out.println("사과는 오른쪽 창고에 있습니다.");
			break;
		case "배":
			System.out.println("배는 왼쪽 창고에 있습니다.");
			break;
		default:
			System.out.println("나머지 과일은 위쪽 창고에 있습니다.");
			
		}

	}

}
