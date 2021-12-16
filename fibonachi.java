

public class fibonachi {
	
	public static void main (String[] args) {
		int n1 = 0; 
		int n2 = 1; 
		IBIO.output (+ n1 + n2); 
		for (int i = 0; i <=10; i++) 
		{ 
			int n3 = n1 + n2;
			IBIO.output (n3);
			n1 = n2;
			n2 = n3; 
		} 
		
	}
}

