import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class ProgressBar_00_JProgrssbar00 extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private Task task;
	private JButton startButton;
	private JTextArea OutputArea;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressBar_00_JProgrssbar00 frame = new ProgressBar_00_JProgrssbar00();
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
	public ProgressBar_00_JProgrssbar00() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		progressBar=new JProgressBar(0, 100);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		progressBar.setBounds(20, 50, 334, 51);
		contentPane.add(progressBar);
		
		
		OutputArea=new JTextArea("", 5, 20);
		
		JScrollPane scrollpanes=new JScrollPane(OutputArea);
		scrollpanes.setBounds(154, 124, 200, 100);
		contentPane.add(scrollpanes);
		
		startButton=new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				task=new Task();
				task.start();
					
				
				
			}
		});
		
		
		startButton.setBounds(10, 112, 134, 51);
		contentPane.add(startButton);
		
		
		
		
		
		
		
	}
	
	private class Task extends Thread{
		public Task(){
			
		}
		public void run(){
			for(int i=0; i<=100; i+=10){
				final int progress=i;
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						progressBar.setValue(progress);
						OutputArea.setText(OutputArea.getText()+String.format("Complited %d%% of task.\n",progress));
					
						
					}
				});
				try {
					Thread.sleep(300);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}
