



public class positiveno {
	
	public static void main (String[] args) {
		IBIO.output(" THIS PROGRAM CHECKS IF A NUMBER IS POSITIVE");  
		int c = IBIO.inputInt (" Enter a number : "); 
		if (c<0)
			IBIO.output ("ERROR"); 
		else 
			IBIO.output ( "  NUMBER IS POSITIVE"); 
			
			
	int dim,rem ;
	int d = IBIO.inputInt (" Enter another number : "); 
	int add = c + d; 
	IBIO.output (" The addition of 2 numbers is "+add); 
	
	
	int minus = c - d; 
	IBIO.output (" The difference of the 2 numbers is "+minus) ; 
	
	int multiplication = c * d; 
	IBIO.output (" The mutliplication of the 2 numnbers is "+multiplication); 
	
	if (c > d) 
	{
		 dim=c / d; 
		 rem = c % d; 
	} 	
	else 
	{ 
		 dim=d / c; 
		 rem = d % c; 
	} 	
	IBIO.output (" The division of the 2 numbers is "+dim);
	
	
	IBIO.output (" The remainder of the 2 numbers is "+rem);  
		
	}
}

