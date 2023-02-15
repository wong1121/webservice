
public class NestedLoopQuiz03 {
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {        //밖 for문은 행과 관련
			
			for(int j=0; j<3; j++)	{	//안 for문은 열과 관련
				if(i == j)
					System.out.print(1);
				else
					System.out.print(0);
			}
			
			System.out.println();
		}
	}
}
