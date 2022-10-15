package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		
		
		String string1 = JOptionPane.showInputDialog("Hello. I will be asking you a story. YOU will type an answer"
				+ "relating to my story. Are you ready?"); 

		if(string1.equals ("yes"))  {
			String string2 = JOptionPane.showInputDialog("There once was a person who was walking around a park. She came "
					+ "to an area with two pathes, Path A and Path B. What path are you going to choose? Make sure your answer is all lowercase."); 
			
			
			if(string2.equals("path a"))  {
				String string3 = JOptionPane.showInputDialog("You ran into lava and you are somewhere else.");
				
			}
			System.exit(0);
			
			 if(string2.equals ("path b"))   {
				String string4 = JOptionPane.showInputDialog("You survied. YAY");
			}
			System.exit(0);
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		else if(string1.equals ("no")) {
		
			JOptionPane.showMessageDialog(null , "Ok. So you don't want to see the story, bye.");  
			System.exit(0);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

