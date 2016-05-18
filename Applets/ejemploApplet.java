//creacion de applet java
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ejemploApplet extends Applet{
	public void init(){
		setBackground(Color.green);
	}
	public void paint(Graphics g){
		g.drawString("Primer applet" , 10,10);
	}
}