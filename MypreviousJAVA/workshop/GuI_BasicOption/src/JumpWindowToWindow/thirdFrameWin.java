package JumpWindowToWindow;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class thirdFrameWin extends JFrame {

	private JPanel contentPane;
	private JButton MyButton_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thirdFrameWin frame = new thirdFrameWin();
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
	public thirdFrameWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SecondFrameLable=new JLabel("3nd Frame");
		SecondFrameLable.setFont(new Font("Stencil", Font.PLAIN, 18));
		SecondFrameLable.setBounds(10, 10,120, 130);
		contentPane.add(SecondFrameLable);
		
		
		
		
		
		
		
		
		JLabel SecondFrmLeble=new JLabel("Click Fro the Back");
		SecondFrmLeble.setFont(new Font("Times New Roman", Font.BOLD, 20));
		SecondFrmLeble.setBounds(75, 150, 296, 50);
	    contentPane.add(SecondFrmLeble);	
		
	    
	    MyButton_2=new JButton("<< Back");
	    MyButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SecondFrameWin SecondFrm=new SecondFrameWin();
				SecondFrm.setVisible(true);
				close();
			}
		});
		MyButton_2.setBounds(150,200, 100, 30);
		MyButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(MyButton_2);
	
		
		
		
	}
}
