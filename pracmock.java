

public class pracmock {
	
	public static void main (String[] args) 
	{
		IBIO.output("KUSH SEHRWAT");
		int sum = 0;
		double avg = 0;
		double rem;
		int max = 0; 
		int min = 1; 
		int n1 = IBIO.inputInt("How many numbers to process "); 
		if (n1<3) 
		IBIO.output("Error");
		else  
		for(int i = 1; i < n1+1;  i++)
		{
			int	a = IBIO.inputInt("Enter a no. : ");
			sum = sum + a;
			
			if (a >max) 
			{
				max = a; 
				 
			} 
			if (a <min)
			{ 	min = a; 
			} 
			
		IBIO.output("The sum of the numbers are : " + sum );
		}
			avg = sum/n1;
			IBIO.output("The sum of the numbers are : " + sum );
			IBIO.output("The average of the numbers are : " + avg);
			IBIO.output("The maximum number is " + max); 
			IBIO.output("The minimum number is " + min); 
			IBIO.output ("END"); 
	} 
} 
