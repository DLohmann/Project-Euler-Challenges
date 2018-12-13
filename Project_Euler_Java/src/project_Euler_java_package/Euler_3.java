package project_Euler_java_package;

public class Euler_3 {
	
	
	public static void main(String argv[]){
		
		long[] primes = new long[1000];
		primes[0] = 1;
		long num = 1;
		int index = 0;
		int highestIndex = 0;
		
		do{
			if ((num%primes[index] == 0) && (primes[index] != 1) && (primes[index] != num) ) {
				//num is a multiple of primes[index], and therefore not prime
				index = 0;
				num++;
				
			}else{
				//num isn't a multiple of primes[index]
				if(index == highestIndex){
					//num is prime
					System.out.println("Prime " + (index+1) + " is " + num) ; 
					//if (600851475143 %num == 0){
						//System.out.println(num+ " is a prime factor of 600851475143");
					//}
					primes[index + 1] = num;
					highestIndex = index + 1;
					num++;
					index = 0;
				}
				
				
				
			}
			index++;
		}while((primes[highestIndex] < 1000) );
		
		
		
		
		
	}
}
