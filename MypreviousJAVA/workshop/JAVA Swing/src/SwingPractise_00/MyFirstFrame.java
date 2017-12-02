package SwingPractise_00;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JSeparator;

public class MyFirstFrame extends JFrame {

	private JPanel button;
	private JTextField Consol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstFrame frame = new MyFirstFrame();
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
	public MyFirstFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\ALL PHOTO\\facebook PH\\1239973_668559126490089_682548058_n.jpg"));
		setResizable(false);
		setTitle("Imran");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 200, 276, 380);
		button = new JPanel();
		button.setToolTipText("Click me");
		button.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(button);
		button.setLayout(null);
		
		Consol = new JTextField();
		Consol.setEditable(false);
		Consol.setBounds(58, 71, 170, 62);
		button.add(Consol);
		Consol.setColumns(10);
		
		JButton btnNewButton = new JButton("Press Me !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consol.setText("MD IMRAN HOSSAIN");
				
			}
		});
		btnNewButton.setBounds(98, 211, 91, 23);
		button.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(58, 182, 46, 14);
		button.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(24, 255, 130, 31);
		button.add(comboBox);
		
		JSlider slider = new JSlider();
		slider.setBounds(44, 21, 200, 24);
		button.add(slider);
		
		JPanel panel = new JPanel();
		panel.setBounds(157, 182, 87, 40);
		button.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 144, 74, 62);
		button.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(244, 42, 16, 294);
		button.add(scrollBar);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(-17, 144, 121, 23);
		button.add(tglbtnNewToggleButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(176, 144, 29, 22);
		button.add(comboBox_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(135, 259, 109, 23);
		button.add(rdbtnNewRadioButton);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(58, 297, 26, 18);
		button.add(spinner);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(188, 289, 40, 28);
		button.add(separator);
	}
}
