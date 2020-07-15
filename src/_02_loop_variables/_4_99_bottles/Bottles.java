package _02_loop_variables._4_99_bottles;

public class Bottles {

	public static void main(String[] agrs)
	{
		
		/*
		 * Print the lyrics to 99 bottles of beer on the wall in a for loop.
		 
		 * I.E.
		 * 99 bottles of beer on the wall, 99 bottles of beer.
		 * Take one down and pass it around, 98 bottles of beer on the wall.
		 *
		 * 98 bottles of beer on the wall, 98 bottles of beer.
		 * Take one down and pass it around, 97 bottles of beer on the wall.
		 *	
		 * 97 bottles of beer on the wall, 97 bottles of beer.
		 * Take one down and pass it around, 96 bottles of beer on the wall.
		 */
		for(int beersNotDrank = 99; beersNotDrank>0; beersNotDrank--) {
		
			System.out.println(beersNotDrank + " bottles of beer on the wall, " + beersNotDrank + 
					" bottles of beer.\n"
					+ "Take one down and pass it around, 98 bottles of beer on the wall.\n");
		}
		
	}
}
