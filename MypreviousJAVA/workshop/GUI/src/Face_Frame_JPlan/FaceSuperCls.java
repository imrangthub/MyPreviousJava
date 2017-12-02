package Face_Frame_JPlan;
import java.lang.Thread;
import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.*;

public class FaceSuperCls extends JPanel{
	
    ;
	
       private final int BASE_X=120,BASE_Y=60;
       
   
       
       
    	   
       public FaceSuperCls(){
    	   setBackground(Color.blue);
    	   setPreferredSize(new Dimension(300, 300));
        }
       
       public  void paintComponent(Graphics page){
    	   
    	   super.paintComponent(page);
    	   
    	   
    	   
    	   
    	   
    	   page.setColor(Color.yellow);
    	   page.fillOval(BASE_X, BASE_Y, 80, 80); // head
    	   page.fillOval(BASE_X-5, BASE_Y+20, 90, 40); //ears
    	   page.setColor(Color.black);
    	   page.drawOval(BASE_X+20, BASE_Y+30, 15, 7); //eyes
    	   page.drawOval(BASE_X+45, BASE_Y+30, 15, 7);  //eyes
    	   page.fillOval(BASE_X+25, BASE_Y+31, 5, 5);  //pupils
    	   page.fillOval(BASE_X+50, BASE_Y+31, 5, 5);
    	   page.drawArc(BASE_X+20, BASE_Y+25, 15, 7, 0, 180); //eyebrows
    	   page.drawArc(BASE_X+45, BASE_Y+25, 15, 7, 0, 180);
    	   page.drawArc(BASE_X+35, BASE_Y+40, 15, 10, 180, 180); // nose
    	   
         

    	   
    	   
       }
       
       

}
