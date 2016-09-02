package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameMenu extends JFrame {
	
	public GameMenu() {
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
		
		// Game selection buttons
		JButton jb9x9 = new JButton("9x9");
		JButton jb13x13 = new JButton("13x13");
		JButton jb19x19 = new JButton("19x19");
		
		// create panel to hold buttons
		JPanel jpButtons = new JPanel();
		jpButtons.setLayout(new GridLayout(2, 1));
		jpButtons.add(jb9x9);
		jpButtons.add(jb13x13);
		jpButtons.add(jb19x19);
		add(jpButtons, BorderLayout.CENTER);
		
		
		// action listeners
		jb9x9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NinByNineBoard();
			}
		});
		
		jb13x13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ThirteenByThirteenBoard();
			}
		});
	}

}
