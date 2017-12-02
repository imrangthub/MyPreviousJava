package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ActionListener_00 extends JFrame {

	private JPanel contentPane;
	private JLabel headerLable;
	private JLabel statusLable;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionListener_00 frame = new ActionListener_00();
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
	public ActionListener_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		headerLable=new JLabel("Listener in action: Action Listionoer");
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JButton MyButton=new JButton("OK");
		MyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				statusLable.setText("Ok Button clicked.");
				
			}
		});
		MyButton.setBounds(151, 100, 100, 30);
		contentPane.add(MyButton);
		
		statusLable=new JLabel("");
		statusLable.setBounds(50, 200, 350, 20);
		contentPane.add(statusLable);
		
		
		
		
		
		
		
		
		
	}

}
