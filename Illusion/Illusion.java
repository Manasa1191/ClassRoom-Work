// CS210 Assignment #3 "Circles"
// Manasa Bethapudi
// A program to display Ehrenstein Illusion.
import java.awt.*;

public class Illusion {

    public static void main(String[] args) {
        drawFigures();
    }

    // Code to draw figures containing concentric circles &  squares .
    public static void drawFigures() {
        
    	DrawingPanel panel = new DrawingPanel(500, 400);
    	Graphics g= panel.getGraphics();
    	panel.setBackground(Color.CYAN);
    	
    	drawSubFigures(g, 0, 0, 90, 3, 15, 30, 45, 45, 90, 90);
    	drawSubFigures(g, 120, 10, 90, 3, 15, 30, 55, 165, 210, 100);
    	drawSubFigures(g, 250, 50, 80, 5, 8, 16,  90, 290, 330, 130);
    	drawSquares(g, 350, 20, 40, 5, 4, 8, 40, 370, 390, 60, 3);
    	drawSquares(g, 240, 160, 50, 5, 5, 10, 185, 265, 290, 210, 4);
    	drawSquares(g, 10, 120, 100, 10, 5, 10, 170, 60, 110, 220, 2 );
    	
    }
    
    
    //method to draw a sub figure containing circles and a diamond. 
    public static void drawSubFigures(Graphics g, int x, int y, int size, int n, int a, int b,int d, int e, int f, int h) {
    	//where x is position 'x'
    	//where y is position 'y'
    	//where n is circles per sub figure.
    	//where size is size of sub figure.
    	//where a,b,d,e,f,h are constants
    	//where a is gap between each concentric circles.
    	//where b is size of box enclosing each concentric circles.
    	//where d is y1 co-ordinate of center point of line1 of the square.
    	//where e is x2 co-ordinate of center point of line1 of the square.
    	//where f is x1 co ordinate of center point of line3 of the square.
    	//where h is y2 co ordinate of center point of line4 of the square.
    	
    	//code to draw circles
    	for(int i=0; i<n; i++) {
    		//inner yellow fill
    		g.setColor(Color.YELLOW);
    		g.fillOval(a * i+ x, a * i+ y, (-b* i)+ size,(-b* i)+ size );
    		//black outline
    		g.setColor(Color.BLACK);
    		g.drawOval(a * i+ x, a * i+ y, (-b* i)+ size,(-b* i)+ size);
    	}
    	
    	//code to draw square
    		g.setColor(Color.black);
    		g.drawLine(x, d, e, y);
    		g.drawLine(e, y, f, d);
    		g.drawLine(f, d, e, h);
    		g.drawLine(e, h, x, d);
    }
    
    
    //method to draw a square shaped grid of sub figures.
    public static void drawSquares(Graphics g, int x, int y, int size, int n, int a, int b,int d, int e, int f, int h, int row) {
    	g.setColor(Color.lightGray);
    	g.fillRect(x, y, size* row, size* row);
    	
    	for(int i=0; i<row; i++) {
    		for(int j=0; j<row; j++) {
    			drawSubFigures(g, (size* j+ x), (size * i+ y), size, n, a, b, (size* i+ d), (size* j+ e), (size* j+ f), (size* i+ h));
    		}
    	}
    	
    	
    }
    
    
   
}