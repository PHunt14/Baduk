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

public class MainMenu extends JFrame {
	
	public MainMenu() {
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
		
		// Login -or- Quit buttons
		JButton jbLogin = new JButton("Login");
		JButton jbQuit = new JButton("Quit");
		
		// create panel to hold buttons
		JPanel jpButtons = new JPanel();
		jpButtons.setLayout(new GridLayout(2, 1));
		jpButtons.add(jbLogin);
		jpButtons.add(jbQuit);
		add(jpButtons, BorderLayout.CENTER);
		
		
		// action listeners
		jbLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GameMenu();
			}
		});
	}

}
