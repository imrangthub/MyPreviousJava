import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_00 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Button_00 frame = new Button_00();
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
	public Button_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel MyLeable1=new JLabel();
		MyLeable1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		MyLeable1.setBounds(134, 28, 152, 50);
		contentPane.add(MyLeable1);
		
		JButton MyButton1=new JButton("Yes");
		MyButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MyLeable1.setText("you press YES");
				
			}
		});
		MyButton1.setBounds(60, 180, 80, 40);
		contentPane.add(MyButton1);
		
		JButton MyButton2=new JButton("No");
		MyButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MyLeable1.setText("you press NO.");
				
			}
		});
		MyButton2.setBounds(180, 180, 80, 40);
		contentPane.add(MyButton2);
		
		JButton MyButton3=new JButton("Cancle");
		MyButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MyLeable1.setText(null);
				
			}
		});
		MyButton3.setBounds(300, 180, 80, 40);
		contentPane.add(MyButton3);
		
		
		
		
		
		
		
		
		
	}
}
