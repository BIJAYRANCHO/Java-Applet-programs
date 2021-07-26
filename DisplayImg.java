import java.applet.Applet;
import java.awt.*;

public class DisplayImg extends Applet
{	
	//image is an inbuilt class in java Applet
	Image picture;
	public void init(){
		picture = getImage(getDocumentBase(), "BG.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(picture, 30,30,this);  // this points the current image stored in picture variable
		
	}
}


/*
	<APPLET CODE="DisplayImg.class" WIDTH="800" HEIGHT="500"></APPLET>
*/