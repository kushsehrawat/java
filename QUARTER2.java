

public class QUARTER2 {
	
	public static void main (String[] args) {
		IBIO.output (" Kush Sehrawat"); 
		int b = IBIO.inputInt ("Enter a base : ");
		if (b == 0)
		{	System.exit (0);	
		}
		int e = IBIO.inputInt ("Enter a exponent : "); 
 
		int power = 1;
		for ( int i = 1; i <=e; i++) 
		{                                                                                                                                                                                                         
		power = power * b; 
	} 
		IBIO.output (+power); 

}
}
