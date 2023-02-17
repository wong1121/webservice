package inter;
//interface 상속관계 확인

interface A {}
interface B {}
interface C extends A {} // 자식과 부모의 클래스(type)이 같으면 확장(extends) 하면 된다.
interface D extends A, B {} // interface는 다중 상속 허용 >> 부모를 여럿 둘 수 있다.

class E {}
class F {}
class G extends E {}

//class H extends E, F {}  // class는 다중 상속 불 허용
//class I extends A {} // 자식과 부모의 타입이 다르면 extends 불가능
class J implements A {}  // 자식과 부모의 타입이 다르면 implements(구현하다)를 사용
//class K extends E implement A, B {} // K는 부모로 class E와 interface A 와 B를 둔다.
//class L implements A extends E {} // 순서 error! >같은 타입이 먼저 온 후, 다른 타입이 뒤에 온다. (같은 타입이 우선순위)

//interface M implements E {} // interface의 부모로 class 를 둘 수 없다.

public class Ex01 {

}
