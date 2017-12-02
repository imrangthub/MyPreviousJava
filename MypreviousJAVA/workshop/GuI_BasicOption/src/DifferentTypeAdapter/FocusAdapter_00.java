package DifferentTypeAdapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class FocusAdapter_00 extends JFrame {

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
					FocusAdapter_00 frame = new FocusAdapter_00();
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
	public FocusAdapter_00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		
		headerLable=new JLabel("Listener in action: FocusAdapter. ",JLabel.CENTER);
		headerLable.setBounds(50, 50, 350, 20);
		contentPane.add(headerLable);
		
		
		JButton okButon=new JButton("OK");
		okButon.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e){
			statusLable.setText(statusLable.getText()+
					e.getComponent().getClass().getSimpleName()+" Gained focous.");
		}
		});
		okButon.setBounds(50, 100, 122, 43);
		contentPane.add(okButon);
		
		
		JButton cancelbutton=new JButton("Cancel");
		cancelbutton.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e){
				statusLable.setText(statusLable.getText()+
						e.getComponent().getClass().getSimpleName()+" Lost focus.");
			}
		});
		
		cancelbutton.setBounds(200, 100, 122, 43);
		contentPane.add(cancelbutton);
		
		
		
		
		
		
		statusLable=new JLabel("",JLabel.CENTER);
		statusLable.setBounds(50, 200, 350, 50);
		contentPane.add(statusLable);

		
		
		
		
		
		
		
	}

}
