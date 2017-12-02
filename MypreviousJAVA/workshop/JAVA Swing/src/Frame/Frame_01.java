package Frame;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame_01 {

	public static void main(String[] args) {
		JFrame MyFrame=new JFrame("ImranFrame");
		
		MyFrame.setSize(400, 500);
		MyFrame.setLocation(850, 150);
		
		MyFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Programing\\BABU.JPG"));
		
		
		
		
	
		
		
		
		MyFrame.setVisible(true);
	

	}

}
