import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxs_00_JComboBoxs00 extends JFrame {

	private JPanel contentPane;
	private JLabel StatusLable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxs_00_JComboBoxs00 frame = new ComboBoxs_00_JComboBoxs00();
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
	public ComboBoxs_00_JComboBoxs00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		final DefaultComboBoxModel fruitsName=new DefaultComboBoxModel();
		
		fruitsName.addElement("Apple");
		fruitsName.addElement("Grapes");
		fruitsName.addElement("Mango");
		fruitsName.addElement("Peer");
		
		final JComboBox fruitCombo=new JComboBox(fruitsName);
		fruitCombo.setSelectedIndex(0);
		
		
		JScrollPane fruitScorollpane=new JScrollPane(fruitCombo);
		fruitScorollpane.setBounds(100, 50, 100, 30);
		contentPane.add(fruitScorollpane);
		
		JButton ShowButton=new JButton("Show Value");
		ShowButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String data="";
				if(fruitCombo.getSelectedIndex()!=-1){
					data="You Select: "+fruitCombo.getItemAt(fruitCombo.getSelectedIndex());
				}
				
				StatusLable.setText(data);
			}
		});
		
		ShowButton.setBounds(240, 50, 147, 30);
		contentPane.add(ShowButton);
		
		StatusLable=new JLabel("Your Select item: ");
		StatusLable.setFont(new Font("Times New Roman", Font.BOLD, 14));
				StatusLable.setBounds(140, 198, 200, 50);
				contentPane.add(StatusLable);
		
		
		
		
		
		
		
		
		
		
	}

}
