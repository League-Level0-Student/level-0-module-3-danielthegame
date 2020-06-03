package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args)
	{
		//if - else if exercise
		//String no = "";
		
		String answer = JOptionPane.showInputDialog(null,"Are you happy? or is your name bob?"); //IS THESE CORRECT?????
		
		
		/*
		 * no, yes, bob
		 */
		
		/*
		 * psudo code.. 
		 * if - else statements are conditional dependent clauses.
		 * As soon as the first if/else-if evaluates to true.. it will run its 
		 * block, and then drop out of the entire if-else block..
		 * 
		 * int i = 1;
		 * 
		 * if(i == 0)  -> i is 1 NOT 0.. therefore false.
		 * {
		 * 	
		 * 
		 * } else if (i == 1 ) { it is 1 therefore true
		 * 
		 *  System.out.println("ITS TRUE!");
		 *  
		 *
		 * } else if (i == 2) {
		 * 
		 * 
		 * 
		 * } else if (i >=3 ) {
		 * 
		 * 	
		 * } else {
		 * 
		 * 		//Default catch all!
		 * }
		 * 
		 * if - statements are not dependent clauses. Each one is evaluated 
		 * separate from the previous if statement. if one evalutates to true,
		 * the next statement will be evaluated independently as well.
		 * 
		 * if(i == 0) {
		 * 		System.out.println("its 0");
		 * }
		 * 
		 * if(i == 1) {
		 * 		System.out.println("its 1");
		 * }
		 * 
		 * if(i == 2) {
		 * 		System.out.println("its 2");
		 * }
		 * 
		 * if(i == 1 || i ==2) {
		 * 
		 * 		System.out.println("its 1 or 2");
		 * }
		 */
		
		if(answer.contentEquals("no"))
		{
			//Stuff when answer is no happens here.
			String answer2 = JOptionPane.showInputDialog(null,"Do you want to be happy");
			
			if(answer2.contentEquals("no"))
			{
				JOptionPane.showMessageDialog(null,"Keep on doing what you are doing");
				
			} else if(answer2.contentEquals("yes")) {
				
				JOptionPane.showMessageDialog(null, "Change something");
			}
		} else if(answer.contentEquals("yes")) {
			
			JOptionPane.showMessageDialog(null, "Keep on doing what you are doing");
		} else if(answer.contentEquals("bob")) {
		
			JOptionPane.showMessageDialog(null,"Nice you like bob too!!!");

		} else {
			
			JOptionPane.showMessageDialog(null, "THEY ANSWERED ANYTHING OTHER THAN NO, YES, and BOB");
		}
		
	}
}
