package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class SecondWindow extends JFrame {

	private JPanel SecondFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondWindow frame = new SecondWindow();
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
	public SecondWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		SecondFrame = new JPanel();
		SecondFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SecondFrame);
		SecondFrame.setLayout(null);
		
		JLabel SecondWindow_1 = new JLabel("Second Window");
		SecondWindow_1.setBounds(88, 60, 271, 96);
		SecondWindow_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		SecondFrame.add(SecondWindow_1);
		
		JButton Button_1 = new JButton("Click me <<");
		Button_1.setBounds(143, 162, 169, 44);
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		 SecondWindow Sw=new SecondWindow();
		
		
		 Sw.dispose();
		   
			
			}
		});
		SecondFrame.add(Button_1);
		
		String item[]={"Bush","Truck","Csr","Motor Cycle"};
		JComboBox comboBox = new JComboBox(item);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(10, 11, 152, 22);
		SecondFrame.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(73, 15, 46, 14);
		SecondFrame.add(lblNewLabel);
	}
}
