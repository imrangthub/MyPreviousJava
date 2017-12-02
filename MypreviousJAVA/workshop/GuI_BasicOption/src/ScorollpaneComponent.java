import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.Scrollbar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ScorollpaneComponent extends JFrame {

	private JPanel contentPane;
	private String msg="";
	private ScrollPane SP=new ScrollPane();
	Label Mylabal=new Label("Programming in Java.");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScorollpaneComponent frame = new ScorollpaneComponent();
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
	public ScorollpaneComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		Mylabal.setFont(new Font("courier New", Font.BOLD, 32));
		
		SP.setLocation(150, 50);
		SP.add(Mylabal);
		contentPane.add(SP);
		
		
		
		
	}

}
