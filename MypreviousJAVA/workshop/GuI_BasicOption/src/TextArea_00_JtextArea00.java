import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TextArea_00_JtextArea00 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextArea_00_JtextArea00 frame = new TextArea_00_JtextArea00();
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
	public TextArea_00_JtextArea00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		final JTextArea commentTextArea=new JTextArea("This is a Swing tutorial"+"to make Gui application in Java.",5,20);
		JScrollPane scrolPan=new JScrollPane(commentTextArea);
		scrolPan.setBounds(50, 20, 250, 150);
		contentPane.add(scrolPan);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
