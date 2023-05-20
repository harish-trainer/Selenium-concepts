import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import seleniumBasic.imagesValidate;


public class CalculatorDemo {

	public static void main(String[] args) throws ArithmeticException,IndexOutOfBoundsException {
		
int age = 12;		
		try {
			if (age<18) {
				throw new ArithmeticException();
			}
		} 
		catch (ArithmeticException e) {
			System.out.println("invalid data");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid array");
			}
		finally {
			System.out.println("going out of try");
			
		}
		
	
		
		
		System.out.println("..............");
		
		
	}

}
