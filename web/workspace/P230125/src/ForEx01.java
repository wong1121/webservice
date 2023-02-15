
public class ForEx01 {
	public static void main(String[] args) {
		
		//[While문]
		int idx = 1; // 초기값 설정
		
		while(idx < 3) {  //조건식
			System.out.println("[while문] idx >> " +idx );
			idx++;  //증감식
		}
		
		//[for문]
		//for(초기값; 조건식; 증감식) {
		//	  명령문;
		
		
		//첫번째 형태
		for(idx = 1; idx < 3; idx++) {
			System.out.println("[for문] idx >> " + idx);
		}
		
		System.out.println("for문 실행 후 idx >> " + idx);
		

		//두번째 형태
		for(int index = 1; index < 3; index++) {
			System.out.println("index >>" + index);
			
		// System.out.println(index);
		}
		
	}

}
