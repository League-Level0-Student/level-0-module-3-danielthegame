
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		
			
		//1. Create a new Robot
		Robot boby=new Robot();
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		boby.penDown();
		boby.move(100);
		
		//3. Set the pen width to 10
		boby.setPenWidth(10);
		
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		while(true)
		{
			
			//4. Ask the user what color pen they would like the robot to draw with
			String input=JOptionPane.showInputDialog("what is favorite color?");
			
			//5. Use an if/else statement to set the pen color that the user requested
			if ( input.equalsIgnoreCase("Red")) 
			{
				boby.setPenColor(Color.red);  
				boby.turn(-90);
			} 
			else if(input.equalsIgnoreCase("Green"))
			{	
				boby.setPenColor(Color.green);  
				boby.turn(-105);
			
			}
			else if(input.equalsIgnoreCase("Blue"))
			{
				boby.setPenColor(Color.blue);  
				boby.turn(105);
			}
			else if (input.equals(""))
			{
				//6. If the user doesn’t enter anything, choose a random color
				Random r = new Random();
				boby.setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
				boby.turn(130);
			}
			else 
			{
				boby.setPenColor(Color.yellow);
				boby.turn(90);
			}	
			
			boby.move(200);
		
        
		}
	}
}
