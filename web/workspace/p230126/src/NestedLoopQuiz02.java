
public class NestedLoopQuiz02 {
	public static void main(String[] args) {
		//중첩 while를 사용하여 구구단 2~9단 출력
		//중첩 while이라 변수 2개 필요
		
		//초기 값
		int i = 2;
		int idx = 1;
		
		//조건식
		while(i < 10) {
			idx = 1;
			while(idx <10) {
				System.out.printf("%d * %d = %d\n", i, idx, (i*idx));
				idx++;
			}
			
			i++;
			System.out.println( );
		}
	}
}
