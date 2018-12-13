package project_Euler_java_package;

public class Euler_4 {

	public static void main(String[] args) {
		System.out.println("Listing palindrome that are the product of two-digit numbers:\na\tb\ta*b\n______________");
		short highestFactor = 999; //This is the highest number that a or b can be
		short lowestFactor = 100; //This is the lowest number that a or b can be
		/*
		 * My Method: Find every possible combination of a and b in which a and b are 3 digit numbers (100 to 999), check if each 
		 * product of a and be is palindrome, and, if a*b is palindrome, then print out a, b, and a*b
		 * 
		 * Alternate method:
		 * Find every palindrome number less than 999*999 and greater than 100*100 (from 998001 to 100,000), check to find every pair of 
		 * 2 factors it has in which the 2 factors are 3 digit numbers (between and including 100 and 999). Then print out each of these two 
		 * pairs of factors, and the product of these
		 * 
		 * 
		 * */
		long count = 0;
		
		int max = Integer.MIN_VALUE;
		
		for (short a = lowestFactor; a < highestFactor + 1; a++){
			for (short b = a; b < highestFactor + 1; b++){//These two "for" loops check for every possible unique combination of a and b where a and b are integers between and including 100 and 999 (all three digit integers)
				char digits [] = new char[ (int) (Math.log10((a*b)) + 1)];	//This creates an array of characters of length equal to the number of digits in a*b
				//digits.length is the number of digits in integer a*b
				
				//read the digits into the array of chars:
				count += 1;
				int ab = a*b;// this variable will be divided by 10 to yield every digit in a*b
				for (short j = 0; j < digits.length; j++){
					digits[j] = (char)(48 +(int)((ab) % 10));//this should get the individual digit at index j of short a*b
					ab /= 10;
				}
				//now I check if a*b is palindrome
				
				for (short i = 0; ((i <= digits.length/2)&&(digits[i]==digits[digits.length-1-i])); i++){
					if (i == (digits.length/2)){
						//apparently this currently prints for every single iteration of the innermost for loop
						System.out.println(a + "  *\t" + b + "  =\t" + (a * b));
						
						//Here I check if a*b is the max palindrome
						
						if (max < a*b){
							max = a*b;
						}

					}

				}
			}
		}
		
		System.out.println("\nThe largest palindrome that is the product numbers between and including " + lowestFactor + " and " + highestFactor + " is " + max);
		
		
		System.out.println("\nNumber of unique  combinations of a and b: " + count);
		
	}

}
