package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args)
	{
		
		/**
		 * Daniel's Adventure!!!
		 * 
		 * Daniel's African Safari!
		 * 
		 * 
		 * Top choice 3 levels
		 * choice 1 -> 2 levels
		 * choice 2 -> 2 levels
		 * choice 3 -> 3 levels
		 * 
		 * Second tier
		 * choice 1.A ->
		 * choice 1.B ->
		 * 
		 * choice 2.A ->
		 * choice 2.B ->
		 * 
		 * choice 3.A ->
		 * choice 3.B ->
		 * choice 3.C ->
		 * 
		 */
		
		String choice1 = JOptionPane.showInputDialog("You are standing patiently waiting outside the \n"
				+ "African jeep safari tours headquarters in Tanzania. The air is fresh with the morning \n"
				+ "dew lingering in the air. The sun has risen just above the horizon as you spot a jeep \n"
				+ "rumbing towards you. You can't make out the color yet, but you're stoked to be going on \n"
				+ "a safari. As it pulls up, the driver waves you over and excitedly asks you what adventure you \n"
				+ "would like to take.  \n\nPrompt: \nEnter 1 for Lions and nasty saviars. \nEnter 2 for Gorillas and "
				+ "Alligators. \nEnter 3 for Elephants and Giraffes.");
		
		
		if(choice1.equals("1"))
		{
			String choice2 = JOptionPane.showInputDialog("The lion was so slick and you where just chilling then the lion \n"
					+ "came and you ran away you where so scared the lion was so hungry and then the lion \n"
					+ "Was so close to you and there was two paths one path was safe and the other \n"
					+ "path was bad witch one will you pick \n\n"  
					+ "Enter 1 if you want to go to the river full of poisonous water. \nEnter 2 if you want to go to the Volcano "
					+ "full of lava.");
			
			if(choice2.contentEquals("1")) {
				
				JOptionPane.showMessageDialog(null,"YOU DIED!!!!!!!!!");	
			
			} else if(choice2.contentEquals("2")) {
				
				JOptionPane.showMessageDialog(null, "YOU DIED!!!!!!!");
				
			} else {
				
				JOptionPane.showMessageDialog(null, "The road less traveled is the path to safety\n"
						+ "The road leads back to the Jeep safari headquarters where you are thankful \n"
						+ "to be alive.");
			}
		} else if(choice1.contentEquals("2")) {
			
			String choice3 = JOptionPane.showInputDialog("The gorillas see that you are eating a bannana and they "
					+ "start to chase you \nThe gorilla took your bannana \nwhat would you do.\n\n"
					+ "Enter 1 if you would fight back.\n"
					+ "Enter 2 if you would be chill.");
			
			if(choice3.equals("1")) {
				
				JOptionPane.showMessageDialog(null,"You went and tried to get your bannana back but then the\n"
						+ "gorilla punched you and YOU DIED!!!!!!!!!!!!");
			}
			
			if(choice3.contentEquals("2")) {
				//JOption
			}
		}
	}
}
























