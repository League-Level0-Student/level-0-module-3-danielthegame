
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	
	public static void main(String[] args) {
		
		int lineLength = 50 ;
		int distanceBetweenStars = 50;
		
		Robot megatron = new Robot();
		megatron.setSpeed(25);
		
		for(int m=1; m<9; m++ ) {
		
			//m = 1 -> 100 + 50  -> setX(150)
			//m = 2 -> 200 + 100 -> setX(300)
			//m = 3 -> 300 + 150 -> setX(450)
			
			// 1. Set the X position of the robot so that it starts on the left. 
			// You also need to show the robot to see the result of this line."
			megatron.setX((m * lineLength) + (m * distanceBetweenStars));
			megatron.penDown();
			
			// 2. Make the robot draw a star shape. Hint: angle=144.
			megatron.turn(144);
			megatron.move(lineLength);
			
			megatron.turn(144);
			megatron.move(lineLength);
			
			megatron.turn(144);
			megatron.move(lineLength);
			
			megatron.turn(144);
			megatron.move(lineLength);
			
			megatron.turn(144);
			megatron.move(lineLength);
		}
		
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */
		
		megatron.setY(megatron.getY() + 150);
	}

}
