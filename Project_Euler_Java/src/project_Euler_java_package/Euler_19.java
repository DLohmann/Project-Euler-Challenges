package project_Euler_java_package;

public class Euler_19 {
	
	public static void main(String[] args) {
		byte month = 0; // 0 is january, 1 is february, ... 11 is december
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		byte[] monthDays = {31,    28,    31,    30,    31,    30,    31,    31,    30,    31,    30,    31};
		//String[] weekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		
		byte monthDay = 1;
		long daysPast = 1;
		short year = 1900;	// starts this year, 1900
		short endYear = 2000;
		short numSunday = 0;
		
		for (; year <= endYear; year++){
			while (month < 12){
				while (monthDay <= monthDays[month] || (year%4 == 0 && (year%100 != 0 || year % 400 == 0)&& month == 1 && monthDay == 29)){ 
					// This while loop runs for every day, and the extra day feb 29 on leap years, except when the leap year is divisible by 100
					if (year > 1900 && monthDay == 1 && (int) (daysPast%7) == 0){
						numSunday++;
						System.out.println("Sun" + "\t" + monthDay + "\t" + months[month] + "\t" + year + "\tSundays past: " + numSunday);
					}
					daysPast++;
					monthDay++;
				}
				month++;
				monthDay = 1;
			}
			month = 0;
		}
	}

}
