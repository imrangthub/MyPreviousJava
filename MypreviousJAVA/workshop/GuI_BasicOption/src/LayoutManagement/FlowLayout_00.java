package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FlowLayout_00 extends JFrame {

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
					FlowLayout_00 frame = new FlowLayout_00();
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
	public FlowLayout_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3, 2));
		setContentPane(contentPane);
		
		headerLable=new JLabel("Layout in action: FlowLayout.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JPanel panelnn=new JPanel();
		panelnn.setBackground(Color.red);
		panelnn.setSize(200, 200);
		FlowLayout layoutt=new FlowLayout();
		layoutt.setHgap(10);
		layoutt.setVgap(10);
		panelnn.setLayout(layoutt);
		panelnn.add(new JButton("OK"));
		panelnn.add(new JButton("Cancle"));
		
		contentPane.add(panelnn);
		
		
	}

}
