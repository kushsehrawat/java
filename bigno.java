


public class bigno  {
	
	public static void main (String[] args) 
	{
		IBIO.output("THIS PROGRAM PRINTS THE LARGEST OF 3 NUMBERS");
		int n1 = IBIO.inputInt("enter a number "); 
		int n2 = IBIO.inputInt(" enter another number ");
		int n3 = IBIO.inputInt(" enter another number ");
		if (n1>n2 && n1>n3) 
			IBIO.output("The bigger number is " + n1);
		else if (n2>n1 && n2>n3) 
			IBIO.output("The bigger number is " + n2);	
		else 
			IBIO.output("The bigger number is " + n3);
	}
}

