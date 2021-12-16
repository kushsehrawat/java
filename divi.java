
public class divi {
	
	public static void main (String[] args)
	 {
		 IBIO.output("TO count NOS NOT DIVISIBLE BY 2or3or5or7");
		 int sum = 0;
		 int count = 0;
		 for ( int i = 1; i<1000000; i++)
		 {
			 int rem2 = i % 2;
			 int rem3 = i % 3;
			 int rem5 = i % 5;
			 int rem7 = i % 7;
			if (rem2 == 0 || rem3 ==0 || rem5 ==0 || rem7 ==0)
				sum  = sum + i;
			else 
				count = count + 1;
		 }
		 IBIO.output(+ count);
	}
}

