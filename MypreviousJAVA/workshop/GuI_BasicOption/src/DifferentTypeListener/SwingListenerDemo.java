package DifferentTypeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.PublicKey;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SwingListenerDemo {

	private JFrame mainframe;
	private JPanel contentPanel;
	private JLabel headerLable;
	private JLabel statusLable;


	public SwingListenerDemo() {
		prepareGUI();
	}
   public static void main(String[]args){
	   SwingListenerDemo swingListenerDemo=new SwingListenerDemo();
	   swingListenerDemo.showContainerListenerDemo();
   }
		
		private void prepareGUI(){
			mainframe=new JFrame("Java Swint Examples");
			mainframe.setSize(400, 400);
			mainframe.setLayout(new GridLayout(3, 1));
		headerLable=new JLabel("",JLabel.CENTER);
	    statusLable=new JLabel("",JLabel.CENTER);
	    
	    statusLable.setSize(350,100);
	    mainframe.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent windowEvent){
	    		System.exit(0);
	    	}
		});
		contentPanel=new JPanel();
		contentPanel.setLayout(new FlowLayout());
		
		mainframe.add(headerLable);
		mainframe.add(contentPanel);
		mainframe.add(statusLable);
		mainframe.setVisible(true);
		
		}
		
		private void showContainerListenerDemo(){
			headerLable.setText("Linstner in action: ContainerListener");
			
			JPanel panel=new JPanel();
			panel.setBackground(Color.magenta);
			panel.addContainerListener(new CustomContainerListener());
			
			JLabel msglable=new JLabel("Welcome to TutorialsPoint Swing tutorial.");
			panel.add(msglable);
			contentPanel.add(panel);
			mainframe.setVisible(true);
		
	}
		
		class CustomContainerListener implements ContainerListener{
			public void componentAdded(ContainerEvent e){
				statusLable.setText(statusLable.getText()+
						e.getComponent().getClass().getSimpleName()+"Added");
			}
			public void componentRemoved(ContainerEvent e){
				statusLable.setText(statusLable.getText()+
						e.getComponent().getClass().getSimpleName()+" removed");
		}
	}
}


