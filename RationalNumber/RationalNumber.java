// CS210 Assignment #8 "Rational Number"
// Manasa Bethapudi
/**
 * RationalNumber class
 * Represents a fraction whose denominator is never 0
 * Negative fractions are included.
 */
public class RationalNumber {

	// represents numerator and denominator of the fraction.
	// Fields of the class.
	private int numerator;
	private int denominator;
	
	//constructor: takes no parameter, initialize object to 0/1. 
	public RationalNumber() {
		 numerator = 0;
		 denominator = 1;
	 }
	
	//constructs a new rational number.
	//pre: denominator should be > 0
	 public RationalNumber(int numerator, int denominator) {
		 if(denominator == 0) {
			 throw new IllegalArgumentException("Invalid denominator.");
		 }
		 this.numerator = numerator;
		 this.denominator = denominator;
	 }
	
	/*public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}*/
	
	 public int getDenominator() {
		 return denominator;
	 }

	 public int getNumerator() {	
		 return numerator;
	 }

	public String toString() {
		if(this.denominator == 1) { 
			String str = String.format("%d", numerator);
			return str;
		}
		else if(this.numerator == 0) {
			String str = String.format("%d", numerator); 
			return str;
		}
		return this.numerator+"/"+this.denominator;
	}
	
	//method to add two rational numbers and return the result.
	 public RationalNumber add(RationalNumber other) {
		 int numerator_final = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
		 int denominator_final = (denominator * other.getDenominator());
		 RationalNumber result = new RationalNumber(numerator_final, denominator_final);
		 return result;
	 }
	
	 //method to subtract two rational numbers and return the result.
	 public RationalNumber subtract(RationalNumber other) {
		 int numerator_final = (numerator * other.getDenominator()) - (other.getNumerator() * denominator);
		 int denominator_final = (denominator * other.getDenominator());
		 RationalNumber result = new RationalNumber(numerator_final , denominator_final);
		 return result;
	 }

	//method to multiply two rational numbers and return the result.
	 public RationalNumber multiply(RationalNumber other) {
		 int numerator_final = numerator * other.getNumerator();
		 int denominator_final = denominator * other.getDenominator();
		 RationalNumber result = new RationalNumber(numerator_final, denominator_final);
		 return result;
	 }
	 
	//method to divide two rational numbers and return the result.
	public RationalNumber divide(RationalNumber other) {
		int numerator_final = numerator * other.getDenominator();
		int denominator_final = denominator * other.getNumerator();
		RationalNumber result = new RationalNumber(numerator_final, denominator_final);
		return result;
	}	
}
