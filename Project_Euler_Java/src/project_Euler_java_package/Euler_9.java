package project_Euler_java_package;

public class Euler_9 {
	public static void main(String argv[]){
		long a = 1, b = 1, c = 2;
		System.out.println("a,    b,    c");
		searchForSpecialTriplet: {
			
			
			while (c < 1000){
				
				c++;
				a = 1;
				while (a < c){
					
					while (b<c){
						b++;
						if (a*a + b*b == c*c){//Identifies a Pythagorean triplet
							System.out.println(a + ",    " + b + ",    " + c);
							if (a + b + c == 1000){//Identifies THE pythagorean triplet
								System.out.println("The special triplet is:\n" + a + ",    " + b + ",    " + c);
								System.out.print("Because " + a + " + " + b + " + " + c + " = 1000");
								break searchForSpecialTriplet;
							}
						}
					}
					
					a++;
					b = a;
				}
				
				
			}
			
		
		}
	}
}
