package Frame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
 class colorRectangle{
	
	private int width;
	private int height;
	private int x,y;
	private JFrame WindoW;
	private Color colors;
	
	public colorRectangle(){
		
		WindoW=new JFrame("MyWindow");
		WindoW.setSize(200, 200);
		WindoW.setBackground(Color.RED);
		
		width=40;
		height=20;
		x=80;
		y=90;
		
		colors=Color.BLUE;
		
		
		
		WindoW.setVisible(true);
	}
	
	public void paint(){
		Graphics G=WindoW.getGraphics();
		G.setColor(colors);
		G.fillRect(x, y, width, height);
	}
}

public class Frame_02 {

	public static void main(String[] args) {
		colorRectangle Rac_1=new colorRectangle();
		
		Rac_1.paint();

		
		
		
		
	}

}
