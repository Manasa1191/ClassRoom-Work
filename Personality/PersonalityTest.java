import java.util.*;
import java.io.*;
// CS210 Assignment #7 "Personality Test"
// Manasa Bethapudi
// A program that measures 4 independent dimensions of your personality.
public class PersonalityTest {

    public static void main(String[] args) throws FileNotFoundException{
    //Introduction	
	System.out.println("This program groups the responses of each user. ");
	System.out.println("The responses are grouped in such a way that results(in terms of A's and B's ) are displayed for all 4 dimensions.");
	System.out.println("The program then calculates the percent of B's from all 4 dimensions.");
	System.out.println("Finally, you can see the personality type of each user.");
	System.out.println();
	Scanner input = new Scanner(new File("personality.txt"));
	String[] user_names = new String[9];
	String[] user_response = new String[9];
	while(input.hasNextLine())
	{
		
		String name = input.nextLine();
		String answer = input.nextLine();
		//System.out.println(answer);
		process(name, answer);
	}
	
    }
 // A method that counts the number of A's and B's for each dimension  and prints overall output.     
    public static void process(String name, String answer) {
    	int [][] counts = new int [4][2]; // already initialized to 0
    	int [] bPercents = new int[4];
    	
    	char [][] dimensionTypes = new char[4][2];
    	dimensionTypes[0][0] = 'E'; dimensionTypes[0][1] = 'I';
    	dimensionTypes[1][0] = 'S'; dimensionTypes[1][1] = 'N';
    	dimensionTypes[2][0] = 'T'; dimensionTypes[2][1] = 'F';
    	dimensionTypes[3][0] = 'J'; dimensionTypes[3][1] = 'P';
    	
    	for(int i=0; i<answer.length(); i++) {
    		int dimensionRow = 0;
    		if(i%7 == 0) {
    			dimensionRow = 0;
    		} else if (i%7 == 1 || i%7 == 2) {
    			dimensionRow = 1;
    			
    		} else if (i%7 == 3 || i%7 == 4) {
    			dimensionRow = 2;
    			
    		} else if (i%7 == 5 || i%7 == 6) {
    			dimensionRow = 3;
    		}
    		if(answer.charAt(i) == 'A' || answer.charAt(i) == 'a') {
    			counts[dimensionRow][0] += 1; 
    		} else if(answer.charAt(i) == 'B' || answer.charAt(i) == 'b') {
    			counts[dimensionRow][1] += 1; 
    		}
    	}
    	for(int i=0; i<4; i++) {
    		double percent = (double)counts[i][1]*100/(counts[i][0]+counts[i][1]);
    		bPercents[i] = (int) Math.round(percent);
    	}
    	System.out.println(name + ":");
    	System.out.printf("answers: [");
    	for(int i=0; i<4; i++) {
    		System.out.printf("%dA-%dB,", counts[i][0], counts[i][1]);
    		if(i != 3) {
    			System.out.printf(" ");
    		}
    	}
    	System.out.println("]");
    	System.out.printf("percent B: [");
    	for(int i=0; i<4; i++) {
    		System.out.printf(bPercents[i] +",");
    		if(i != 3) {
    			System.out.printf(" ");
    		}
    	}
    	System.out.println("]");
    	// Types
    	System.out.printf("type: ");
    	String type = "";
    	for(int i=0;i<4;i++) {
    		if(counts[i][0] > counts[i][1]) {
    			type += dimensionTypes[i][0];
    		} else if(counts[i][0] < counts[i][1]){
    			type += dimensionTypes[i][1];
    		} else {
    			type += 'X';
    		}
    	}
    	System.out.println(type);
    	System.out.println("");
    }
    
}
