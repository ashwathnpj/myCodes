package java_assignments;
//method overriding using super keyword

class Parent_Class1 {
	void login() {
		System.out.println("email");
	}
}

public class Assignment_32 extends Parent_Class1 {
	void login() {
		super.login();
		System.out.println("mobile");
	}

	public static void main(String[] args) {
		Assignment_32 m1 = new Assignment_32();
		m1.login();
	}

}
