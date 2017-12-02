package CALCULATOR;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JLabel;
import java.awt.Window.Type;

public class Calculator_00 extends JFrame {

	private JPanel contentPane;
	private JTextField Display;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton btnNewButton_1;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton btnNewButton_2;
	private JButton button_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_00 frame = new Calculator_00();
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
	public Calculator_00() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Programing\\BABU.JPG"));
		setTitle("ImranCalculator");
		
		setBounds(950, 200, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Display = new JTextField();
		Display.setEditable(false);
		Display.setBounds(25, 20, 250, 50);
		contentPane.add(Display);
		
		Display.setColumns(10);
		
		button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"1");
				
			}
		});
		button.setBounds(26, 160, 50, 30);
		contentPane.add(button);
		
		button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"2");
				
			}
		});
		button_1.setBounds(95, 160, 50, 30);
		contentPane.add(button_1);
		
		button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"3");
			}
		});
		button_2.setBounds(160, 160, 50, 30);
		contentPane.add(button_2);
		
		button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"4");
			}
		});
		button_3.setBounds(24, 200, 52, 30);
		contentPane.add(button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"5");
			}
		});
		button_4.setBounds(95, 200, 50, 30);
		contentPane.add(button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"6");
			}
		});
		button_5.setBounds(160, 200, 50, 30);
		contentPane.add(button_5);
		
		button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"7");
			}
		});
		button_6.setBounds(26, 241, 50, 30);
		contentPane.add(button_6);
		
		button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"8");
			}
		});
		button_7.setBounds(95, 241, 50, 30);
		contentPane.add(button_7);
		
		button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"9");
			}
		});
		button_8.setBounds(160, 241, 50, 30);
		contentPane.add(button_8);
		
		button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"0");
			}
		});
		button_9.setBounds(25, 282, 72, 40);
		contentPane.add(button_9);
		
		button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+".");
			}
		});
		button_10.setBounds(113, 282, 72, 40);
		contentPane.add(button_10);
		
		btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"/");
			}
		});
		btnNewButton_1.setBounds(220, 105, 55, 40);
		contentPane.add(btnNewButton_1);
		
		button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"*");
			}
		});
		button_11.setBounds(220, 160, 55, 30);
		contentPane.add(button_11);
		
		button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"-");
			}
		});
		button_12.setBounds(220, 201, 55, 29);
		contentPane.add(button_12);
		
		button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"+");
			}
		});
		button_13.setBounds(220, 241, 55, 30);
		contentPane.add(button_13);
		
		
		btnNewButton_2 = new JButton("+/-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
			    int Num=Integer.parseInt(Gettext);
				if (Num>0) {
					Display.setText("-"+Gettext);
					
				} else {
					Display.setText("+"+Gettext);

				}
				
			}
		});
		btnNewButton_2.setBounds(95, 105, 50, 40);
		contentPane.add(btnNewButton_2);
		
		button_15 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gettext=Display.getText();
				Display.setText(Gettext+"%");
			}
		});
		button_15.setBounds(160, 105, 50, 40);
		contentPane.add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Display.setText(null);
			}
		});
		btnC.setBounds(25, 105, 50, 44);
		contentPane.add(btnC);

		button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ScriptEngineManager c=new ScriptEngineManager();
				ScriptEngine r=c.getEngineByName("JavaScript");
				String Result=Display.getText();
				try {
					Display.setText(r.eval(Result).toString());
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					Display.setText("Error");
				}
			}
		});
		button_14.setBounds(203, 282, 72, 40);
		contentPane.add(button_14);
	}
}
