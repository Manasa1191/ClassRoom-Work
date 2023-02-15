// CS210 Assignment #6 "baby names"
// Manasa Bethapudi
// A program to print the popularity of baby name starting from 1920 to 2000.
import java.io.*;
import java.util.*;
import java.awt.*;

public class BabyNames {
    public static void main(String[] args) throws FileNotFoundException{
        int count=0;
    	System.out.println("** Popularity of a baby name since year 1920 **");
    	
    	Scanner console = new Scanner(System.in);
    	System.out.print("name?"+" ");
    	String user_input = console.next();
    	Boolean found_result = false;
    	Scanner input = new Scanner(new File("names.txt"));
    	
    	 do {
    		String line = input.nextLine();
    		found_result = processLine(line, user_input) ;
    		if(found_result) {
    			break;
    		}
    			
    	}while (input.hasNextLine());
    	if(!found_result) {
			System.out.println("name not found.");
		}
    	
    	drawGraph();
    	
    }
    
//A method to process one line at a time from the file. Returns Boolean true if user input -
//matches with name on the file.
  public static  Boolean processLine(String line, String user_input) throws FileNotFoundException {
	  Scanner scanLine = new Scanner(line);
	  String name = scanLine.next();
	  String fileName = name.substring(0, 1).toUpperCase()+name.substring(1)+".txt";
	  Boolean found = false;
	  int year = 1920;
	  
	  if(name.toUpperCase().equals(user_input.toUpperCase())) {
		  found = true;
		  String results = "";
		  while(scanLine.hasNext() )  {
		  
			  String x= year+": "+scanLine.nextInt();
			  System.out.println(x);
			  results+= x+"\n";
			  year = year + 10;
		  
		  }
	  PrintStream out1 = new PrintStream(new File(fileName));
	  out1.print(name.substring(0, 1).toUpperCase()+name.substring(1)+",\n");
	  out1.println(results);
	  
	  }
	  
	  return found;
   }

//A method to print a graph showing ranks over a period of time. *Currently incomplete July 28th.
  public static void drawGraph() {
	  DrawingPanel panel = new DrawingPanel(360,200);
	  Graphics g=panel.getGraphics();
	  g.setColor(Color.BLACK);
	  g.drawLine(40, 200, 40, 0);
	  g.drawString("1920", 10, 200);
	  g.drawLine(80, 200, 80, 0);
	  g.drawString("1930", 50, 200);
	  g.drawLine(120, 200, 120, 0);
	  g.drawString("1940", 90, 200);
	  g.drawLine(160, 200, 160, 0);
	  g.drawString("1950", 130, 200);
	  g.drawLine(200, 200, 200, 0);
	  g.drawString("1960", 170, 200);
	  g.drawLine(240, 200, 240, 0);
	  g.drawString("1970", 210, 200);
	  g.drawLine(280, 200, 280, 0);
	  g.drawString("1980", 250, 200);
	  g.drawLine(320, 200, 320, 0);
	  g.drawString("1990", 290, 200);
	  g.drawLine(360, 200, 360, 0);
	  g.drawString("2000", 330, 200);
	  
	  
  }
  }
    


