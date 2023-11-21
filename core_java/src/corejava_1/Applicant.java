package corejava_1;

import java.util.Scanner;

class Applicant {
	int age;

	public void acceptage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();

	}

	public void validate() throws UnderAgeException,OverAgeException
	{

		if (age < 21) {
			
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			 throw uae;
			
			
		} else if (age > 40) {
			
			OverAgeException ov=new OverAgeException();
			System.out.println(ov.getMessage());
			throw ov;
		} else {
			System.out.println("perfect age");
		}
	}
}
