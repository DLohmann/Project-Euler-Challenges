package project_Euler_java_package;

class Euler_5 {

	public static void main(String[] args) {
		checkLoop: {
			for (int num = 1; true; num++){
				for (int i = 20; i > 1; i--){
					if (num % i == 0){
						//System.out.println(num);
						if (i == 2){// i == 2 when num is found to be multiple of all numbers from 20 to 2. Don't need to check 1, since all integers are multiples of one.
							System.out.println(num);
							break checkLoop;
						}
						
					}else{
						break;//if current num is not a multiple of i check a new num. Gracias a Dios!!!
					}
				}
			}
		}
		
	}

}
