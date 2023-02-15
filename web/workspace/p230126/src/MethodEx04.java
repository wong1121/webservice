
public class MethodEx04 {
	/*
	 * 메소드 정의=====
	 * [형태4] 매개변수 없고, 리턴값 있음
	 * 기능 : 호출하면 문자열 리턴
	 */
	public static String returnString() {
		return "hola";
	}

	public static void main(String[] args) {
		//method 호출
		// 1) 변수 저장 >> 두고 두고 쓸 예정
		String str = returnString();
		System.out.println("method 호출 결과 >> " + str);
		
		//2) 출력 >> 한 번만 사용 할 예정
		System.out.println("method 호출 결과 : " + returnString());
	}

}
