package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridLayout_00 extends JFrame {

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
					GridLayout_00 frame = new GridLayout_00();
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
	public GridLayout_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3, 1));
		setContentPane(contentPane);
		
		headerLable=new JLabel("Layout in action: GridbagLayout.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JPanel panell=new JPanel();
		panell.setBackground(Color.red);
		panell.setSize(300,300);
		GridBagLayout layoutG=new GridBagLayout();
		panell.setLayout(layoutG);
		GridBagConstraints gbc=new GridBagConstraints();
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		panell.add(new JButton("Button_1"), gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		panell.add(new JButton("Button 2"),gbc);
		
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.gridx = 0;
		gbc.gridy = 1;
		panell.add(new JButton("Button 3"),gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		panell.add(new JButton("Button 4"),gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 2;
		panell.add(new JButton("Button 5"),gbc);
		
		
		
		contentPane.add(panell);
		
	}

}
