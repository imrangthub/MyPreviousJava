package Face_Frame_JPlan;

import javax.swing.JFrame;

public class FaceMainCls {

	public static void main(String[] args) {
		
		JFrame WindowFrame=new JFrame();
	//	WindowFrame.setSize(400, 400);
		WindowFrame.setLocation(900, 200);
		
	
		FaceSuperCls Mypanel=new FaceSuperCls();
		
		
		   WindowFrame.getContentPane().add(Mypanel);
		   WindowFrame.pack();
		
	
		
		
		
	          WindowFrame.setVisible(true);
	}

}
