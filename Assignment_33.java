package java_assignments;
//check override is possible or not by making parent method final

class Parent_Class2{
	void login() { //final void login() it means that the method cannot be overridden by any subclass.
		System.out.println("email");
	}
}

public class Assignment_33 extends Parent_Class2 {
	void login() {
		
		System.out.println("mobile");
	}

	public static void main(String[] args) {
		Assignment_33 m1 = new Assignment_33();
		m1.login();
	}
	

}
