import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Color;

public class AppliWin_ButtonAndTextJleble {

	private JFrame frame;
	private JLabel MyTxtLeble;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppliWin_ButtonAndTextJleble window = new AppliWin_ButtonAndTextJleble();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppliWin_ButtonAndTextJleble() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton MyButton=new JButton("Show Message");
		MyButton.setBounds(40, 120, 160, 30);
		MyButton.setBackground(Color.lightGray);
		MyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MyTxtLeble.setText("Hello Imran Hossain....!!!");
				
			}
		});
		
		
		frame.getContentPane().add(MyButton);
		
		MyTxtLeble =new JLabel("My Leble");
		MyTxtLeble.setForeground(Color.RED);
		MyTxtLeble.setBounds(40,10,200,100);
		MyTxtLeble.setBackground(Color.WHITE);
		
		frame.getContentPane().add(MyTxtLeble);
		
		
		
	}

}
