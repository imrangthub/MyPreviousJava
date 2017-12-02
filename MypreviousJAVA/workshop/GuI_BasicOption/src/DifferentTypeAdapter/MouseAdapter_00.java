package DifferentTypeAdapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MouseAdapter_00 extends JFrame {

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
					MouseAdapter_00 frame = new MouseAdapter_00();
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
	public MouseAdapter_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		headerLable=new JLabel("Listener in action: MouseAdapter. ",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.red);
		panel.setLayout(new FlowLayout());
		panel.setBounds(100, 100, 300, 100);
		contentPane.add(panel);
		
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				statusLable.setText("Mouse click on: "+
			e.getX()+" "+e.getY());
			}
		});
		
		JLabel msgl=new JLabel("Welcome Imran",JLabel.CENTER);
		msgl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				statusLable.setText("Now Clicked: "+
			e.getX()+" "+e.getY());
			}
		});
		
		panel.add(msgl);

		
		
		
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);

		
		
		
		
	}

}
