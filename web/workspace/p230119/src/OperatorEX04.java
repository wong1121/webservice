
public class OperatorEX04 {

	public static void main(String[] args) {
		
		int num = 7;
		int result1;
		
		//result1 = ++num;   //변수 왼쪽 옆에 붙은 연산자를 선증가라고 부르고 대입(=)보다 먼저 처리한다.
		result1 = num++; //후증가 > 대입보다 우선수위가 낮음. = 현재 라인에서 사용하려는게 아니라 다음라인에서 사용하려고 씀.
		
		//result1 = num; 
		//num = num + 1;    >위의 후 증가 식은 사실 이 두 라인이 합쳐진 것.
		
		
		System.out.println("num >> " + num);
		System.out.println("result1 >> " + result1);

	}

}
