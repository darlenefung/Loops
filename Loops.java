/** 
 * 
 * 
 */
 
 
public class Loops
{
	public static void main(String[] args)
	{
		// call to while loop
		whileLoop();
		
		System.out.println("----------------");
		// call to for loop
		forLoop();
		
		System.out.println("----------------");
		nestedWhileLoop();
		
		System.out.println("----------------");
		nestedForLoop();
		
		System.out.println("----------------");
		rightSideUpTriangle();
		
		System.out.println("----------------");
		upsideDownTriangle();
	}
	
	
	public static void whileLoop()
	{
		int counter = 0;
		while (counter <= 10)
		{
			System.out.println(counter);
			counter ++;  // increments by 1, same as counter += 1
		}
	}
	
	public static void forLoop()
	{
		for (int i =1; i <= 10; i++)
		{
			System.out.println(i);		
		}
	}
	
	public static void nestedWhileLoop()
	{
		int number = 4; 
		
		int row = 1;
		char star = '*';
		
		while (row <= number)
		{	int column = 1;
			while (column <= number) 
				{
				System.out.print(star);
				column ++; 
				}
			System.out.println();
			row ++; 
		}
	}
	
	public static void nestedForLoop()
	{
		int n = 4;
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j < n; j++)
			{
				System.out.print("*");
			}
			System.out.println("*");
			
		}
	
	}
	
	public static void rightSideUpTriangle()
	{
		int n = 4; 
		int counter = 0;
		while (counter < n)
		{	
			String PrintString = "*";
			int StarCounter = 1;
			while (StarCounter <= counter)
			{
				PrintString += "*";
				StarCounter ++;
			}
			
			System.out.println(PrintString);
			counter ++;
		}
	
	}
	
	
	public static void upsideDownTriangle()
	{
		int n = 4; 
		int counter = n;
		while (counter > 0)
		{	
			String PrintString = "*";
			int StarCounter = counter;
			while (StarCounter > 1)
			{
				PrintString += "*";
				StarCounter -= 1;
			}
			
			System.out.println(PrintString);
			counter -= 1;
		}
	
	}
	
	
	
}