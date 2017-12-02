package Practise;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SecondPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SecondPanel() {
		setLayout(null);
		setBackground(Color.green);
		setBounds(0, 0, 200, 200);
		
		
		
		
		JButton btnNewButton_1 = new JButton("click");
		btnNewButton_1.setBounds(55, 82, 91, 23);
		add(btnNewButton_1);

	}
	public void callme(){
		
	}
	

}
