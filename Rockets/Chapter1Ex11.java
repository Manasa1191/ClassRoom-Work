
// CS210 Summer 2020 Section OBS
// Manasa Bethapudi
// Print figures that look like 2 rockets side by side, with methods for structure and redundancy. 
public class Chapter1Ex11 {
    public static void main(String[] args) {
    	cones();
    	squares();
    	unitedStates();
    	squares();
    	cones();
    	System.out.println();
    }
    
    //Draws 2 cone shaped figures side by side. 
    public static void cones() {
    	System.out.println("   /\\       /\\");
    	System.out.println("  /  \\     /  \\");
    	System.out.println(" /    \\   /    \\");
    }
    
    //Draws 2 square shaped figures side by side.
    public static void squares() {
    	System.out.println("+------+ +------+");
    	System.out.println("|      | |      |");
    	System.out.println("|      | |      |");
    	System.out.println("+------+ +------+");
    }
    
    //Draws 2 figures side by side with text in between. 
    public static void unitedStates() {
    	System.out.println("|United| |United|");
    	System.out.println("|States| |States|");
    }
    
    	
}
