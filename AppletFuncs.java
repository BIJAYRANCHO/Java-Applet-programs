
/*
	Following are the full applet life cycle:
	1. init() method -- this is the first method to be executed. variable decleration and initialization operations are performed here.
	2. start() method -- the start method contains the actual code of the applet that should run.
 	3. paint() method -- used to redraw the output on the applet display area. It executes after start()
  	4. stop() method -- this method executes whenever the applet window is minimized or moved from ine tab to another.
	5. destroy() method -- when we close the applet window the program destroys.
*/


import java.applet.*;
import java. awt.*;
public class AppletFuncs extends Applet{
	String s;
	public void init()
	{
		s = "This is a test sentence. ";
		System.out.println("Inside init method");
	}
	
	public void start()
	{
		System.out.println("Inside start method");
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s,50,25);
		System.out.println("inside paint Method");
		
	}
	public void stop()
	{
		System.out.println("inside stop Method");
	}
	public void destroy()
	{
		System.out.println("inside destroy Method");
	}

}


/*Don't forget tp give this applet tag inside a comment. Without this program will not run.*/

/*
		<APPLET  CODE="AppletFuncs.java" WIDTH="500" HEIGHT="500"></APPLET>
*/