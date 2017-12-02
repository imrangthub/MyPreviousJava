import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ListComponent extends JFrame {

	private JPanel contentPane;
	List OS,LANGUAGE;
	String mag="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListComponent frame = new ListComponent();
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
	public ListComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		OS=new List(2, false);
		OS.add("Windows 7");
		OS.add("Windows 8");
		OS.add("Windows 10");
		OS.add("Windows 7");
		OS.add("Windows 8");
		OS.add("Windows 10");
		OS.select(1);
		OS.setBounds(10, 20, 100, 40);
		contentPane.add(OS);
		
		
		LANGUAGE=new List(3, true);
		LANGUAGE.add("Java");
		LANGUAGE.add("C++");
		LANGUAGE.add("Fortan");
		LANGUAGE.add("Cobal");
		LANGUAGE.select(2);
		LANGUAGE.setBounds(150, 20, 100, 40);
		contentPane.add(LANGUAGE);
		
	}

}
