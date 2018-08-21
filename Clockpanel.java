package Breakout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

public class Clockpanel{
	String hourstr = new String();
	String minstr = new String();
	String secstr = new String();
	String time = new String();
	Timer timer = new Timer();
	int seconds = 00;
	
	TimerTask task = new TimerTask() {
		public void run() {
			seconds++;
			time = receivetime();
			System.out.println(time);
		}
	};
	
	public void runtime() {
		timer.schedule(task, 0, 1000);
	}

	public String receivetime() {
		int second = 00;
		int minute = 00;
		int hour   = 00;
		int remaininghour = 00;
		int remainingminute = 00;
		
		if (second >= 3600) {
			hour = seconds / 3600;
			remaininghour = seconds % 3600;
			
			if (remaininghour >= 60) {
				minute = remaininghour / 60;
				second = remaininghour % 60;
			}
			else {
				second = remaininghour;
			}
			
		}
		
		else if(seconds >= 60 && seconds < 3600) {
			minute = seconds / 60;
			second = seconds % 60;
			
		}
		
		else {
			second = seconds % 60;
		}
		
		if(hour >= 10) {
		hourstr = Integer.toString(hour);
		} else {
			hourstr = "0" + Integer.toString(hour);
		}
		
		if (minute >= 10) {
		minstr = Integer.toString(minute);
		} else { 
		minstr = "0" + Integer.toString(minute);
		}
		
		if (second >= 10) {
		secstr = Integer.toString(second);
		} else { 
		secstr = "0" + Integer.toString(second);
		}
		
		
		time = hourstr + ":" + minstr + ":" + secstr;
		return time;
	}
}


