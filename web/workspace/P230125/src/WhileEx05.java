
public class WhileEx05 {
	public static void main(String[] args) {
		
		//반복문 while을 사용하여, 1 ~ 10 출력
		//[출력형태] 
		// 1 2 3 4 5 6 7 8 9 10
		
		int idx = 1;
		
		while(idx <= 10) {
			System.out.print(idx + " ");
			idx++;
		}
		//System.out.println(); 줄바꿈효과
		System.out.println("\n<<실행완료>>"); // \n 엔터친 효과
	}

}
