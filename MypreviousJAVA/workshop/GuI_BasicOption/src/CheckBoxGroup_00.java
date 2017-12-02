import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ItemEvent;

public class CheckBoxGroup_00 extends JFrame {

	private JPanel contentPane;
	private String msg="";
	private Checkbox JAVA,ANDROID;
	private CheckboxGroup CBG;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxGroup_00 frame = new CheckBoxGroup_00();
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
	public CheckBoxGroup_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    CBG=new CheckboxGroup();
	    
	    JAVA=new Checkbox("programming JAVA: ", CBG, true);
	    JAVA.setFont(new Font("Times New Roman", Font.BOLD, 12));
	    JAVA.setBounds(165, 66, 147, 50);
	    contentPane.add(JAVA);
	    
	    
	    ANDROID=new Checkbox("Android Programmint.", CBG, false);
	    ANDROID.setFont(new Font("Times New Roman", Font.BOLD,12));
	    ANDROID.setBounds(162, 10, 150, 50);
	    contentPane.add(ANDROID);
	 
		
	}
	
	public void paint(Graphics g){
		msg="Current Selection: ";
		g.drawString(msg, 10, 50);
		
		msg=CBG.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 70);
		
		msg=CBG.getSelectedCheckbox().getLabel();
		g.drawString(msg, 20, 100);
				
	}

}
