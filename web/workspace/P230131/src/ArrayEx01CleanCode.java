
public class ArrayEx01CleanCode {
	public static void main(String[] args) {
		//[우리 반 학생들의 수학점수 저장]
		
		// 1. 배열 생성과 동시에 초기화 ----- 0으로 초기화 된 상태에서 덮어쓰기.
		//    -반드시 [길이]를 생략해야한다. 왜? {초기화} 안에 갯수가 포함되어 있어서!
		//int[] math = new int[5]; 
		int[] math = new int[] {80, 90, 70, 100, 50};
				
		//2. 배열 요소 값 확인 : 출력 ================================
		//2-1. 일반 for문
		for(int idx = 0; idx < 5; idx++)
			System.out.println("math[" + idx + "] >> " + math[idx]);
		
		//2-2. 향상된 for문 (배열에서 사용)
		for(int element: math) 
			System.out.println(element);
		
	}
}

