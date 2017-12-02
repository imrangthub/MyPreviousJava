import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TextAndPasswordFild_00 extends JFrame {

	private JPanel contentPane;
	private JLabel statusLable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextAndPasswordFild_00 frame = new TextAndPasswordFild_00();
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
	public TextAndPasswordFild_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JLabel nameLable=new JLabel("User ID: ",JLabel.RIGHT);
		nameLable.setBounds(20, 100, 50, 20);
		contentPane.add(nameLable);
		
		final JTextField userText=new JTextField(6);
		userText.setBounds(80, 100, 80, 20);
		contentPane.add(userText);
		
		JLabel passwordLable=new JLabel("Password: ",JLabel.CENTER);
		passwordLable.setBounds(170, 100, 69, 20);
		contentPane.add(passwordLable);
		
		final JPasswordField passwordText=new JPasswordField(6);
		passwordText.setBounds(249, 100, 80, 20);
		contentPane.add(passwordText);
		
		JButton logionButton=new JButton("Login");
		logionButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String data;
				data="User Name: "+userText.getText();
				data+=",Password:  "+ new String(passwordText.getPassword());
				statusLable.setText(data);
			}
		});
		
		logionButton.setBounds(346, 101, 80, 20);
		contentPane.add(logionButton);
		
		statusLable=new JLabel("sdfsdf");
		statusLable.setBounds(80, 200, 300, 50);
		contentPane.add(statusLable);
		
		
		
		
		
	}

}
