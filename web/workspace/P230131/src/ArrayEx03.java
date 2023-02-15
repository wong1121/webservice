
public class ArrayEx03 {
	public static void main(String[] args) {
		
		//2차원 배열 생성
		//열의 길이를 생략 가능
		//행 길이는 생략 불가능 >> 행의 정보가 먼저 생기고 그 주소로 찾아가 열의 정보를 찾기때문에
		int[][] arr2 = new int[2][];
		
		System.out.println("arr[0] >> " + arr2[0]);
		System.out.println("arr[1] >> " + arr2[0]);
		
		//열: 1차원 배열 생성
		arr2[0] = new int[2];
		arr2[1] = new int[] {8, 10, 12};

		for (int[] ar : arr2) {
			for(int a : ar)
				System.out.println(" " + a);
			
			System.out.println();
		}
	}

}
