
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;

public class Frame_01 extends Frame{
	
	public Frame_01(){
		addWindowListener(new MywindowAdapter());
	
	}

	public static void main(String[] args) {
		Frame_01 frame=new Frame_01();
		frame.setTitle("Press x to closed Window");
		frame.setSize(new Dimension(400, 450));
		frame.setLocation(900, 150);
		frame.setVisible(true);
		
	}

}

class MywindowAdapter extends WindowAdapter{
	
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}
