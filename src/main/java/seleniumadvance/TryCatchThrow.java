package seleniumadvance;

import org.openqa.selenium.TakesScreenshot;

public class TryCatchThrow {

	public static void main(String[] args) {
		try {
		int age = 15;
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("please come after 18 years of age");
		}
		
	}

}
