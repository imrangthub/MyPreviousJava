package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EventHandling_00 extends JFrame {

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
					EventHandling_00 frame = new EventHandling_00();
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
	public EventHandling_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		headerLable=new JLabel("Control in action: Button.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JButton okButton=new JButton("OK");
		okButton.setActionCommand("OK");
		okButton.addActionListener(new ButtonClickListener());
		okButton.setBounds(50, 100, 80, 20);
		contentPane.add(okButton);
		
		JButton submitButton=new JButton("submit");
		
	
	
	
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);
		
		

		
		
	}
	private class ButtonClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String command=e.getActionCommand();
			if (command.equals("OK")) {
				statusLable.setText("Ok Button Clicked.");
				
			}else if(command.equals("submit")){
				statusLable.setText("Submit Button clicked.");
			}else {
				statusLable.setText("Cancel Button clicked.");
			}

			}
		}
	}


