//중첩 for문으로 구구단 2~9단 출력
public class NestedLoopQuiz01 {
	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			for(int idx=1; idx<10; idx++) {
//				System.out.println( i + " * " + idx + " = " + (i*idx));
				System.out.printf("%d * %d = %d\n", i, idx, i*idx);
			
			System.out.println();		
			}
		}
	}
}
