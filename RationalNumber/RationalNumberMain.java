import java.util.*;
import java.io.*;
public class RationalNumberMain {
	public static void main(String[] args) {
		
		// rational number 1 
		
		RationalNumber r1 = fraction();
		System.out.println(r1);
		
		// rational number 2
		
		RationalNumber r2 = fraction();
		System.out.println(r2);
		
		// adding 2 rational numbers
		RationalNumber r3_add = r1.add(r2);
		System.out.println(r3_add);
		
		//subtract 2 rational numbers
		RationalNumber r3_sub = r1.subtract(r2);
		System.out.println(r3_sub);
		
		//multiply 2 rational numbers
		RationalNumber r3_mul = r1.multiply(r2);
		System.out.println(r3_mul);
		
		//divide 2 rational numbers
		RationalNumber r3_div = r1.divide(r2);
		System.out.println(r3_div);
		
	}
	
	// method that returns a rational number after reading input from the user.
	public static RationalNumber fraction() {
		
		System.out.print("Enter numerator: ");
		Scanner input = new Scanner(System.in);
		int numerator = input.nextInt();
		System.out.print("Enter denominator: ");
		
		int denominator = input.nextInt();
		return new RationalNumber(numerator, denominator);
	}
		
	}

