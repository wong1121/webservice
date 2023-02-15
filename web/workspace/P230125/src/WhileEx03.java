/*
 * [continue]
 * -반복문 내에서 조건문과 함께 사용
 * -반복문 내에서 특별한 코드를 실행에서 제외시키고 싶을 때.
 * -의미 : 특정 라인(continue 아래 라인)을 실행에서 제외시키고 싶다.
 */
public class WhileEx03 {
	public static void main(String[] args) {
		
		int idx = 0;
		
		while(idx < 10) {
			idx++;
			
			if(idx%2 == 1)
				continue;
			
			System.out.println("idx >> " + idx);
		}
		
		System.out.println("반복문 실행 후 idx >>" + idx);
		System.out.println("<<프로그램 종료>>");

	}

}
