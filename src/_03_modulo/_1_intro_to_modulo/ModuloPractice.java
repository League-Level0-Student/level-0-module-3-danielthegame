package _03_modulo._1_intro_to_modulo;

public class ModuloPractice {

	public static void main(String[] args)
	{
		
		//Basic modulo.
		int a = 2 % 2;
		//2 / 2 = 1 time.. (0 left over).
		
		//What is 'a'? = 0
		System.out.println(a);
		
		int b = 3 % 2; 
		//3 > 2 -> 2/2 rem 1
		//What is 'b'? = 
		System.out.println(b);
		
		int c = 4 % 2;
		//4 / 2 = 2 rem = 0
		//What is 'c'? = 0
		System.out.println(c);
		System.out.println();
		
		int d = 5 % 2;
		//What is 'd'? = 5/2 = 2 rem 1
		System.out.println(5 / 2); // 2
		System.out.println(5 % 2); // 1 which is the remainder
		System.out.println();
		
		int e = 5 % 3;
		System.out.println(5 / 3);
		//5 - 3 = 2
		//What is 'e'?
		System.out.println(e);
		System.out.println();
		
		int k = 6 % 3;
		System.out.println(6 / 3); //2
		System.out.println(6 % 3);
		System.out.println();
		//6 - 3 = 3
		//3 - 3 = 0		
		
		int f = 7 % 3;
		//7 - 3 = 4
		//4 - 3 = 1
		//What is 'f'?
		System.out.println(f);
				
	}
}
