package GUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class BlackStone extends JFrame {
	
	public BlackStone() {
		// constructor, do I need anything here?
		
	}
	
	public void paint (Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(100,  100,  50,  50);
		
	}

}
