package java_package;
//to reverse Array using iteration

public class Class0043_ArrayReverse {

	public static void main(String[] args) {
		String company = "Google";
		String output = "";
		for (int i = company.length() - 1; i >= 0; i--) {
			char c1 = company.charAt(i);
			output = output + c1;
		}
		System.out.println(output);
	}

}
