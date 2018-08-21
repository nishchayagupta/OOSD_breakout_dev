import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame {

	 public JPanel homePanel;
	 public JFrame frame=new JFrame("BREAKOUT");
	 public JLabel paddleLabel=new JLabel();
	// JLabel lblNewLabel = new JLabel("New label");
	 public  Point initialClick;

	/**
	 * Create the frame.
	 */
	public GameFrame() {
		
			frame.setSize(700, 500);
			frame.setVisible(true);
			frame.setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		homePanel = new JPanel();
		frame.getContentPane().add(homePanel);
		homePanel.setLayout(null);
		homePanel.setBackground(Color.BLACK);
		
		
		/**
		 * Added the paddle in Game Frame
		 */
		JLabel paddleLabel = new JLabel("New label");
		paddleLabel.setIcon(new ImageIcon("C:\\Users\\arpit\\eclipse-workspace\\OOSD_Assignment1\\Paddle.jpg"));
		paddleLabel.setBounds(242, 432, 241, 28);
		homePanel.add(paddleLabel);
		
	}
	
	/*public void Paddle()

	{
		ImageIcon paddleIcon = new ImageIcon("C:/Users/arpit/eclipse-workspace/OOSD_Assignment1/Paddle.jpg");
		lblNewLabel.setIcon(paddleIcon);
		frame.getContentPane().add(lblNewLabel);
		
		
	}*/
	
	 private void paddleLabelMousePressed(java.awt.event.MouseEvent evt) {                                     
          initialClick = evt.getPoint();
   }  
}
