package DifferentTypeAdapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WindowAdapter_00 extends JFrame {

	
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
					WindowAdapter_00 frame = new WindowAdapter_00();
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
	public WindowAdapter_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		headerLable=new JLabel("Listener in action: WindowAdapter. ",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		
		JButton okbutton=new JButton("OK");
		
		final JFrame aboutFrame=new JFrame();
		aboutFrame.setSize(300, 200);
		aboutFrame.setTitle("this is AboutFrame");
		aboutFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				aboutFrame.dispose();
			}
		});
	
		JLabel msglb=new JLabel("Welcome BaBu");
		aboutFrame.add(msglb);
		aboutFrame.setVisible(true);
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);
		
		
	}

}
