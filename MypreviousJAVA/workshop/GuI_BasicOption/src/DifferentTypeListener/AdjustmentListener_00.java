package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;

public class AdjustmentListener_00 extends JFrame {

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
					AdjustmentListener_00 frame = new AdjustmentListener_00();
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
	public AdjustmentListener_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		headerLable=new JLabel("Listener in action: Adjustment Listener.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		JScrollBar scrollbar=new JScrollBar();
		scrollbar.addAdjustmentListener(new CustomAdjustmwentListener());
		scrollbar.setBounds(232, 81, 20, 120);
		contentPane.add(scrollbar);
		
	
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 20);
		contentPane.add(statusLable);
		
		
		
		
		
	}
	class CustomAdjustmwentListener implements AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent e){
			statusLable.setText("Adjustment Value: "+
		Integer.toString(e.getValue()));
		}
	}

}
