import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;

public class ScrolBar_00_JscrolBar00 extends JFrame {

	private JPanel contentPane;
	private JLabel StatusLable1;
	private JLabel StatusLable2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrolBar_00_JscrolBar00 frame = new ScrolBar_00_JscrolBar00();
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
	public ScrolBar_00_JscrolBar00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		StatusLable1=new JLabel();
		StatusLable1.setBounds(219, 204, 97, 26);
		contentPane.add(StatusLable1);
		
		StatusLable2=new JLabel();
		StatusLable2.setBounds(326, 204, 100, 26);
		contentPane.add(StatusLable2);
		
	
		final JScrollBar horizontalScrolbar=new JScrollBar(JScrollBar.HORIZONTAL);
		horizontalScrolbar.setMaximum(100);
		horizontalScrolbar.setMinimum(1);
		horizontalScrolbar.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				StatusLable1.setText("Horizontal: "+horizontalScrolbar.getValue()+" ");
				
			}
		});
		horizontalScrolbar.setBounds(50, 50, 150, 20);
		contentPane.add(horizontalScrolbar);
		
		final JScrollBar verticalScrolbar=new JScrollBar(JScrollBar.VERTICAL);
		verticalScrolbar.setMaximum(100);
		verticalScrolbar.setMinimum(1);
		verticalScrolbar.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
			StatusLable2.setText("Vertical: "+verticalScrolbar.getValue());	
				
			}
		});
		verticalScrolbar.setBounds(130,81, 20, 150);
		contentPane.add(verticalScrolbar);
		
		
	
	
		
	}

}
