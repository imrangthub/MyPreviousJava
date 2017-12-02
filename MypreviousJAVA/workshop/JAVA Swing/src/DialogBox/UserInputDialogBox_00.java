package DialogBox;

import javax.swing.JOptionPane;

public class UserInputDialogBox_00 {

	public static void main(String[] args) {
		String Num1,Num2;
		int a,b;
		
		try {
			
			Num1=JOptionPane.showInputDialog("Enter your First Number:");
			Num2=JOptionPane.showInputDialog("Enter your Second Number:");
			a=Integer.parseInt(Num1);
			b=Integer.parseInt(Num2);
			JOptionPane.showMessageDialog(null, (a+b));
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Sorry Input !");
		}
		
		
	}

}
