// CS210 Assignment #3 "Greetings"
// Manasa Bethapudi
// A program that prints a greetings message after reading user's input.
import java.util.*;

public class Greetings {

    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        System.out.println(getGreetings(s));
    }

    // Code to get greetings message.
    private static String getGreetings(Scanner console) {        
        
    	System.out.print("Please enter your first name: ");
    	String first_Name=console.next();
    	char first_Name_Initial = first_Name.toUpperCase().charAt(0);
    	System.out.print("Please enter your last name: ");
    	String last_Name = console.next();
    	String lastName_Initial = last_Name.substring(0,1);
    	String LastName = lastName_Initial.toUpperCase()+last_Name.substring(1, last_Name.length());
    	System.out.print("Please enter your year of birth: ");
    	int year=console.nextInt();
    	int age = getCurrentYear()-year;
    	String Greetings = "Greetings, "+first_Name_Initial+". "+LastName+"!"+" You are about "+age+" years old.";
        return Greetings;
    }
    
    // Get the current year
    //   Method for calculating the age.
    private static int getCurrentYear(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
