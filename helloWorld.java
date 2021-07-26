import java.applet.Applet;
import java.awt.Graphics;

public class helloWorld extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello world!", 500, 400);
    }
}

/*	
<APPLET CODE="helloWorld.class" WIDTH=150 HEIGHT=25>
</APPLET>
*/