package exception;
//예외 -> 전가

public class Ex03 {
	public static void main(String[] args) {
		// 1. 배열생성과 동시에 초기화
		int[]arr = {2, 4, 6};
		
		// 2. 배열 요소 값 변경
		try {
			arr[3] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위가 벗어났습니다.");
////			e.printStackTrace();  보여지는데 순서 없이 나타날 수 있다. 쓸 일은 많지 않을거야. 
//			System.out.println(e.getMessage());  //exception 메세지 볼 수 있지
		} catch (ArithmeticException e) {
			System.out.println("분모가 0으로 계산 불능!");
		} catch(Exception e) {
			// Exception은 모든, 타 Exception들의 부모로 예외 범위들을 다 받아준다.(다형성이 이뤄지지) >> 예외요소가 많으면 exception 으로 만들어서 퉁! 칠 수 있음
			System.out.println("Exception class가 처리함!");
		}
		
		System.out.println("메인메서드 종료");
	}
}
