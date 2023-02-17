package exception;

public class ExceptionEx01 {
	public static void main(String[] args) {
		
		for(int i=10; i<0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException t) {
				System.out.println(i);
			}	
		}
	}
}
