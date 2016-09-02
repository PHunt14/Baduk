package GUI;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * 
 * @author Patrick Hunt
 * 
 * 
 *
 */

public class NinByNineBoard extends Frame {
	
	/* Globals */
	int unit = 50;  // unit that the board spacing and pieces will be
	
	public NinByNineBoard() {
		// set the title
		super("Baduk");
		setSize(800, 600);
		setVisible(true);
		// dispose of resources on exit
		addWindowListener (new WindowAdapter()
				{public void windowClosing(WindowEvent e)
			{dispose(); System.exit(0);}
				}
		);
	}
	
	public void paint (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		// draw horizontal lines
		for (int i = 40; i <= 440; i = i+unit)
			g2.draw(new Line2D.Double(40, i, 440, i));
		
		// draw vertical lines
		for (int i = 40; i < 490; i = i+unit)
			g2.draw(new Line2D.Double(i, 40, i, 440));
		
	}
	
	// action listeners
	public void mouseClicked(MouseEvent e) {
		// add a Black stone on mouse click
		/**
		 * Get the mouse coordinates
		 * Send those to the BlackStone as the x/y coordinates
		 * (eventually round over to the nearest intersection)
		 * create a new BlackStone at the mouseclick location 
		 */
		// get mouse coordinates
		Point p = MouseInfo.getPointerInfo().getLocation();
		int x = e.getX();
		int y = e.getY();
		// debug statement
		System.out.println("X: " + x + "Y: " + y);
		repaint();

	}


}
