import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class CheckBoxs_00_JCheckboxs00 extends JFrame {

	private JPanel contentPane;
	private JButton MyButton1,MySubmitBt,MyCancleBt;
	private JLabel headerLable,statusLable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxs_00_JCheckboxs00 frame = new CheckBoxs_00_JCheckboxs00();
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
	public CheckBoxs_00_JCheckboxs00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);		
		setContentPane(contentPane);
		
		
		headerLable=new JLabel("This is Header Lable", JLabel.CENTER);
		headerLable.setFont(new Font("Times New Roman", Font.BOLD, 14));
		headerLable.setLocation(100, 10);
		headerLable.setSize(200, 50);
		contentPane.add(headerLable);
		
		
		statusLable=new JLabel("This is Status Lable",JLabel.CENTER);
		statusLable.setFont(new Font("Times New Roman", Font.BOLD, 14));
		statusLable.setLocation(100, 198);
		statusLable.setSize(200, 50);
		contentPane.add(statusLable);
		
		
		final JCheckBox chkApple=new JCheckBox("Apple");
		chkApple.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				statusLable.setText("Apple Checkbox: " +
			(e.getStateChange()==1?"Checked":"Unchecked"));
				
			}
		});
		chkApple.setBounds(20, 100, 104, 91);
		chkApple.setMnemonic(KeyEvent.VK_C);
		contentPane.add(chkApple);
		
		
		final JCheckBox chkMango=new JCheckBox("Mango");
		chkMango.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				statusLable.setText("Mang checkbox: "+
			
				(e.getStateChange()==1?"Checked":"Unchecked"));
				
			}
		});
		chkMango.setMnemonic(KeyEvent.VK_M);
		chkMango.setBounds(189, 100, 90, 29);
		contentPane.add(chkMango);
		
		final JCheckBox chkPeer= new JCheckBox("Peer");
        chkPeer.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				statusLable.setText("Peer CheckBox: "+
			
				(e.getStateChange()==1?"Checked":"Unchecked"));
				
			}
		});
		chkPeer.setBounds(336, 100, 94, 29);
		chkPeer.setMnemonic(KeyEvent.VK_P);
		contentPane.add(chkPeer);
		
		
	
	
		
		
		
		
	
		
		
		
		
		
	}

}
