import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;

public class Lable_00 extends Frame{
	
	public Lable_00(){
		addWindowListener(new MywindowAdapter());
	
	}

	public static void main(String[] args) {
		Frame_01 frame=new Frame_01();
		frame.setTitle("Press x to closed Window");
		frame.setSize(new Dimension(400, 450));
		frame.setLocation(900, 150);
		frame.setVisible(true);
		
		
		Label MyLable=new Label("This is a Lable.");
		MyLable.setLocation(200, 200);
		frame.add(MyLable);
		
		
		
	}

}

class MywindowAdapte extends WindowAdapter{
	
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}
