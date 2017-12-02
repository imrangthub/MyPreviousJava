package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WindowListener_00 extends JFrame {

	private JPanel contentPane;
	private JLabel headerLable;
	private JLabel statusLable;
	private JFrame	aboutFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowListener_00 frame = new WindowListener_00();
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
	public WindowListener_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		headerLable=new JLabel("Listener in action: WindowListener. ",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		
		JButton okButton=new JButton("OK");
		
	aboutFrame=new JFrame();
	aboutFrame.setBounds(150, 150, 400, 400);
	aboutFrame.setTitle("WindowListener Demo");
	aboutFrame.addWindowListener(new CustomWindowListener());
	
	JPanel panelss=new JPanel();
	panelss.setBackground(Color.lightGray);
	JLabel maglable=new JLabel("Welcome to Imran Hossain.",JLabel.CENTER);
	panelss.add(maglable);
	aboutFrame.add(panelss);
	aboutFrame.setVisible(true);
				
		
		
		
		
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);

	}
	
	class CustomWindowListener implements WindowListener{
		public void windowOpened(WindowEvent e){
			
		}
		public void windowClosing(WindowEvent e){
			aboutFrame.dispose();
		}
		public void windowClosed(WindowEvent e){
			
		}
		public void windowIconified(WindowEvent e){
			
		}
		public void windowDeiconified(WindowEvent e){
			
		}
		public void windowActivated(WindowEvent e){
			
		}
		public void windowDeactivated(WindowEvent e){
			
		}
	}

}
