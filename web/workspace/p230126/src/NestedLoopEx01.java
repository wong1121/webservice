
public class NestedLoopEx01 {
	public static void main(String[] args) {

		for(int i=0; i<3; i++) {
			System.out.println("[바깥쪽 for문] " + (i+1) + "차 회전");
			
			for(int j=0; j<3; j++) {
				System.out.println("\t[안쪽 for문] " + (j+1) + "차 회전");
				System.out.println("\t[안쪽 for문] >> " + i);	
			}
	
			System.out.println();

		}
	}
}
