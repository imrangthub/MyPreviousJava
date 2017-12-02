package JumpWindowToWindow;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class SecondFrameWin extends JFrame {

	private JPanel contentPane;
	private JButton MyButton_1,MyButton_2;
	private JLabel thirdFrameLeble;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondFrameWin frame = new SecondFrameWin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void close(){
		WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	public SecondFrameWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
	
		
		MyButton_1=new JButton("Next >>");
		MyButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thirdFrameWin ThirdFrm=new thirdFrameWin();
				ThirdFrm.setVisible(true);
				
				close();
			}
		});
		MyButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		MyButton_1.setBounds(295, 37, 100, 30);
		contentPane.add(MyButton_1);
		

		thirdFrameLeble=new JLabel("2st Window");
		thirdFrameLeble.setFont(new Font("Tahoma", Font.BOLD, 20));
		thirdFrameLeble.setBounds(10, 11, 130, 74);
		contentPane.add(thirdFrameLeble);
		
		
		
		
		
		
		
		JLabel MainWindowLeble_1=new JLabel("Click the Button For the Next Window");
		MainWindowLeble_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		MainWindowLeble_1.setBounds(100, 73, 330, 40);
	    contentPane.add(MainWindowLeble_1);
		
		
		
		
		
		
		JLabel backmsgLabel=new JLabel("Chick the Button for the Back Window");
		backmsgLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		backmsgLabel.setBounds(54, 192, 330, 40);
		contentPane.add(backmsgLabel);
		
		
		MyButton_2=new JButton("<< Back");
		MyButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myMainWindow MainWin=new myMainWindow();
				MainWin.main(null);
				
				
			}
		});
		MyButton_2.setBounds(54,148, 100, 30);
		MyButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(MyButton_2);
		
		
		
		
		
		
		
		
	}

}
