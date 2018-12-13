package project_Euler_java_package;
public class Euler_1{
	public static void main(String argv[]){
		long a = 1;
		long Sum = 0;
		while (a<1000){
			if ((a%3 == 0)||(a%5 == 0)){
				System.out.println(a);
				Sum += a;
			}
			a++;
		}
		System.out.println("Sum = " + Sum   );
	}
}