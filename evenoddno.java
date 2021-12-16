
public class evenoddno {
	
	public static void main (String[] args)
	 {
		 IBIO.output("TO CHK IF NO. IS EVEN or ODD" );
		 for ( int i = 1; i <11; i++)
		 {
			 int a = IBIO.inputInt(" ENTER A NO. : ");
			 int rem = a % 2;
			 IBIO.output(" The remainder is : " + rem);
			 if (rem == 0)
			 IBIO.output("The  number "  + a + " is even. "); 
			 else
			 IBIO.output("The  number "  + a + "  is odd. ");
		}
		IBIO.output(" END ");
	}
}

