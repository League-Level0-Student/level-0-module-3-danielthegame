
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(101) + 1;

		// 2. Print out the random variable above
		JOptionPane.showMessageDialog(null, random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response
			String n = JOptionPane.showInputDialog(null, "Guess the number");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(n);
			// 5. if the guess is correct
			if (number == random) {
				JOptionPane.showMessageDialog(null, "Congrats you got it correct");
				System.exit(0);
			} // 6. Win

			// 12. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer.
			// 7. if the guess is high
			if (number > random) { // 8. Tell them it's too high
				JOptionPane.showMessageDialog(null, "To high ");
			}
			// 9. if the guess is low
			if (number < random) { // 10. Tell them it's too low
				JOptionPane.showMessageDialog(null, "To low ");
			} // 13. Tell them they lose
			else {
				JOptionPane.showMessageDialog(null, "You lose ");
			}
		}
	}

}
