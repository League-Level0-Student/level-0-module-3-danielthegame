
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String numOfCats = JOptionPane.showInputDialog("How many cat do you have?");
		
		//System.out.println("Number of cats " + numOfCats);
		//System.out.println("Did you get it? " + getIt());
		
		// 2. Convert their answer into an int
		int totalCats = Integer.valueOf(numOfCats);
		
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(totalCats >= 3) {
			
			JOptionPane.showMessageDialog(null,"Crazy Cat Lady");
		}
		
		/*
		 * && -> AND
		 * || -> OR
		 * == -> Comparator
		 * >  -> Greater than
		 * <  -> Less than
		 * >= -> Greater than or Equal to
		 * <= -> Less than or Equal to
		 */
		
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		if(totalCats < 3 && totalCats > 0)
		{
			playVideo("https://www.youtube.com/watch?v=FHH6hIc2GyE");
		}
		
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
	}
	

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			//java.awt.Desktop.getDesktop().browse(uri);
			System.out.println("Playing video at URI :" + videoURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

