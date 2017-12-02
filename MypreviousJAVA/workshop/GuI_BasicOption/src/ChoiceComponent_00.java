import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ChoiceComponent_00 extends JFrame {

	private JPanel contentPane;
	private Choice MyCh=new Choice();
	String msg="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoiceComponent_00 frame = new ChoiceComponent_00();
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
	public ChoiceComponent_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		MyCh.add("Android");
		MyCh.add("Java");
		MyCh.add("C++");
		
		
		MyCh.setBounds(151,77, 135, 20);
		contentPane.add(MyCh);
		
		
		
		
		
		
		
		
	}
	
	public void paint(Graphics g){
		msg="Current Selection: ";
		g.drawString(msg, 10, 50);
		
		msg=MyCh.getSelectedItem();
		g.drawString(msg, 10, 80);
		
		
	}

}
