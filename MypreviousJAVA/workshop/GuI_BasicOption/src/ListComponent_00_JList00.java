import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class ListComponent_00_JList00 extends JFrame {

	private JPanel contentPane;
	private JLabel statusLable;
	private String data,fdata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListComponent_00_JList00 frame = new ListComponent_00_JList00();
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
	public ListComponent_00_JList00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final DefaultListModel fruitsName=new DefaultListModel();
		
		fruitsName.addElement("Apple");
		fruitsName.addElement("Grapes");
		fruitsName.addElement("Mango");
		fruitsName.addElement("Peer");
		
		final JList fruitList=new JList(fruitsName);
		fruitList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		fruitList.setSelectedIndex(0);
		fruitList.setVisibleRowCount(3);
		
		JScrollPane fruiiListScorollpane=new JScrollPane(fruitList);
		fruiiListScorollpane.setBounds(100, 100, 100, 50);
		contentPane.add(fruiiListScorollpane);
		
		final DefaultListModel vegName=new DefaultListModel();
		vegName.addElement("Lady Finger");
		vegName.addElement("Onion");
		vegName.addElement("Potato");
		vegName.addElement("Tomato");
		
		final JList vegList=new JList(vegName);
		vegList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		vegList.setSelectedIndex(0);
		vegList.setVisibleRowCount(3);
		
		JScrollPane vegListScrollPane=new JScrollPane(vegList);
		vegListScrollPane.setBounds(250, 100, 100, 50);
		contentPane.add(vegListScrollPane);
		
		
		
		JButton ShowButton=new JButton("Show Value");
		ShowButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (fruitList.getSelectedIndex()!=-1){
					fdata="Fruits:- "+fruitList.getSelectedValue();
					
				}
				
				if(vegList.getSelectedIndex()!=-1){
					data="Vegetables:- ";
					for(Object vegetable:vegList.getSelectedValues()){
						data+=vegetable+" ";
					}
				}
				statusLable.setText(fdata+". "+data+".");
				
			}
		});
		ShowButton.setBounds(240, 50, 147, 30);
		contentPane.add(ShowButton);
		
		
		
		
		statusLable=new JLabel("Your Select item: ");
		statusLable.setFont(new Font("Times New Roman", Font.BOLD, 14));
        statusLable.setBounds(40, 198, 400, 50);
	    contentPane.add(statusLable);
		
		
	}

}
