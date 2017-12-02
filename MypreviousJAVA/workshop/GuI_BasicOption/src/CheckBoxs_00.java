import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;

public class CheckBoxs_00 extends JFrame {

	private JPanel contentPane;
	private String msg="";
	private Checkbox MyCheckBox1;
	private Checkbox MyCheckBox2;
	private JButton btnPressMe;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxs_00 frame = new CheckBoxs_00();
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
	public CheckBoxs_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		MyCheckBox1=new Checkbox("Java", null, true);
		MyCheckBox1.setBounds(128, 10, 50, 50);
		contentPane.add(MyCheckBox1);
		
		MyCheckBox2=new Checkbox("C++");
		MyCheckBox2.setBounds(194, 10, 50, 50);
		contentPane.add(MyCheckBox2);
	
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(276, 75, 91, 120);
		contentPane.add(lblNewLabel);
		
		
		
		
		
	}
	public void itemStateChanged(ItemListener ie){
		repaint();
	}
	
	
	public void paint(Graphics g){
		
		msg="Current Status";
		g.drawString(msg, 50, 100);
		msg="Java: "+MyCheckBox1.getState();
		g.drawString(msg, 50, 120);
		
		msg="C++: "+MyCheckBox2.getState();
		g.drawString(msg, 50, 150);
		
	}
}
