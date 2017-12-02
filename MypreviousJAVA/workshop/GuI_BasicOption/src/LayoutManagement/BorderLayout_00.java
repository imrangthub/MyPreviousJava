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

public class BorderLayout_00 extends JFrame {

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
					BorderLayout_00 frame = new BorderLayout_00();
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
	public BorderLayout_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3,1));
		setContentPane(contentPane);
		
		
		headerLable=new JLabel("Layout in action: BorderLayout.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JPanel panels=new JPanel();
		panels.setBackground(Color.red);
		panels.setSize(300, 300);
		BorderLayout layout=new BorderLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		panels.setLayout(layout);
		
		panels.add(new JButton("Center"), BorderLayout.CENTER);
		panels.add(new JButton("Line Start"),BorderLayout.LINE_START);
		panels.add(new JButton("Line End"),BorderLayout.LINE_END);
		
		panels.add(new JButton("East"), BorderLayout.EAST);
		panels.add(new JButton("West"), BorderLayout.WEST);
		panels.add(new JButton("North"),BorderLayout.NORTH);
		panels.add(new JButton("South"), BorderLayout.SOUTH);
		
		contentPane.add(panels);
		
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);

		
		
	}

}
