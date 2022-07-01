public class NumberPrime {
	
	public static void main(String[] args) {    
	        for (int i = 2; i <= 100; i++) {
	            if(isPrime(i))
	                System.out.println(i + " is prime.");
	        }    
	}

	public static boolean isPrime(int number) {
	    for (int j = 2; j < number; j++) {
	        if (number % j == 0)
	            return false;   
	    }
	    return true;
	}
	
}

