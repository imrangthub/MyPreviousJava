package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MouseListener_00_ClickedPosition00 extends JFrame {

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
					MouseListener_00_ClickedPosition00 frame = new MouseListener_00_ClickedPosition00();
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
	public MouseListener_00_ClickedPosition00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		

		
		headerLable=new JLabel("Listener in action: MouseListener. ",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		
		JPanel mypanel=new JPanel();
		mypanel.setBackground(Color.red);
		mypanel.setLayout(new FlowLayout());
		mypanel.addMouseListener(new CustomMouseListener());
		

		JLabel msglablel=new JLabel("Welcome  to Imran Hossain.",JLabel.CENTER);
		mypanel.add(msglablel);
		mypanel.setBounds(50, 100,300, 100);
		contentPane.add(mypanel);
		
		
		
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);

		
		
	}
	class CustomMouseListener implements MouseListener{
	       
		public void mouseClicked(MouseEvent e){
			statusLable.setText("Mouse Clicked: "+e.getX()+" "+e.getY());
		}
		public void mousePressed(MouseEvent e){
			
		}
		public void mouseReleased(MouseEvent e){
			
		}
		public void mouseEntered(MouseEvent e){
			
		}
		public void mouseExited(MouseEvent e){
			
		}
	}

}
		
		
		
		
		
		
		
		
		
		
		
		