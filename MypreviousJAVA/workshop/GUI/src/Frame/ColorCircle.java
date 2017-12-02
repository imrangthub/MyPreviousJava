package Frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorCircle{

	public static void main(String[] args) {
		
		MyColorPn MyCpln=new MyColorPn();
		
		
		JFrame HomeWindow=new JFrame();
		
	
		HomeWindow.setLocation(900, 300);
		
		HomeWindow.getContentPane().add(MyCpln);
		HomeWindow.pack();
		
		HomeWindow.setVisible(true);
		
	
	}

}

class MyColorPn extends JPanel{

    private final int BASE_X=120,BASE_Y=60;
	
	 public MyColorPn() {
 	   setBackground(Color.BLACK);
 	   setPreferredSize(new Dimension(300, 300));
     }
	 
	 
	 public void paintComponent(Graphics DrowintPage){
		super.paintComponent(DrowintPage);
		
		  DrowintPage.setColor(Color.red);
   	   DrowintPage.fillOval(BASE_X, BASE_Y, 80, 80); // red
   	   
   	   
   	  DrowintPage.setColor(Color.blue);
  	   DrowintPage.fillOval(BASE_X-100, BASE_Y-50, 100, 100); // red
		
  	  DrowintPage.setColor(Color.green);
 	   DrowintPage.fillOval(BASE_X-30, BASE_Y+90, 110, 110); // red
 	   
 	   
 	  DrowintPage.setColor(Color.magenta);
	   DrowintPage.fillOval(BASE_X-100, BASE_Y+120, 110, 110); // red
		
	 }
	
	
	
}
