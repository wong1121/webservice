
public class WhileEx04 {
	public static void main(String[] args) {

		int idx = 1;      //지역 변수 : main method 영역 내 사용.
		
		while(idx < 10) {
			int num = 100;   // 지역 변수 : while 영역 내 사용.
			System.out.println("while문 내 선언된 변수 num >> " + num);
			
			idx++;
		}
		
		System.out.println("idx >>" + idx);
		//System.out.println("num >>" + num);
	}

}
