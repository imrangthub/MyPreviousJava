package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GroupLayout_00 extends JFrame {

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
					GroupLayout_00 frame = new GroupLayout_00();
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
	public GroupLayout_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3, 1));
		setContentPane(contentPane);
		
		headerLable=new JLabel("Layout in action: GroupLayout.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		
		JPanel panelGr=new JPanel();
		panelGr.setSize(200, 200);
		
		GroupLayout layoutGr=new GroupLayout(panelGr);
		layoutGr.setAutoCreateGaps(true);
		layoutGr.setAutoCreateContainerGaps(true);
		JButton btn1=new JButton("Button_1");
		JButton btn2=new JButton("Button_2");
		JButton btn3=new JButton("utton_3");
		
		
		
		layoutGr.setHorizontalGroup(layoutGr.createSequentialGroup()
				
				.addComponent(btn1)
				.addGroup(layoutGr.createSequentialGroup())
				.addGroup(layoutGr.createParallelGroup(
						GroupLayout.Alignment.LEADING)
						.addComponent(btn2)
				        .addComponent(btn3)
                	)
				);
	
		
	layoutGr.setVerticalGroup(layoutGr.createSequentialGroup()
			.addComponent(btn1)
			.addComponent(btn2)
			.addComponent(btn3)
			);
	       
		panelGr.setLayout(layoutGr);
        contentPane.add(panelGr);		
		
		
		
		
		
		
	}

}
