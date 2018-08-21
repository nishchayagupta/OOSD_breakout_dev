
import java.awt.Color;

import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Home extends JFrame {

	
	public  JFrame homeFrame;
	public JPanel homePanel;
	public JLabel breakout;
	private JTextField textField;
	private JMenuBar menuBar;
	private JMenuItem mntmExit;
	

	/**
	 * Create the frame.
	 */
	public Home() {
		try {
			homeFrame = new JFrame("BREAKOUT");
			 homeFrame.setVisible(true);
			 homeFrame.setExtendedState(homeFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			 homeFrame.setSize(700, 500);
			 homeFrame.setResizable(false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/**
		 * Add the Panel on Frame.
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homePanel = new JPanel();
		homeFrame.getContentPane().add(homePanel);
		homePanel.setLayout(null);
		homePanel.setBackground(Color.BLACK);
		
		
		/**
		 * Added Play Button and Panel.
		 */
		JButton play=new JButton();
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new GameFrame();
			}
		});
		homePanel.add(play);
		play.setText("PLAY");
		play.setSize(50, 50);
		play.setBounds(278, 232, 100, 30);
		play.setBackground(Color.RED);
		play.setVisible(true);
		
		breakout=new JLabel("BREAKOUT");
		breakout.setForeground(Color.red);
		breakout.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 45));
		breakout.setBounds(162, 104, 325, 46);
		breakout.setVisible(true);
		homePanel.add(breakout);
		
		/**
		 * Added Player Name Label on Panel.
		 */
		
		JLabel enterName = new JLabel("Player Name");
		enterName.setForeground(Color.red);
		enterName.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		enterName.setBounds(159, 176, 170, 46);
		enterName.setVisible(true);
		homePanel.add(enterName);
		
		
		/**
		 * Added text field on Label to write player name.
		 */
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(339, 193, 86, 20);
		homePanel.add(textField);
		textField.setColumns(10);
		
		/**
		 * Added Exit Button to close the game.
		 */
		JButton exit = new JButton("EXIT");
		exit.setBounds(278, 277, 100, 30);
		exit.setBackground(Color.RED);
		exit.setVisible(true);
		homePanel.add(exit);
		
		
		menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLUE);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 726, 20);
		homePanel.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setBackground(Color.BLUE);
		menuBar.add(mnOptions);
		
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mnOptions.add(mntmNewGame);
		
		mntmExit = new JMenuItem("Exit");
		mnOptions.add(mntmExit);
		
	}
	}

