/*
 * [상속 관계]
 * << IS-A 관계 >>
 * : ~는 ~다.
 * : ex) 학생은 사람이다. (O)
 * : ex) 사람은 학생이다. (X)
 * 
 * << HAS-A 관계 >> 소유 관계, 포함 관계
 * : ~는 ~를 소유(포함)하고 있다.
 * : ex1) 폰은 카메라를 포함하고 있다. (O)
 * : ex2) 카메라는 폰을 포함하고 있다. (X)	
 */
class Gun {
	int bullet;
	
	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
}
//class Police extends Gun{
//	int handcuffs;
//	
//	public Police(int bnum, int bcuff) {
//		super(bnum);
//		handcuffs = bcuff;
//	}
//	public void putHandcuff() {
//		System.out.println("SNAP!");
//		handcuffs--;;
//	}
//}
class Police {
	int handcuff;
	Gun pistol; // >> 객체가 다른 객체를 관리, class내 참조 변수(=주소)로 멤버 변수를 갖는다= contatinment / 멤버변수 -> 상속자에 생성하지.  
	
	public Police(int bnum, int bcuff) {
		handcuff = bcuff;
		if(bnum != 0)
			pistol = new Gun(bnum);
		else
			pistol = null;
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuff --;
	}
	public void shoot() {
		if(pistol == null)
			System.out.println("Hut BBanng!");
		else
			pistol.shoot();
	}
}

public class inheritanceEx04 {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();

	}
}
