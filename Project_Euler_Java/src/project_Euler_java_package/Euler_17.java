package project_Euler_java_package;
public class Euler_17 {
	static public void main(String args[]){
		byte onesIndex = 0;
		String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		byte tensIndex = 0;
		String[] tens = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
		
		byte hundredsIndex = 0;
		
		long numLetters = 0;
		
		String nextNum = "";
		
		for (int num = 1; num <= 1000; num++){
			onesIndex++;
			assignDigits: {
			if (onesIndex == 10){
				onesIndex = 0;
				tensIndex++;
			}
			
			if (tensIndex == 10){
				tensIndex = 0;
				hundredsIndex++;
			}
			
			if (hundredsIndex == 10){
				break assignDigits;
			}
				
			if (num >= 100){
				nextNum = ones[hundredsIndex] + "hundredand";
			}
			
			if (num >= 10){
				nextNum += tens[tensIndex];
			}
			
			nextNum += ones[onesIndex];
			}
			switch(num){
				case 11:
					nextNum = "eleven";
					break;
				case 12: 
					nextNum = "twelve";
					break;
				case 13:
					nextNum = "thirteen";
					break;
				case 14:
					nextNum = "fourteen";
					break;
				case 15:
					nextNum = "fifteen";
					break;
				case 16:
					nextNum = "sixteen";
					break;
				case 17:
					nextNum = "seventeen";
					break;
				case 18:
					nextNum = "eighteen";
					break;
				case 19:
					nextNum = "ninteen";
					break;
				case 1000:
					nextNum = "onethousand";
				default:
			}
			
			
			
			
			numLetters += nextNum.length();
			System.out.println(nextNum);
			nextNum = "";
			System.out.println(num + "\n");
		}
		System.out.println("Number of letters : " + numLetters);
	}
}
