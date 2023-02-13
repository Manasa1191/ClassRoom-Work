// CS210 Assignment #2 "Space Needle"
// Manasa Bethapudi
//prints figure that looks like Space Needle.
public class SpaceNeedle {
	public static final int SUB_HEIGHT=4;

    public static void main(String[] args) {
        drawSpaceNeedle();
    }
  //code to draw space needle
    public static void drawSpaceNeedle() {
        
    	drawVerticalBars();
    	drawSteps();
        drawQuotes();
        drawSlash();
        drawVerticalBars();
        draw_Percentile_Tower();
        drawSteps();
        drawQuotes();
    }
    
    //Code to draw several rows of vertical bars
    public static void drawVerticalBars() {
    	for(int line=1; line<=SUB_HEIGHT; line++) {
    		
    		for(int i=1; i<=(SUB_HEIGHT * 3); i++) {
    			System.out.print(" ");
    		}
    		System.out.println("|"+"|");
    	}
    }
    
    //Code to triangle shape steps
    public static void drawSteps() {
    	for(int line=1; line<=SUB_HEIGHT; line++) {
    		
    		for(int i=1; i<=(-3 * line + 12); i++) {//constant '9' in case SUB_HEIGHT '3'
    			System.out.print(" ");
    		}
    		System.out.print("__");
    		System.out.print("/");
    		
    		for(int j=1; j<=(3 * line - 3); j++) {
    			System.out.print(":");
    		}
    		System.out.print("|"+"|");
    		
    		for(int j=1; j<=(3 * line - 3); j++) {
    			System.out.print(":");
    		}
    		System.out.print("\\");
    		System.out.println("__");
    	}
    }
    
    //Code to draw series of quotes next to each other.
    public static void drawQuotes() {
    	System.out.print("|");
    	
    	for(int i=1; i<=(SUB_HEIGHT * 6); i++) {//i<=18 in case SUB_HEIGHT is 3
    		System.out.print("\"");
    	}
    	System.out.println("|");
    }
    
    //Code to draw v shaped structure using backslash and forward slash.
    public static void drawSlash() {
    	for(int line=1; line<=SUB_HEIGHT; line++) {
    		
    		for(int i=1; i<=(2 * line - 2); i++) {
    			System.out.print(" ");
    		}
    		System.out.print("\\");
    		System.out.print("_");
    		
    		for(int i=1; i<=(-2 * line + 13); i++) {//constant '10' in case SUB_HEIGHT '3'
    			System.out.print("/");
    			System.out.print("\\");
    		}
    		System.out.print("_");
    		System.out.println("/");
    	}
    }
    
    //Code to draw a tower using several characters.
    public static void draw_Percentile_Tower(){
    	for(int line=1; line<=(SUB_HEIGHT*SUB_HEIGHT); line++) {
    		
    		for(int i=1; i<=(2 * SUB_HEIGHT + 1); i++) {
    			System.out.print(" ");
    		}
    		System.out.print("|");
    		
    		for(int j=1; j<=(SUB_HEIGHT - 2); j++) {
    		System.out.print("%");
    		}
    		System.out.print("||");
    		
    		for(int j=1; j<=(SUB_HEIGHT - 2); j++) {
        		System.out.print("%");
        		}
    		System.out.println("|");
    		
    	}
    }
}
