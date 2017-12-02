package ClockGUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Clock_00_DateAndTime00 {

	private JFrame frame;
	private JLabel nameLable,clockLable;
	private JPanel controlPanel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clock_00_DateAndTime00 window = new Clock_00_DateAndTime00();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clock(){
		
		Thread clockTh=new Thread(){
			public void run(){
				
				try {
					
					for(;;){
					Calendar cal=new GregorianCalendar();
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int month=cal.get(Calendar.MONTH);
					int year=cal.get(Calendar.YEAR);
					
					int second=cal.get(Calendar.SECOND);
					int minute=cal.get(Calendar.MINUTE);
					int hour=cal.get(Calendar.HOUR);
					
					clockLable.setText("Time: "+hour+":"+minute+":"+second+" and "+" Date: "+day+" /"+month+" /"+year+".");

					
					
					sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			
		};
		
		clockTh.start();
 		
	}

	/**
	 * Create the application.
	 */
	public Clock_00_DateAndTime00() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		controlPanel=new JPanel();
		controlPanel.setLayout(null);
		controlPanel.setBounds(0, 50, 436, 209);
		controlPanel.setBackground(Color.lightGray);
		frame.getContentPane().add(controlPanel);

		
		nameLable=new JLabel("This is a Clock",JLabel.CENTER);
		nameLable.setFont(new Font("Times New Roman", Font.BOLD, 14));
		nameLable.setLocation(0, 0);
		nameLable.setBackground(Color.red);
		nameLable.setSize(436, 50);
		frame.getContentPane().add(nameLable);

		clockLable=new JLabel("Time: ");
		clockLable.setFont(new Font("Times New Roman", Font.BOLD, 20));
		clockLable.setBounds(10, 50, 416, 100);
		clockLable.setBackground(Color.RED);
		controlPanel.add(clockLable);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
