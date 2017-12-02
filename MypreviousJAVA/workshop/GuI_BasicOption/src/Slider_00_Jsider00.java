import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider_00_Jsider00 extends JFrame {

	private JPanel contentPane;
	private JLabel StatusLable2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slider_00_Jsider00 frame = new Slider_00_Jsider00();
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
	public Slider_00_Jsider00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		StatusLable2=new JLabel();
		StatusLable2.setBounds(326, 204, 100, 26);
		contentPane.add(StatusLable2);
		
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,100,10);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				StatusLable2.setText("Value is: "+((JSlider)e.getSource()).getValue());
				
			}
		});
		slider.setBounds(104, 93, 150, 26);
		contentPane.add(slider);
		
		
		
		
		
		
		
		
	}

}
