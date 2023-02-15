//짝수일때만 출력하세
public class WhileQuiz01 {
	public static void main(String[] args) {
		
		int idx = 0;
		
		while(idx < 10) {
			idx++;
			
			//짝수일때만 출력하세요
			if(idx % 2 == 0) 
				System.out.println("idx >> " + idx);
		}
		
		System.out.println("반복문 실행 후 idx >>" + idx);
		System.out.println("<<프로그램 종료>>");
		
	}

}
