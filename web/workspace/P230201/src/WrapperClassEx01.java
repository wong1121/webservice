/*
 * [Wrapper Class] =========================
 * Byte - Short - Character - Integer - Long
 * Float - Double
 * Boolean
 * ==========================================
 * 
 * << 자동형변환 >>
 *  
 *  				boxing
 *   기본 자료형	 ---->	 참조 자료형
 *  primitive type	<----   reference type		
 * 				   unboxing		
 * 
 */

public class WrapperClassEx01 {
	public static void main(String[] args) {
		
		int num = 5;  // 기본 자료형
		Integer num2 = 5;  //
//		Integer num3 = new Integer(5);
		Integer num3 = Integer.valueOf(5);
		System.out.println(num3);
		
		int num4 = num3;
		

	}
}
