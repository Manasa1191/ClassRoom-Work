// CS210 Assignment #4 "Birthdays"
// Manasa Bethapudi
// A program that prompts questions to the user and prints several lines of messages.

import java.util.*;;
public class Birthdays {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("Please enter today's date(month day): ");
        int month = console.nextInt();
        int date = console.nextInt();
        System.out.println("Today is "+month+"/"+date+"/"+"2019, "+"day "+"#"+day_OfTheYear(month, date)+" "+"of the year.");
        
        System.out.print("Please enter person #1's birthday (month day): ");
        int month1=console.nextInt();
        int date1=console.nextInt();
        System.out.println(month1+"/"+date1+"/2019 falls on day #"+day_OfTheYear(month1,date1)+" "+"of 365.");
        int absoluteDays=absolute_Days(month,date);
        
     }
    
    
    //Method to calculate absolute days of the year.
    public static int absolute_Days(int month, int date) {
    	int absoluteDays= 0;
    	int days_Remaining= 0;
    	int days_Remaining_CurrentMonth= daysIn_Month(month)- date;
    	
    	for(int j=month+ 1; j<=12; j++) {
    		days_Remaining=days_Remaining+daysIn_Month(j);
    	}
    	days_Remaining= days_Remaining_CurrentMonth+ days_Remaining;
    	
    	
    	return absoluteDays;
    }
    
    //Method to calculate day# of the year
    public static int day_OfTheYear(int month,int date) {
    	int days_SoFar= 0;
    	for(int i=1;i<month;i++) {
    		days_SoFar=days_SoFar+daysIn_Month(i);
    	}
    	days_SoFar=days_SoFar+date;
    	return days_SoFar;
    }
    
    //Method to calculate number of days in a  month.
    public static int daysIn_Month(int month) {
    	int days=0;
    	if(month == 1) {
    		days= 31;
    	}
    	else if (month == 2) {
    		days= 28;
    	}
    	else if (month == 3) {
    		days= 31;
    	}
    	else if (month == 4) {
    		days= 30;
    	}
    	else if (month == 5) {
    		days= 31;
    	}
    	else if (month == 6) {
    		days= 30;
    	}
    	else if (month == 7) {
    		days= 31;
    	}
    	else if (month == 8) {
    		days= 31;
    	}
    	else if (month == 9) {
    		days= 30;
    	}
    	else if (month == 10) {
    		days= 31;
    	}
    	else if (month == 11) {
    		days= 30;
    	}
    	else {
    		days= 31;
    	}
    	return days;
    }
}
