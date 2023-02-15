
public class ArrayEx02 {
	public static void main(String[] args) {
		
		//[1차원 배열] 길이가 1개인 배열===
		//int형의 길이가 5인 1차원 배열 arr 생성
		int[] arr = new int[5];
//		자료형[] 배열명 = new 자료형[열,길이]
		System.out.println("arr >> " + arr);
		
		//1. [2차원 배열] 길이가 2개인 배열==
		//int형의 2행 3열 2차원 배열 arr2를 생성
		int[][] arr2 = new int[2][3];
//		자료형[][] 배열명 = new 자료형[행,길이][열,길이]
		System.out.println("arr2 >> " + arr2);
		
		//2. 2차원 배열 arr2에 값 설정
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		arr2[0][2] = 6;
		arr2[1][0] = 8;
		arr2[1][1] = 10;
		arr2[1][2] = 12;
		
		//일반 for문 출력 : 중첩 for문
//		System.out.println(arr2[0][0]);
//		System.out.println(arr2[0][1]);
//		System.out.println(arr2[0][2]);
//		System.out.println(arr2[1][0]);
//		System.out.println(arr2[1][1]);
//		System.out.println(arr2[1][2]);
		
		//명령문 = 반복코드
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++)
				System.out.print(" " + arr2[i][j]);
			
			System.out.println();
		}
		
		//일반 for문 : 내장변수 length 사용
		for(int i = 0; i < arr2.length; i++) {          //밖 for문 = 행의 정보 
			for(int j=0; j < arr2[i].length; j++)     //열의 정보
				System.out.print(" " + arr2[i][j]);
			
			System.out.println();
		}
		
		//향상된 for문
		System.out.println("<<향상된 for문 >>");
		for(int[] ar: arr2) { 
//			System.out.println("ar :" + ar);
			for(int a: ar)
				System.out.print(" " + a);
			System.out.println();
		}
		
		//2차원 배열의 참조변수
		//arr2    : 참조변수 - 행의 시작 주소
		//arr2[0] : 참조변수 - 첫 번째 1차원 배열의 시작 주소
		//arr2[1] : 참조변수 - 두 번째 1차원 배열의 시작 주소
		System.out.println("[행의 길이] arr2.lenght >> " +arr2.length);
		System.out.println("[0행의 1차원 배열 길이] arr2.lenght >> " +arr2[0].length);
		System.out.println("[1행의 1차원 배열 길이] arr2.lenght >> " +arr2[1].length);
		
		System.out.println("arr2 >>" + arr2);
		System.out.println("[행의 정보] 첫 번째 1차원 배열의 주소: arr2[0]" + arr2[0]);
		System.out.println("[행의 정보] 두 번째 1차원 배열의 주소: arr2[1]" + arr2[0]);
		System.out.println("arr2[0][0] >>" + arr2[0][0]);
	}
}
