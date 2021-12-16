


public class biggest  {
	
	public static void main (String[] args) 
	{
		int fact = 1;
		IBIO.output("THIS PROGRAM PRINTS THE LARGEST OF 3 NUMBERS");
		int n1 = IBIO.inputInt("Enter a number "); 
		int n2 = IBIO.inputInt("Enter another number ");
		int n3 = IBIO.inputInt("Enter another number ");
		for (int i = 2; i<n1+1; i++)
			{
				fact = fact * i;
			}
		IBIO.output( + n1 + "! =  " + fact);	
		if (n1>n2 && n1>n3) 
			IBIO.output("The bigger number is " + n1);
		else if (n2>n1 && n2>n3) 
			IBIO.output("The bigger number is " + n2);	
		else 
			IBIO.output("The bigger number is " + n3);
			
	}
}

