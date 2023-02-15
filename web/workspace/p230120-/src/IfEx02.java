/*
 * 
 * [조건문] if문
 *  
 * <<조건 2개>> 조건 1이 true면 끝!, 조건 1이 false면 else로 내려간다. 
 * if(조건식) {
 *   //조건이 true일 때, 실행되는 영역
 *   명령어;
 * } else {
 *   // if 조건이 false일 때, 실행되는 영역
 *   명령어; else에는 조건을 쓰지 않는다. 왜? if문을 제외한 나머지 모두를 포함! 해서 else 사용은 선택사항.
 * 
 * }
 * 
 * 
 */


public class IfEx02 {

	public static void main(String[] args) {
		
		
		int num = 5;
		
		if(num > 5) {
			System.out.println("trun일 때, 실행되는 영역");
			num = num + 1;
		} else { 
			System.out.println("false일 때, 실행되는 영역");
			num *= 2;
		}
		
		System.out.println("num >> " + num);

	}

}
