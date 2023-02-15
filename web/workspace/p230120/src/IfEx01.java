/*
 * 
 * [조건문] if문
 * 
 * <<조건 1개>>
 * if(조건식) {
 *   //조건이 true일 때만, 실행되는 영역
 *   명령어; >> true가 아니면 그 다음 라인이 있어도 처리 안 하고 바로 출력으로 내려감.
 * }
 * 
 * <<조건 2개>> 조건 1이 true면 끝!, 조건 1이 false면 else로 내려간다. 
 * if(조건식) {
 *   //조건이 true일 때, 실행되는 영역
 *   명령어;
 * } else {
 *   //조건이 false일 때, 실행되는 영역
 *   명령어;
 * 
 * }
 * 
 * 
 */


public class IfEx01 {

	public static void main(String[] args) {
		
		
		int num = 5;
		
		if(num >= 5) {
			num = num + 1;
		}
		
		System.out.println("num >> " + num);

	}

}
