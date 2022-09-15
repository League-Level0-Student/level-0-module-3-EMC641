package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	
		String string1 = JOptionPane.showInputDialog("Are you happy?"); 

		if(string1.equals ("yes"))  {
	
			JOptionPane.showMessageDialog(null , "Keep doing whatever your doing");  
		}
		
		else if(string1.equals ("no")) {
			
			String string2 = JOptionPane.showInputDialog("Do you want to be happy?"); 
			
			if(string2.equals ("no")) {
				
				JOptionPane.showMessageDialog(null , "Keep doing whatever your doing");  
					}
			
			if(string2.equals("yes")) { 
				
				
				JOptionPane.showMessageDialog(null , "Change something");  
				
			}
			}
		
		
		
		
		
		
	}
}
