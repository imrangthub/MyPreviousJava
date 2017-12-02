package JumpWindowToWindow;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class myMainWindow {

	private JFrame frame;
	private JButton MyButton_1;
	private JLabel firstWindowLeble;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myMainWindow window = new myMainWindow();
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
	public myMainWindow() {
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
		
		
		MyButton_1=new JButton("Click Me");
		MyButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SecondFrameWin SecondFrm=new SecondFrameWin();
				SecondFrm.setVisible(true);
				frame.dispose();
				
			}
		});
		
		MyButton_1.setFont(new Font("Stencil", Font.PLAIN, 18));
		MyButton_1.setBounds(131, 100, 165, 50);
		frame.getContentPane().add(MyButton_1);
		
		
		
		firstWindowLeble=new JLabel("1st Window");
		firstWindowLeble.setFont(new Font("Tahoma", Font.BOLD, 20));
		firstWindowLeble.setBounds(10, 11, 130, 74);
		frame.getContentPane().add(firstWindowLeble);
		
		
		
		
		
		
		JLabel MainWindowLeble_1=new JLabel("Click the Button For the Next Window");
		MainWindowLeble_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		MainWindowLeble_1.setBounds(48, 161, 330, 40);
		frame.getContentPane().add(MainWindowLeble_1);
		
	
		
		
		
	}
}
