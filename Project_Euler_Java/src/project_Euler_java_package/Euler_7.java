package project_Euler_java_package;

public class Euler_7 {
	
	static public void main(String argv[]){
		//*
		System.out.println("Prints a list of primes");
		//short numPrimesInpPrimes = 0;
		short indexOfHighestPrimeInprimes = 0;
		long primes[] = new long [10001];
		primes [0] = 1;
		
		//b is what ist tested as prime
		long b = 4;
		
		//n is counter divided by prime used to tell if b is prime
		long n = 1;
		while ((n <= primes[indexOfHighestPrimeInprimes]) && (b%n != 0)){
			//System.out.println(n);
			
			if (n == primes[indexOfHighestPrimeInprimes]){
				
				indexOfHighestPrimeInprimes += 1;
				primes[indexOfHighestPrimeInprimes] = n;
				System.out.println(n);
				
			}
		n+=1;
		}
	//*/
		/*
		int index = 1;
		long prime = 2;
		long[] primes = new long[4];
		
		primes [0] = 1;
		primes [1] = 2;
		
		long factor = 2;
		
		while (index < primes.length){//keep adding prime numbers to primes[]
			factor = 2;
			while ((prime%factor != 0) && (factor < primes[index])){
				//error check
				System.out.println("prime%factor =" + prime%factor + ", && factor < primes[index] is " + factor + " < " + primes[index]);
				
				if ((factor == primes[index]) && (prime%factor != 0)){//then show that "prime" is next prime, and add it to primes[]
					++ index;
					primes[index] = prime;
					System.out.println("next prime is " + primes[index]);
				}
			factor ++;
			
			}
			prime++;
			
		}
	*/
	
	
	
	}
}
