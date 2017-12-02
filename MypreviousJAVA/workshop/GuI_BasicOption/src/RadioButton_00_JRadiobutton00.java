import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class RadioButton_00_JRadiobutton00 extends JFrame {

	private JPanel contentPane;
	private JLabel StatusLable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton_00_JRadiobutton00 frame = new RadioButton_00_JRadiobutton00();
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
	public RadioButton_00_JRadiobutton00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final JRadioButton radApple=new JRadioButton("Apple",true);
		final JRadioButton radMango=new JRadioButton("Mango");
		final JRadioButton radPeer=new JRadioButton("Peer");
		
		radApple.setMnemonic(KeyEvent.VK_C);
		radMango.setMnemonic(KeyEvent.VK_M);
		radPeer.setMnemonic(KeyEvent.VK_P);
		
		
		radApple.setBounds(50, 100, 80, 30);
		contentPane.add(radApple);
		radApple.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				StatusLable.setText("Apple: "+
			(e.getStateChange()==1?"Checked":"Unchecked"));
				
			}
		});
		
		radMango.setBounds(150, 100, 80, 30);
		contentPane.add(radMango);
		radMango.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				StatusLable.setText("Mango: "+
			
			(e.getStateChange()==1?"Checked":"Unchecked"));
				
			}
		});
		
		radPeer.setBounds(260, 100, 80, 30);
		contentPane.add(radPeer);
		radPeer.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				StatusLable.setText("Peer: "+
			(e.getStateChange()==1?"Checked":"Unchecked"));
				
			}
		});
		
		
		
		JButton ShowButton=new JButton("Show Value");
	
		
		ShowButton.setBounds(240, 50, 147, 30);
		contentPane.add(ShowButton);
		
		StatusLable=new JLabel("Your Select item: ");
		StatusLable.setFont(new Font("Times New Roman", Font.BOLD, 14));
		StatusLable.setBounds(140, 198, 200, 50);
	    contentPane.add(StatusLable);
		
		
		
		
	}

}
