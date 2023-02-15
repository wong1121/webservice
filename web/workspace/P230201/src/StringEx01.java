
public class StringEx01 {
	public static void main(String[] args) {

		String s = "안녕";
		String s2 = "안녕";
		String s3 = new String("안뇽");
		String s4 = new String("안뇽");
		
		System.out.println("참조변수 s에 저장된 문자열의 시작 주소 : " + s);
		
		if(s3 == s4)
			System.out.println("주소 같다");
		else
			System.out.println("주소 다르다");
		
		//String 객체 저장이 된 문자열 비교 'equals' =======
		System.out.println("문자열 비교 >> " + s3.equals(s4));
		
		// String 객체 배열 생성========
//		String[] strArr = new String[3];
//		
//		strArr[0] = new String("java");
//		strArr[1] = new String("HTML");
//		strArr[2] = new String("python");

		// String 객체 배열 생성=======
//		String[] strArr = new String[] {new String("java"), new String("HTML"), new String("python")};
//		String[] strArr = {new String("java"), new String("HTML"), new String("python")};
		
		//문자열은 java가 자동으로 String type으로 인식하기 때문에 객체에 'new String'을 붙이지 않아도 된다.
		String[] strArr = {"java", "HTML", "python"};    
		
		// [문자열 출력] 향상된 for문==
		for(String str: strArr)
			System.out.println(str);
	}
}
