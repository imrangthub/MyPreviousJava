package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeWindow {

	private JFrame MainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeWindow window = new HomeWindow();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainFrame = new JFrame();
		MainFrame.setBounds(100, 100, 450, 398);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.getContentPane().setLayout(null);
		
		JLabel MainWindow = new JLabel("Main Window");
		MainWindow.setFont(new Font("Tahoma", Font.BOLD, 20));
		MainWindow.setBounds(10, 23, 348, 57);
		MainFrame.getContentPane().add(MainWindow);
		
		JButton btnClickMe = new JButton("Click Me !");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.dispose();
				SecondWindow SeWin=new SecondWindow();
				SeWin.setVisible(true);
			}
		});
		btnClickMe.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClickMe.setBounds(284, 323, 142, 23);
		MainFrame.getContentPane().add(btnClickMe);
		
		JLabel imgLabel_1 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Islamic_1.jpg")).getImage();
		imgLabel_1.setIcon(new ImageIcon(img));
		imgLabel_1.setBounds(185, 0, 251, 297);
		MainFrame.getContentPane().add(imgLabel_1);
	}
}
