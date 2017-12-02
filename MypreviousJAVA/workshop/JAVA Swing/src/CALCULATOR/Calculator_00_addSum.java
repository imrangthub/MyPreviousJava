package CALCULATOR;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculator_00_addSum extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_00_addSum frame = new Calculator_00_addSum();
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
	public Calculator_00_addSum() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 250, 350, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 139, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 25, 125, 51);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton ButtonAdd = new JButton("Addition");
		ButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,Ans;
				try {
					
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					Ans=num1+num2;
					textField_2.setText(Integer.toString(Ans));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Wrong Input");
				}
				
			}
		});
		ButtonAdd.setBounds(84, 213, 91, 23);
		contentPane.add(ButtonAdd);
		
		JButton ButtonSub = new JButton("Substract");
		ButtonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int Num1,Num2,ans;
				try {
					
					Num1=Integer.parseInt(textField.getText());
					Num2=Integer.parseInt(textField_1.getText());
					ans=Num1-Num2;
					textField_2.setText(Integer.toString(ans));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "wrong input");
					
				}
			}
		});
		ButtonSub.setBounds(197, 213, 91, 23);
		contentPane.add(ButtonSub);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 87, 86, 97);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
