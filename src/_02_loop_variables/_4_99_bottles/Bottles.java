package _02_loop_variables._4_99_bottles;

public class Bottles {

	public static void main(String[] agrs)
	{
		
		/*
		 * Print the lyrics to 99 bottles of juice boxes on the wall in a for loop.
		 * 
		 *
		 * I.E.
		 * 99 bottles of beer on the wall, 99 bottles of juice boxes.
		 * Take one down and pass it around, 98 bottles of juice boxes on the wall.
		 *
		 * 98 bottles of beer on the wall, 98 bottles of juice boxes.
		 * Take one down and pass it around, 97 bottles of juice boxes on the wall.
		 *	
		 * 97 bottles of beer on the wall, 97 bottles of juice boxes.
		 * Take one down and pass it around, 96 bottles of juice boxes on the wall.
		 */
		for(int juiceBoxesNotDrank = 99; juiceBoxesNotDrank > 0; juiceBoxesNotDrank--) {
			
			String myBox = "boxes";
			
			if(juiceBoxesNotDrank == 1) {
				 
				myBox = "box";
				//System.out.println(myBox);
			}
		
			System.out.println(juiceBoxesNotDrank + " juice " + myBox + " on the wall, " + juiceBoxesNotDrank + 
					" juice " + myBox + ".\n"
					+ "Take one down and pass it around, " + (juiceBoxesNotDrank-1) + " juice boxes on the wall.\n");
			
		}
		
	}
}
