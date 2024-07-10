package java_assignments;

class Father {
	static void house() {
		System.out.println("house output");
	}
}

public class Assignment_19 extends Father {
	static void bike() {
		System.out.println("bike output");
	}

	public static void main(String[] args) {
		bike();
		house();
	}

}
