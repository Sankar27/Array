import java.math.BigInteger;

public class assign7 {

	public static void main(String[] args) {
		
		int N = 100;
		
		 BigInteger fact  = BigInteger.ONE;

		 for(int i = 2; i <= N; i++){
			 fact = fact.multiply(new BigInteger(String.valueOf(i)));
		 }
		 System.out.println("The Factorial of "+ N +"is :"+fact);
		 

	}

}
