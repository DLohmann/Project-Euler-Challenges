package project_Euler_java_package;

import java.util.Scanner;

public class Euler_6 {
	
	private static long squareOfSum(long maxNum){
		long sum = 0;
		for (short i = 1; i <= maxNum; i ++){
			sum += i;
		}
		return sum * sum;
	}
	
	private static long sumOfSquares(long highestRoot){
		long sum = 0;
		for (short i = 1; i <= highestRoot; i ++){
			sum += i * i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		/*The sum of the squares of the first ten natural numbers is, 12 + 22 + ... + 102 = 385
		The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 552 = 3025
		Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
		Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
		System.out.print("Please indicate the highest number to sum up to: ");
		Scanner user = new Scanner(System.in);
		long max = user.nextLong();
		
		long sumSquared = squareOfSum(max);
		System.out.println("sum of every number from 1 to " + max + " squared is " + sumSquared);
		long squaresSummed = sumOfSquares(max);
		System.out.println("square every number from 1 to " + max + " all summed up is " + squaresSummed);
		System.out.println("difference is " + (sumSquared - squaresSummed));
		user.close();
	}
}	
