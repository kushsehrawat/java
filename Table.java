


public class Table {
	
	public static void main (String[] args) {
		 
		for ( int i = 1; i <= 3; i++ )
		
	{ 
		int n = IBIO.inputInt (" Enter a number : ");
		int o = IBIO.inputInt (" Enter another number : "); 
		int p = IBIO.inputInt (" Enter another number : "); 
		if (n > o && n > p)  
		IBIO.output (+ n + " is the bigger number "); 
		if (o > n && o > p) 
		IBIO.output (+ o + " is the bigger number "); 
		else 
		IBIO.output (+ p + " is the bigger number "); 
	} 
		
				
}
} 

