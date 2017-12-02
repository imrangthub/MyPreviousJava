package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CardLayout_00 extends JFrame {

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
					CardLayout_00 frame = new CardLayout_00();
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
	public CardLayout_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(3, 1));
		setContentPane(contentPane);
		
		

		headerLable=new JLabel("Layout in action: CardLayout.",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		final JPanel panels=new JPanel();
		panels.setBackground(Color.red);
		panels.setSize(300,300);
     	contentPane.add(panels);
     	
     	CardLayout layouts=new CardLayout();
     	layouts.setHgap(10);
     	layouts.setVgap(10);
     	panels.setLayout(layouts);
     	
     	JPanel buttonPanel=new JPanel(new FlowLayout());
     	buttonPanel.add(new JButton("OK"));
     	buttonPanel.add(new JButton("Cancle"));
     	
     	JPanel textBoxPanel=new JPanel(new FlowLayout());
     	
     	textBoxPanel.add(new JLabel("Name"));
     	textBoxPanel.add(new JTextField(20));
     	
     	panels.add("Text", textBoxPanel);
     	panels.add("Button", buttonPanel);
     	
     	final DefaultComboBoxModel panelName=new DefaultComboBoxModel();
     	panelName.addElement("Button");
     	panelName.addElement("Text");
     	
     	final JComboBox listCombo=new JComboBox(panelName);
     	listCombo.setSelectedIndex(0);
     	
     	JScrollPane  listComboScrollpane=new JScrollPane(listCombo);
     	JButton showbutton=new JButton("Show");
     	showbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data="";
				if(listCombo.getSelectedIndex() !=-1){
					CardLayout cardLayout=(CardLayout)(panels.getLayout());
					cardLayout.show(panels, (String)listCombo.getItemAt(listCombo.getSelectedIndex()));
					
				}
				statusLable.setText(data);
			}
		});
     	
     	contentPane.add(listComboScrollpane);
     	contentPane.add(showbutton);
     	
     	
     	
		
		
		
		
		
		
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
