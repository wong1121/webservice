
public class SwitchEx01 {

	public static void main(String[] args) {
		/*
		 * <조건문> switch문 = ~같니?의 비교문만 가능.
		 * 
		 * switch(값) >> 값 들은 반드시 정수!_변수, 간단한 식, 상수(고정값이라 잘 안씀),){
		 * case 값1 >> 상수여야 함!:
		 * 		명령어;
		 * 		명령어;
		 * case 값2:
		 * 		명령어;
		 * 		명령어;
		 * default:		<<if문에 else와 같다. 있어도 되고 없어도 상관x)
		 * 		명령어;
		 * 		명령어;						
		 * }
		 * 해당 값의 case를 바로 찾아간 후, 아래 라인까지 다 처리한다.
		 * > break; 선택사항, 걸어주면 해당 값 case만! 
		 * 
		 */
		
		
		int n = 1;
		
		switch (n) {
		case 1:
			System.out.println("Simple java");
			break;
		case 2:
			System.out.println("Funny java");
			break;
		case 3:
			System.out.println("Fantastic java");
			break;
		default:
			System.out.println("The best programing language");
		}
			
		System.out.println("Do you like coffee");
			
		}

	}
