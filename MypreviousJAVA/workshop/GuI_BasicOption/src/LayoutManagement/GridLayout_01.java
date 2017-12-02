package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridLayout_01 extends JFrame {
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
					GridLayout_01 frame = new GridLayout_01();
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
	public GridLayout_01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3, 1));
		setContentPane(contentPane);
		
		headerLable=new JLabel("Layout in action: GridbagLayout_2.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JPanel panelG2=new JPanel();
		panelG2.setBackground(Color.red);
		panelG2.setSize(300, 300);
		GridLayout layoutG=new GridLayout(0,3);
		layoutG.setHgap(10);
		layoutG.setVgap(10);
		
		panelG2.setLayout(layoutG);
		panelG2.add(new JButton("button_1"));
		panelG2.add(new JButton("button_2"));
		panelG2.add(new JButton("button_3"));
		panelG2.add(new JButton("button_4"));
		panelG2.add(new JButton("button_5"));
		contentPane.add(panelG2);
	}

}
