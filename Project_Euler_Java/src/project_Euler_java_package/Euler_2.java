package project_Euler_java_package;

public class Euler_2 {
	public static void main (String[] args){
		long a = 1;
		long b = 2;
		long Sum = 0;
		while (a<4000000){
			
			System.out.println(a);
			if (a%2 == 0){
				Sum += a;
			}
			b+=a;
			a = b - a;
		}
	System.out.println("Sum = "+ Sum);
	}
}
