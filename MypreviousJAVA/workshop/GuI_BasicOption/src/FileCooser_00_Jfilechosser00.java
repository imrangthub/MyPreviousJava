import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FileCooser_00_Jfilechosser00 extends JFrame {

	private JPanel contentPane;
	private JLabel StatusLable;
	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileCooser_00_Jfilechosser00 frame = new FileCooser_00_Jfilechosser00();
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
	public FileCooser_00_Jfilechosser00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		StatusLable=new JLabel("");
		StatusLable.setBounds(65, 200, 300, 50);
		contentPane.add(StatusLable);
		
		final JFileChooser fileDialog=new JFileChooser();
		JButton ShowFileDialogButton=new JButton("Opene File");
		ShowFileDialogButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int returnVal=fileDialog.showOpenDialog(mainFrame);
				if (returnVal==JFileChooser.APPROVE_OPTION) {
					java.io.File file= fileDialog.getSelectedFile();
					StatusLable.setText("File Selected: "+file.getName());
					
				} else {
					StatusLable.setText("Open Command cancle by User.");

				}
				
			}
		});
		
		ShowFileDialogButton.setBounds(181, 107, 100, 40);
		contentPane.add(ShowFileDialogButton);
		
		
		
		
		
		
		
	}

}
