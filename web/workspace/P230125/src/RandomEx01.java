
public class RandomEx01 {

	public static void main(String[] args) {
		/*
		 * [랜덤값]
		 * 문법 : Math.random();
		 * 정수를 사용하고 싶다! 
		 * 1.(Math.random() * n); 곱하기 n을 해준다.
		 * 2.강제형변환 > int를 붙여준다. = (int)(Math.random() * n);
		 * 3.(int)(Math.random() * n); > 실행값이 0이 나오는데 그 이유는 진행방향 왼 > 오! int 처리를 먼저 함. 
		 * 4.선실행을 위해 소괄호로 (Math랑 * 값) 묶어주기. = ((int)(Math.random() * 3)
		 * 5. +1 해줘야 한다. 
		 * 
		 * 0 <= 랜덤값 < 1
		 * 0 이상 1미만의 랜덤값
		 */
		
		//랜덤값 : 1~3
		System.out.println((int)(Math.random() * 3) +1);
		
		//랜덤값 : 100
		int random = (int)(Math.random() * 100) +1;
		System.out.println("1~100 랜덤값 >> " + random);

	}

}
