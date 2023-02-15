/*
 * 
 * [조건문] if문
 * 
 * <<조건이 3개>> 조건이 true를 찾으면 바로 실행. 
 * if(조건식1) {
 *   	조건식 1이 true일 때, 실행되는 영역
 * } else if(조건식2){
 *   	조건식 2가 true일 때, 실행되는 영역
 * } else {
 * 		위 조건을 만족하지 않는, 나머지 모두
 * }
 * 
 * <<조건을 '여러개' 사용하고 싶다면 else if를 else전에 추가 추가>>
 */



public class IfEx03 {

	public static void main(String[] args) {

		
		int num = 2;
		
		if(num > 5) {
			System.out.println("num이 5 보다 크다.");
		} else if(num < 5) {
			System.out.println("num이 5 보다 작다.");
		} else {
			System.out.println("num이 5와 같다.");
		}
		
		System.out.println("num >> " + num);

	}

}
