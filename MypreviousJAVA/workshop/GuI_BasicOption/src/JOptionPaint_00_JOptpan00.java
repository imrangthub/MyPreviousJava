import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JOptionPaint_00_JOptpan00 extends JFrame {

	private JPanel contentPane;
	private JFrame mainFrame;
	private JLabel headerLable;
	private JLabel StatusLable;
	private JPanel controlPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaint_00_JOptpan00 frame = new JOptionPaint_00_JOptpan00();
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
	public JOptionPaint_00_JOptpan00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		StatusLable=new JLabel("");
		StatusLable.setBounds(65, 200, 300, 50);
		contentPane.add(StatusLable);
		
		
		
		
		JButton okButton=new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame, "Welcome to TutorialsPoint.com");
				
			}
		});
		okButton.setBounds(10, 45,110, 30);
		contentPane.add(okButton);
		
		JButton javaButton=new JButton("Yes/No");
		javaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int Output=JOptionPane.showConfirmDialog(mainFrame, "Click any Button","Tutorialspoint.com",JOptionPane.YES_NO_OPTION);
				if(Output==JOptionPane.YES_OPTION){
					StatusLable.setText("Yes Selected.");
				}else if(Output==JOptionPane.NO_OPTION){
						StatusLable.setText("No selected.");
					}
		
			}
		});
		
		javaButton.setBounds(182, 45,80,30);
		contentPane.add(javaButton);
		
		JButton cancleButton=new JButton("Yes/No/Cancle");
		cancleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Output=JOptionPane.showConfirmDialog(mainFrame, "Click any Button", "TutorialsPoint.com",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if (Output==JOptionPane.YES_OPTION) {
					StatusLable.setText("Yes Selected.");
				}else if (Output== JOptionPane.NO_OPTION) {
					StatusLable.setText("NoSelected.");
				}else if (Output==JOptionPane.CANCEL_OPTION) {
					StatusLable.setText("Cancle selected");
					
				}
					
				
				
					
			}
		});
		cancleButton.setBounds(316, 45, 110, 30);
		contentPane.add(cancleButton);
		
		
		
		
		
		
		
	}

}
