

public class base {
	
	public static void main (String[] args) {
		
	int b = IBIO.inputInt (" Enter a base ");
	int exp = IBIO.inputInt (" Enter exponent ");

		int power = 1; 
		
		for (int i = 1; i <=exp; i++) 
		{
			power = power*b;		
		}
		IBIO.output (+power);
	
	 
	}
}
		
	


