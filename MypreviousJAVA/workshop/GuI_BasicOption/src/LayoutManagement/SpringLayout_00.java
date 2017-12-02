package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class SpringLayout_00 extends JFrame {

	private JPanel controlPanel;
	private JLabel headerLable;
	private JLabel statusLable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpringLayout_00 frame = new SpringLayout_00();
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
	public SpringLayout_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		controlPanel.setLayout(new GridLayout(3, 1));
		setContentPane(controlPanel);
		
		headerLable=new JLabel("Layout in action: GroupLayout.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		controlPanel.add(headerLable);
		
		
		SpringLayout layout = new SpringLayout();
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		JLabel label = new JLabel("Enter Nam e: ");
		JTextField textField = new JTextField("", 15);
		panel.add(label);
		panel.add(textField);
		layout.putConstraint(SpringLayout.WEST, label,5,
		SpringLayout.WEST, controlPanel);
		layout.putConstraint(SpringLayout.NORTH, label,5,
		SpringLayout.NORTH, controlPanel);
		layout.putConstraint(SpringLayout.WEST, textField,5,
		SpringLayout.EAST, label);
		layout.putConstraint(SpringLayout.NORTH, textField,5,
		SpringLayout.NORTH, controlPanel);
		layout.putConstraint(SpringLayout.EAST, panel,5,
		SpringLayout.EAST, textField);
		layout.putConstraint(SpringLayout.SOUTH, panel,5,
		SpringLayout.SOUTH, textField);
		controlPanel.add(panel);
		
		
		
	}

}
