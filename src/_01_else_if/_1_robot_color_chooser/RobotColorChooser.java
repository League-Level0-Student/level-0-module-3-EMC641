
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		 rob.penDown();
		 rob.setSpeed(3);
		 
		//3. Set the pen width to 10
		 rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		 for(int i=0; i<10;i++) {
		 String pencolor = JOptionPane.showInputDialog("What color pen do you want the robot to draw with? Choose from red,blue,black, or green.");  
		//5. Use an if/else statement to set the pen color that the user requested
		 if(pencolor.equals("blue")) {
			 rob.setPenColor(0,0,200);
			 }
		 else if(pencolor.equals("green")) {
			 rob.setPenColor(0,200,0);
			 }
		 else if(pencolor.equals("red")) {
			 rob.setPenColor(200,0,0);
			 }
		 else if(pencolor.equals("black")) {
			 rob.setPenColor(0,0,0);
		 }
		 
		 
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		 
		 else {
			 
			rob.setRandomPenColor(); 
			 }
		
		 
		 int count= 0;
		 while (count < 4) {
			  rob.move(180);;
			    rob.turn(90);
			    count+=1;  

	}
}
	}
}

