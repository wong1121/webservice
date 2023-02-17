class ArrayStack{
	//[field]
	int[] arr;
	int top = -1;
	final int SIZE;
	
	//생성자 추가하여 현재 Error 해결=============
	public ArrayStack(int length) {
		this.arr = new int[length];
		SIZE = arr.length -1;
	}
		
	// [method]
	//setArr객체 생성
	void setArr(int length) {
		this.arr = new int[length];
	}
	
	void push(int element) {
//		[첫번째 방법]=============================
		if(top < SIZE) {
//			top = top + 1;         //length와 index 값이 1차이가 있어서
			arr[++top] = element;  //선증가 배열 길이 
		}else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
		
////		[두 번째 방법] else에 실행할 조건문이 많으면 이 방법을 사용하는게 나을 수 있다.===========
//		if(top < SIZE) {
//			arr[++top] = element;
//			return;                   //1. 메소드 끝(실행종료) 2. 호출한 쪽으로 값을 넘김.(그럴수도, 아닐수도)
//		}
//		
//		System.out.println("스택이 꽉 찼습니다! 용량 초과!");
	}
	
	int pop() {
		if(top > -1)
			return arr[top--];
//		top = top - 1;   하지만, 리턴 아래에는 다른 코드를 사용할 수 없다. 적어둔다 해도 실행하지 않아. 리턴하니까!!!
		else
			System.out.println("\n스택이 비었습니다!");
			return top;
	}
	int peek() {
		return arr[top];
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
//		stack.setArr(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());

	}
}
