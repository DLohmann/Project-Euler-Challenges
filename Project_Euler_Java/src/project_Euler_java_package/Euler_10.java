package project_Euler_java_package;

public class Euler_10 {
	public static void main (String args[]) {
		
		int numSumTo = 200;
		
		
		long [] prime = new long[numSumTo];
		prime [0] = 2;
		int maxIndex = 0;
		long sum = 2;
		
		boolean[] indexPrime = new boolean[numSumTo];	// each boolean indicates if it's index is a factor
		System.out.println(indexPrime[0]);
		for (int i = 0; i < indexPrime.length/2; i++) {
			
			for (int j = 0; j < indexPrime.length; j += i) {
				indexPrime [j] = true;
			}
		}
		// if the above algorithm ran successfully, I should now have an array of booleans whose values indicate if they are 
		
		
		
		
		// sums primes
		/*
		System.out.println("Summing all primes from 2 to " + numSumTo);
		System.out.println("Prime 0 is 2");
		for (int i = 3; i < prime.length; i += 2) {	// "i" is used to test every number from 3 to "numSumTo" for prime ness
			
			for (int j = 3; j < maxIndex; j++) {	// "j" is used (as index) to test if i is a factor of any prime from prime[0] to prime[maxIndex]
				if (i % prime [j] == 0) {
					break;
				}
				if (j + 1 == maxIndex) {
					maxIndex++;
					prime[maxIndex] = i;
					System.out.println("Prime " + maxIndex + " is " + i);
					sum += i;
				}
			}
			
		}
		System.out.println("sum is " + sum);
		*/
		
		
	}
}
