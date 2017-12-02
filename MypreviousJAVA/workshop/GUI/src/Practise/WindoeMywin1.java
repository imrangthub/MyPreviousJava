package Practise;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class WindoeMywin1 {


	private JFrame frame;
	private JPanel MainWinPanel,secondpan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindoeMywin1 window = new WindoeMywin1();
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
	public WindoeMywin1() {
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
		
		
		MainWinPanel=new JPanel();
		MainWinPanel.setBackground(Color.red);
		MainWinPanel.setBounds(0, 0, 200, 200);
		MainWinPanel.setLayout(null);
		frame.getContentPane().add(MainWinPanel);
		
		secondpan=new JPanel();
		secondpan.setLayout(null);
		secondpan.setBounds(0, 0, 200, 200);
		secondpan.setBackground(Color.black);
		frame.getContentPane().add(secondpan );
		secondpan.setVisible(false);
		
		
		
		
		JButton btnNewButton = new JButton("New button");
		MainWinPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("click");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainWinPanel.setVisible(false);
				secondpan.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(55, 82, 91, 23);
		MainWinPanel.add(btnNewButton_1);
		
		
		
	}
}
