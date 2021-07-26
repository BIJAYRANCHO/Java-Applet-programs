import java.applet.Applet;
import java.awt.*;

public class drawShapes extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red); // set the graphics current color to red
		g.drawString("WELCOME" ,70,70);
		//used to drawLine between point (x1,y1) and (x2,y2)
		g.drawLine(20,30,20,300);
		//used to fill rectangle with default color and specifed height and width
		g.drawRect(170,100,30,30); 
		//used to fill oval with default color and specifed height and width
		g.drawOval(70,200,30,30);
		
		g.setColor(Color.pink); 
		g.fillOval(170,200,30,30);
		//used to draw a circular or elliptical arc
		g.drawArc(90,150,30,30,30,270);  //drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
		g.fillArc(270,150,30,30,0,180);   //fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
		
	}
	 public static void main(String[] args)
	 {
			new drawShapes();
	 }
}


/*
	<APPLET CODE="drawShapes.class" WIDTH = "300" HEIGHT="500" ></APPLET>
*/