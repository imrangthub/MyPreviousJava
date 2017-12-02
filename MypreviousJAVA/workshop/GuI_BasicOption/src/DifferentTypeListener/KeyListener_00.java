package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DifferentTypeListener.MouseListener_00_ClickedPosition00.CustomMouseListener;

public class KeyListener_00 extends JFrame {

	private JPanel contentPane;
	private JLabel headerLable;
	private JLabel statusLable;
	private JTextField mytextFields;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyListener_00 frame = new KeyListener_00();
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
	public KeyListener_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		

		
		headerLable=new JLabel("Listener in action: Key Listener. ",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		
		mytextFields=new JTextField(10);
		mytextFields.addKeyListener(new CustomKeyListener());
		mytextFields.setBounds(39, 100, 161, 30);
		contentPane.add(mytextFields);
		
		JButton myBut=new JButton("OK");
		
		myBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				statusLable.setText("Entered text: "+
			
					mytextFields.getText());
				
			}
		});
		myBut.setBounds(210, 101, 100, 30);
		contentPane.add(myBut);
		
		
		
		
	
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);
		

		
		
	}
	 class CustomKeyListener implements KeyListener{
		public void keyTyped(KeyEvent e){
	
			
		}
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				statusLable.setText("Entered text: "+mytextFields.getText());
			}
			
		}
		public void keyReleased(KeyEvent e){
		     statusLable.setText(mytextFields.getText());
			
		}
	}

}
