package java_assignments;

class Country {

	Country() {
		System.out.println("This is the constructor of Country.");
	}
}

class State extends Country {

	State() {

		super();
		System.out.println("This is the constructor of State.");
	}
}

public class Assignment_25 {
	public static void main(String[] args) {

		State a1 = new State();
	}
}

