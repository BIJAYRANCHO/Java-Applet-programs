import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class EventApplet extends Applet implements ActionListener
{
	Button b;
	TextField tf;
	
	public void init(){
		tf = new TextField();
		tf.setBounds(30,40,150,20);
		b=new Button("Click Me");
		b.setBounds(80,250,60,50);
		add(b);
		add(tf);
		setLayout(null);
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		tf.setText("Welcome");
	}
}


/*
	<APPLET CODE="EventApplet.class" WIDTH="800" HEIGHT="500"></APPLET>
*/