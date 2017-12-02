package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DifferentTypeListener.WindowListener_00.CustomWindowListener;

public class MousMotionListener_00 extends JFrame {

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
					MousMotionListener_00 frame = new MousMotionListener_00();
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
	public MousMotionListener_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		headerLable=new JLabel("Listener in action: MouseMotionListener. ",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		
		JPanel mypanel=new JPanel();
		mypanel.setBackground(Color.red);
		mypanel.setLayout(new FlowLayout());
		mypanel.addMouseMotionListener(new CustomMouseMotionListener());
		

		JLabel msglablel=new JLabel("Welcome  to Imran Hossain.",JLabel.CENTER);
		mypanel.add(msglablel);
		mypanel.setBounds(50, 100,300, 100);
		contentPane.add(mypanel);
		
		
		
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);

		
		
	}
	class CustomMouseMotionListener implements MouseMotionListener{
		public void mouseDragged(MouseEvent e){
			statusLable.setText("Mouse Dragged: "+e.getX()+" "+ e.getY());
		}
		public void mouseMoved(MouseEvent e){
			statusLable.setText("Mouse Moved: "+e.getX()+" "+e.getY());
		}
		
	}

}
