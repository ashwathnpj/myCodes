package java_assignments;
//remove school, name, is, vidya out from String

public class Assignment_36 {
	
	public static void main(String[] args) {
		String name="School name is Vidya";
		System.out.println("From given String we have taken the word out is "+name.substring(0, 6));
		System.out.println("From given String we have taken the word out is "+name.substring(7, 11));
		System.out.println("From given String we have taken the word out is "+name.substring(12, 14));
		System.out.println("From given String we have taken the word out is "+name.substring(15, 20));
	}

}
