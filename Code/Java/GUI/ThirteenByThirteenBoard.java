package GUI;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

public class ThirteenByThirteenBoard extends Frame {
	
	/* Globals */
	int unit = 50;  // unit that the board spacing and pieces will be
	
	/** Main Method **/

	public static void main(String[] args) {
		new ThirteenByThirteenBoard();
	}
	
	public ThirteenByThirteenBoard() {
		// set the title
		super("Baduk");
		setSize(800, 700);
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
		for (int i = 40; i <= 640; i = i+unit)
			g2.draw(new Line2D.Double(40, i, 640, i));
		
		// draw vertical lines
		for (int i = 40; i <= 640; i = i+unit)
			g2.draw(new Line2D.Double(i, 40, i, 640));
		
	}


}
