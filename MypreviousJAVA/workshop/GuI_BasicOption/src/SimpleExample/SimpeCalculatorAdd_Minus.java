package SimpleExample;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SimpeCalculatorAdd_Minus {

	private JFrame frame;
	private JTextField textFld_1;
	private JTextField textFld_2;
	private JTextField resultFld;
	private JButton addButton;
	private JButton minousButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpeCalculatorAdd_Minus window = new SimpeCalculatorAdd_Minus();
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
	public SimpeCalculatorAdd_Minus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFld_1=new JTextField();
		textFld_1.setBounds(10, 20,200, 50);
		frame.getContentPane().add(textFld_1);
		textFld_1.setColumns(10);
		
		textFld_2=new JTextField();
		textFld_2.setBounds(225, 20, 200, 50);
		frame.getContentPane().add(textFld_2);
		textFld_2.setColumns(10);
		
		resultFld=new JTextField();
		resultFld.setBounds(159, 100, 120, 40);
		frame.getContentPane().add(resultFld);
		resultFld.setColumns(10);
		
		
		
		addButton=new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int Num1,Num2,Ans;
				try {
					Num1=Integer.parseInt(textFld_1.getText());
					Num2=Integer.parseInt(textFld_2.getText());	
					Ans=Num1+Num2;
					resultFld.setText(Integer.toString(Ans));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Wrong Input");
				}
				
			
				
				
			}
		});
		
		
		
		
		addButton.setBounds(10, 150, 200, 50);
		frame.getContentPane().add(addButton);
		
		minousButton = new JButton("MINOUS");
		minousButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int Num1,Num2,Ans;
				try {
					Num1=Integer.parseInt(textFld_1.getText());
					Num2=Integer.parseInt(textFld_2.getText());	
					Ans=Num1-Num2;
					resultFld.setText(Integer.toString(Ans));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Wrong Input");
				}
				
			
			
				
			}
		});
		minousButton.setBounds(233, 151, 192, 49);
		frame.getContentPane().add(minousButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
