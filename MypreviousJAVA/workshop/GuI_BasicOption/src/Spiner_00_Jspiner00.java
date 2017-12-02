import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spiner_00_Jspiner00 extends JFrame {

	private JPanel contentPane;
	private JLabel StatusLable2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spiner_00_Jspiner00 frame = new Spiner_00_Jspiner00();
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
	public Spiner_00_Jspiner00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		StatusLable2=new JLabel();
		StatusLable2.setBounds(326, 204, 100, 26);
		contentPane.add(StatusLable2);
		
		
		SpinnerModel spinerModl=new SpinnerNumberModel(10, // initial value
				 0, // min
				 
				 100, // max
				 1);  // step 
		JSpinner spiner=new JSpinner(spinerModl);
		spiner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				StatusLable2.setText("Value is: "+((JSpinner)e.getSource()).getValue());
				
			}
		});
		spiner.setBounds(100, 50, 50, 20);
		contentPane.add(spiner);
		
		
		
		
	}

}
