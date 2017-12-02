package MultiWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myMainWindow {

	private JFrame frame;
	private JTextField myTxfild;
	private JPanel teaPanel;
	private JPanel coffeyPanel;
	private JPanel firstPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myMainWindow window = new myMainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		firstPanel = new JPanel();
		frame.getContentPane().add(firstPanel, "name_51920011449727");
		firstPanel.setLayout(null);
		
		JButton btnTea = new JButton("TEA");
		btnTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				teaPanel.setVisible(true);
				firstPanel.setVisible(false);
				
			}
		});
		btnTea.setBounds(48, 41, 97, 51);
		firstPanel.add(btnTea);
		
		JButton btnCoffey = new JButton("Coffey");
		btnCoffey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coffeyPanel.setVisible(true);
				firstPanel.setVisible(false);
			}
		});
		btnCoffey.setBounds(270, 41, 97, 51);
		firstPanel.add(btnCoffey);
		
		myTxfild = new JTextField();
		myTxfild.setBounds(101, 161, 228, 29);
		firstPanel.add(myTxfild);
		myTxfild.setColumns(10);
		firstPanel.setVisible(true);
		
		teaPanel = new JPanel();
		frame.getContentPane().add(teaPanel, "name_51924261768602");
		teaPanel.setLayout(null);
		teaPanel.setVisible(false);
		
		JCheckBox greenTea = new JCheckBox("Green Tea.");
		greenTea.setBounds(156, 24, 97, 23);
		teaPanel.add(greenTea);
		
		JCheckBox redTea = new JCheckBox("Red Tea.");
		redTea.setBounds(156, 61, 97, 23);
		teaPanel.add(redTea);
		
		JCheckBox blackTea = new JCheckBox("Black Tea.");
		blackTea.setBounds(156, 96, 97, 23);
		teaPanel.add(blackTea);
		
		JButton btnTeaDon = new JButton("Done !");
		btnTeaDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=new String();
				if(greenTea.isSelected()){
					s="Green Tea.";
				}
				if(redTea.isSelected()){
					s=s+"Read Tea.";
				}
				if(blackTea.isSelected()){
					s=s+"Black Tea.";
				}
				myTxfild.setText(s);
				
				
				teaPanel.setVisible(false);
				firstPanel.setVisible(true);
			}
		});
		btnTeaDon.setBounds(156, 156, 97, 37);
		teaPanel.add(btnTeaDon);
		
		coffeyPanel = new JPanel();
		frame.getContentPane().add(coffeyPanel, "name_51932491754410");
		coffeyPanel.setLayout(null);
		coffeyPanel.setVisible(false);
		
		JCheckBox blackCoffey = new JCheckBox("Black Coffey.");
		blackCoffey.setBounds(158, 61, 108, 23);
		coffeyPanel.add(blackCoffey);
		
		JCheckBox coldCoffey = new JCheckBox("Cold Coffey.");
		coldCoffey.setBounds(158, 101, 119, 23);
		coffeyPanel.add(coldCoffey);
		
		JCheckBox normalCoffey = new JCheckBox("Normal Coffey.");
		normalCoffey.setBounds(158, 25, 119, 23);
		coffeyPanel.add(normalCoffey);
		
		JButton btncoffeyDon = new JButton("Done !");
		btncoffeyDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=new String();
				if(blackCoffey.isSelected()){
					s="Black coffey.";
				}
				if(coldCoffey.isSelected()){
					s=s+"Cold Coffey.";
				}
				if(normalCoffey.isSelected()){
					s=s+"Normal Coffey";
				}
				myTxfild.setText(s);
				
				coffeyPanel.setVisible(false);
				firstPanel.setVisible(true);
			}
		});
		btncoffeyDon.setBounds(158, 166, 97, 44);
		coffeyPanel.add(btncoffeyDon);
	}
}
