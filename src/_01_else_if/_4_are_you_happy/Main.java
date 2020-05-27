package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args)
	{
		//if - else if exercise
		//String no = "";
		
		String answer = JOptionPane.showInputDialog(null,"Are you happy"); //IS THESE CORRECT?????
		
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
			
		} else {
			
			JOptionPane.showMessageDialog(null, "THEY ANSWERED ANYTHING OTHER THAN NO, YES, and BOB");
		}
		
		//stuff for any answer happens here.
		JOptionPane.showMessageDialog(null,"HAPPENS ALL THE TIME!");
	}
}
