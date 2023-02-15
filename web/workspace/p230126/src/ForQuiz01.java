//2단을 짝수만 출력 하시오
public class ForQuiz01 {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 10; i++) {
			if(i%2==0)
				System.out.println("2 * " + i + " = " + (2 * i));
		}
		/*
		 * 선생님ver
		 * 
		 * for(int idx = 2; idx < 11; idx += 2)
		 * 	System.out.println("2 *" + idx + " = " + (2 * idx));
		 * 
		 */
		
		//<<서식문자>>대입해서 표현 가능한 변수로 넣어줘야 한다.===================
		// %d : 정수
		// %f : 실수
		// %c : 문자 (char = c)
		// %s : 문자열 (String = s)
				
		//[printf 연습]==========================
		System.out.printf("정수1 : %d, 정수2 : %d\n", 2, 5);
		System.out.printf("실수1 : %f, 실수2 : %.1f\n", 2.15, 3.5);
		System.out.printf("문자1 : %c, 문자2 : %c\n", 'G', 'w');
		System.out.printf("문자열1 : %s, 문자열2 : %s\n", "졸려", "고성보내줘!!");
		
		int n1 = 65, n2 = 97;
		System.out.printf("[첫 번째] %d, %d\n", n1, n2);
		System.out.printf("[두 번째] %c, %c\n", n1, n2);
		//System.out.printf("[세 번째] %f, %f\n", n1, n2);
		System.out.printf("[네 번째] %s, %s\n", n1, n2);
	}
}