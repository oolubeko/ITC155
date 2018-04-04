import java.awt.*;

//This method makes mouse ears using the DrawingPanel class and Graphics class

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize the drawing panel to 200 pixels wide by 150 and creates and initializes a Graohics object
		DrawingPanel panel = new DrawingPanel(220,150);
		panel.setBackground(Color.yellow);
		Graphics g = panel.getGraphics();
		
		g.setColor(Color.blue); 	//sets the pen's color to blue
		
		g.fillOval(30,5,40,40);		//Blue left oval of size 40x40 with top left corner at (50,25)
		g.fillOval(160,5,40,40);	//Blue right oval of size 40x40 with top left corner at (130,25)
		
		g.setColor(Color.red); 		//sets the pen's color to red
		
		g.fillRect(50, 25, 130, 130);	//Red rectangle in between the two ovals
		
		g.setColor(Color.black);	//sets the pen's color to black
		
		g.drawLine(50, 90, 180, 90); 	//draws a straight line in the center of the square
	}

}
