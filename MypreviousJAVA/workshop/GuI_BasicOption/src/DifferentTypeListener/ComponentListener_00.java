package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;

import DifferentTypeListener.AdjustmentListener_00.CustomAdjustmwentListener;

public class ComponentListener_00 extends JFrame {

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
					ComponentListener_00 frame = new ComponentListener_00();
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
	public ComponentListener_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		headerLable=new JLabel("Listener in action: Component Listener.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
	
		JPanel panel=new JPanel();
		panel.setBackground(Color.magenta);
		JLabel msglabel=new JLabel("Welcome to Imran hossain.",JLabel.CENTER);
		panel.add(msglabel);
		panel.setBounds(50, 98, 300, 50);
		
		contentPane.add(panel);
	
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 20);
		contentPane.add(statusLable);

		
	}
	class CoustomComponentListener implements ComponentListener{
		public void componentResized(ComponentEvent e){
			statusLable.setText(statusLable.getText()
					+e.getComponent().getClass().getSimpleName()+"resized.");
		}
		
		public void componentMoved(ComponentEvent e){
			statusLable.setText(statusLable.getText()+
					e.getComponent().getClass().getSimpleName()+"Moved");
		}
		
		public void componentShown(ComponentEvent e){
			statusLable.setText(statusLable.getText()+
					e.getComponent().getClass().getSimpleName()+"Shown.");
		}
		public void componentHidden(ComponentEvent e){
			statusLable.setText(statusLable.getText()+
					e.getComponent().getClass().getSimpleName()+"Hidden.");
		}
	}

}
