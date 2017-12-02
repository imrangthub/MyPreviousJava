package TeaShop;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class MainWindowF {

	private JFrame frame;
	private JPanel headePanel;
	private JLabel shopNameLable,welcomeLable;
	private JLabel bodyLable01,bodyLable02,teaHeaderLable,coffeyHeaderLable;
	private JButton p1p1_nextButton,p1p1_previousButton;
	private JPanel bodyPanel01,bodyPanel02;
	private JLabel order,order2,orderQuality,orderQuantity,orderQuality2,orderQuantity2;
	private JLabel orderAmount,netAmount,orderAmount2,netAmount2;
	private JLabel itemTea,itemCoffey,itemSoftDrink;
	private Checkbox teaChBox,coffeyChBox,softChBox;
	private CheckboxGroup CBG;
	private String msg,fullOrder;
	private JPanel bodyPan01_panel_1;
	private JPanel bodyPan01_panel_2;
	private JPanel bodyPan01_panel_3;
	private JPanel bodyPan02_panel_1;
	private JPanel teaPan_1,teaPan_2,teaPan_3;
	private JPanel teaPan_1_3;
	private JPanel teaPan_1_2;
	private JPanel teaPan_1_1;
	private JTextPane TexPan1;
	private JTextField ordertext;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowF window = new MainWindowF();
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
	public MainWindowF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("TeaShop");
		frame.setSize(1380,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		headePanel=new JPanel();
		headePanel.setLayout(null);
		headePanel.setBounds(0, 0, 1370, 200);
		headePanel.setBackground(Color.darkGray);
		frame.getContentPane().add(headePanel);
		
		shopNameLable=new JLabel("MiNe TeaShop",JLabel.CENTER);
		shopNameLable.setForeground(Color.WHITE);
		shopNameLable.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		shopNameLable.setBounds(411, 0, 450, 50);
		headePanel.add(shopNameLable);
		
		welcomeLable=new JLabel("Well Come To our mine TeaShop",JLabel.CENTER);
		welcomeLable.setForeground(Color.LIGHT_GRAY);
		welcomeLable.setFont(new Font("MingLiU_HKSCS-ExtB", Font.BOLD, 20));
		welcomeLable.setBounds(411, 50, 450,50);
		headePanel.add(welcomeLable);
		
		//  bodyPanel01..........................
		
		bodyPanel01=new JPanel();
		bodyPanel01.setBounds(0, 200, 680, 500);
		bodyPanel01.setBackground(Color.lightGray);
		frame.getContentPane().add(bodyPanel01);
		bodyPanel01.setLayout(new CardLayout(0, 0));
		
		//       bodyPanel01_panel_1......................
		
		bodyPan01_panel_1= new JPanel();
	    bodyPan01_panel_1.setLayout(null);
	    bodyPan01_panel_1.setBackground(Color.pink);
		bodyPanel01.add(bodyPan01_panel_1, "name_2685207859201");
		bodyPan01_panel_1.setBounds(0, 200, 680, 500);
		
		
		
		bodyLable01=new JLabel("Please Choise your Item and Click Next.",JLabel.CENTER);
		bodyLable01.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bodyLable01.setBounds(10, 5, 660, 40);
		bodyPan01_panel_1.add(bodyLable01);
		
		CBG=new CheckboxGroup();
	
		msg=new String();
		
		teaChBox=new Checkbox("", CBG, true);
		teaChBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				msg="Tea";
				fullOrder=msg;
				ordertext.setText(fullOrder);
			
				
			}
		});
		teaChBox.setBounds(75, 130, 20, 20);
		bodyPan01_panel_1.add(teaChBox);
		
		coffeyChBox=new Checkbox("", CBG, false);
		coffeyChBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				order2.setText("Coffey.");
				
			}
		});
		coffeyChBox.setBounds(339, 130, 20, 20);
		bodyPan01_panel_1.add(coffeyChBox);
		
		softChBox=new Checkbox("", CBG, false);
		softChBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				order2.setText("Soft Drink.");
				
			}
		});
		softChBox.setBounds(566, 130, 20, 20);
		bodyPan01_panel_1.add(softChBox);
		
		
		itemTea=new JLabel("Tea Lable",JLabel.CENTER);
		itemTea.setBackground(Color.RED);
		itemTea.setBounds(10, 156, 200, 200);
		bodyPan01_panel_1.add(itemTea);
		
		itemCoffey=new JLabel("Coffey",JLabel.CENTER);
		itemCoffey.setBounds(238, 156, 200, 200);
		bodyPan01_panel_1.add(itemCoffey);
		
		itemSoftDrink=new JLabel("Soft Drink",JLabel.CENTER);
		itemSoftDrink.setBounds(470, 156, 200,200);
		bodyPan01_panel_1.add(itemSoftDrink);
		
		    
		 p1p1_nextButton=new JButton("Next >>");
		 p1p1_nextButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		
		 		if (teaChBox.getState()==true) {
		 			bodyPan01_panel_2.setVisible(true);
		 			bodyPan01_panel_1.setVisible(false);
		 		}else if (coffeyChBox.getState()==true) {
						
					bodyPan01_panel_1.setVisible(false);
					bodyPan01_panel_3.setVisible(true);
					
				} else {

				}
		 	
		 	}
		 	
		 });
		 p1p1_nextButton.setBounds(587, 420, 80, 30);
		 bodyPan01_panel_1.add(p1p1_nextButton);
		 
		 p1p1_previousButton=new JButton("Back <<");
		 p1p1_previousButton.setBounds(10, 420, 80, 30);
		 bodyPan01_panel_1.add(p1p1_previousButton);
		 
		
		
		
		                                   // bodypan01_panel_2 or Tea Menu start......
		
		bodyPan01_panel_2= new JPanel();
		bodyPan01_panel_2.setLayout(null);
		bodyPan01_panel_2.setBackground(Color.green);
		bodyPanel01.add(bodyPan01_panel_2, "name_2692617281049");
		
		
		teaHeaderLable=new JLabel("Our Tea Quality.",JLabel.CENTER);
		teaHeaderLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		teaHeaderLable.setBounds(133, 11, 428, 36);
		bodyPan01_panel_2.add(teaHeaderLable);
		
		
		teaPan_1_3=new JPanel();
		teaPan_1_3.setBackground(Color.lightGray);
		teaPan_1_3.setBounds(490, 130, 180, 220);
		bodyPan01_panel_2.add(teaPan_1_3);
		teaPan_1_3.setLayout(null);
		
		JLabel GingerteaLb=new JLabel("Ginger Tea.",JLabel.CENTER);
		GingerteaLb.setBounds(10, 11, 160, 31);
		teaPan_1_3.add(GingerteaLb);
		GingerteaLb.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		
		
		
		teaPan_1_2=new JPanel();
		teaPan_1_2.setBackground(Color.lightGray);
		teaPan_1_2.setBounds(247, 130, 180, 220);
		bodyPan01_panel_2.add(teaPan_1_2);
		teaPan_1_2.setLayout(null);
		
		JLabel GreenteaLb=new JLabel("Green Tea .",JLabel.CENTER);
		GreenteaLb.setBounds(10, 11, 160, 31);
		teaPan_1_2.add(GreenteaLb);
		GreenteaLb.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		teaPan_1_1=new JPanel();
		teaPan_1_1.setBackground(Color.lightGray);
		teaPan_1_1.setBounds(10, 130, 180, 220);
		bodyPan01_panel_2.add(teaPan_1_1);
		teaPan_1_1.setLayout(null);
		
		JLabel GreenTea=new JLabel("Green Tea.",JLabel.CENTER);
		GreenTea.setBounds(0, 0, 0, 0);
		teaPan_1_1.add(GreenTea);

		JLabel GingerTea=new JLabel("Ginger Tea.",JLabel.CENTER);
		GingerTea.setBounds(0, 0, 0, 0);
		teaPan_1_1.add(GingerTea);
		
		JLabel ReaTeaLb=new JLabel("Red Tea.",JLabel.CENTER);
		ReaTeaLb.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ReaTeaLb.setBounds(10, 11, 160, 31);
		teaPan_1_1.add(ReaTeaLb);
		
		 p1p1_nextButton=new JButton("Finish");
		 p1p1_nextButton.setBounds(587, 420, 80, 30);
		 bodyPan01_panel_2.add(p1p1_nextButton);
		 
		 p1p1_previousButton=new JButton("Back <<");
		 p1p1_previousButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				bodyPan01_panel_1.setVisible(true);
				bodyPan01_panel_2.setVisible(false);
			}
		});
		 p1p1_previousButton.setBounds(10, 420, 80, 30);
		 bodyPan01_panel_2.add(p1p1_previousButton);
		
		
		// End bodyPanel01_panel_2
		
		// bodypabel01_panel_3 or coffey panel start......
		 
		 
		bodyPan01_panel_3= new JPanel();
		bodyPan01_panel_3.setLayout(null);
		bodyPan01_panel_3.setBackground(Color.blue);
		bodyPanel01.add(bodyPan01_panel_3, "name_2697302010977");
		
		
		 p1p1_nextButton=new JButton("Finish");
		 p1p1_nextButton.setBounds(587, 420, 80, 30);
		 bodyPan01_panel_3.add(p1p1_nextButton);
		 
		 p1p1_previousButton=new JButton("Back <<");
		 p1p1_previousButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				bodyPan01_panel_1.setVisible(true);
				bodyPan01_panel_3.setVisible(false);
			}
		});
		 p1p1_previousButton.setBounds(10, 420, 80, 30);
		 bodyPan01_panel_3.add(p1p1_previousButton);
		
		
		// End bodyPanel01_panel_2
		
		
	       // bodyPanel_02 Start.......
		
		bodyPanel02=new JPanel();
		bodyPanel02.setBounds(690, 200, 680, 500);
		bodyPanel02.setBackground(Color.lightGray);
		frame.getContentPane().add(bodyPanel02);
		bodyPanel02.setLayout(new CardLayout(0, 0));
		
		     //  bodypanla02_panel_1...    
		
		bodyPan02_panel_1= new JPanel();
		bodyPan02_panel_1.setLayout(null);
		bodyPanel02.add(bodyPan02_panel_1, "name_17666728134129");
		
		
		bodyLable02=new JLabel("Your Summery",JLabel.CENTER);
		bodyLable02.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		bodyLable02.setBounds(194, 11, 350, 50);
		bodyPan02_panel_1.add(bodyLable02);
		
        TexPan1= new JTextPane();
        TexPan1.setBackground(Color.cyan);
        TexPan1.setEditable(false);
	    TexPan1.setBounds(224, 53, 302, 388);
		bodyPan02_panel_1.add(TexPan1);
		
		ordertext=new JTextField();
		bodyPan02_panel_1.add(ordertext);
		ordertext.setBounds(224, 128, 300, 292);
		
		
	     
		
		
		
		
		
	}
}
