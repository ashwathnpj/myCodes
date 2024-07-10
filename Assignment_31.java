package java_assignments;
//methods overriding
class Parent_Class{
	void login() {
		System.out.println("email");
	}
}

public class Assignment_31 extends Parent_Class {
	
	void login() {
		
		System.out.println("mobile");
	}
	public static void main(String[] args) {
		Assignment_31 m1=new Assignment_31();
		m1.login();
	}
	

}
