
public class WhileQuiz02 {
	public static void main(String[] args) {
		
//		int n = 2;
//		int idx = 1;
//		
//		while(idx < 10) {
//			System.out.println( n + " * " + idx + " = " + (n * idx));
//			idx++;
//		}		
			
		
		// 선생님 풀이	
		//초기값				
		int idx =1;
		
		//조건식
		while(idx <10) {
			System.out.println("2 * " + idx + " = " + (2*idx));
			idx++; // 증감식

		}
		System.out.println("반복문 실행 후 idx >> " + idx);
	}

}
