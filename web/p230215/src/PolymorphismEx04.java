class Person {
	@Override
	public String toString() {
		return "나는 Person이지";
	}
}

public class PolymorphismEx04 {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.toString());
		System.out.println(person);
	}
}
