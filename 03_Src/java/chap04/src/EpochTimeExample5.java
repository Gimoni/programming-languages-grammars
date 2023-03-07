

public class EpochTimeExample5 {

	/*
	 * AC
	 * 0001-01-01 Monday
	 * 
	 * 1970-01-01 00:00:00 부터 경과시간 (Thursday)
	 * 
	 *  0  1  2  3  4  5  6 
	 *  일 월  화  수  목 금  토
	 * 
	 */
	
	public static void main(String[] args) {
		long epoch = System.currentTimeMillis()/1000 + 9*60*60;	// 한국시간 GMT+9 / UTC+9
		
		int year = 1970;
		long week = 4;				// (4 + epoch/60/60/24) %7;
		
		//for(;;) {
		while(true) {
			int dayOfYear = 365;
			if (year%4==0&&year%100!=0 || year%400==0)  // 
				dayOfYear++;
			
			int secondOfYear = dayOfYear*24*60*60;
			
			if (epoch - secondOfYear >= 0) {
				epoch -= secondOfYear;
				week += dayOfYear;
			}
			else
				break;
			
			year++;
		}
		/*
		 * 1   2    3   4   5   6   7   8   9   10  11  12
		 * 31  28   31  30  31  30  31  31  30  31  30  31
		 * 	   29
		 */
		int month = 0;
		for (int i=1; i<=12; i++) {
			int dayOfMonth=0;
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dayOfMonth = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dayOfMonth = 30;
				break;
			case 2: 
				if(year%4==0 && year%100!=0 || year%400==0)
					dayOfMonth= 29;
				else 
					dayOfMonth= 28;
			default:
				break;
			}
			
			int secondOfMonth = dayOfMonth*24*60*60; 
			if (epoch - secondOfMonth >= 0) {
				epoch -= secondOfMonth;
				week += dayOfMonth;
			}else {
				month = i;
				break;
			}
			
		}
		
		
		int day = 0;
		
		week =  week %7;
		long hour = epoch/60/60%24;
		long minute = epoch/60%60;
		long second = epoch%60;
		
		char weekName = switch((int)week) {
		case 0 -> '일';
		case 1 -> '월';
		case 2 -> '화';
		case 3 -> '수';
		case 4 -> '목';
		case 5 -> '금';
		case 6 -> '토';
		default -> 'X';
		};

		
		System.out.printf("%04d-%d-%d %c %02d:%02d:%02d\n", year, month, day, weekName, hour, minute, second);
		
	}
	
	
	

	public static void main2(String[] args) {
		long epoch = System.currentTimeMillis()/1000 + 9*60*60;	// 한국시간 GMT+9 / UTC+9
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		long week = (4 + epoch/60/60/24) %7;
		long hour = epoch/60/60%24;
		long minute = epoch/60%60;
		long second = epoch%60;
		
		char weekName = switch((int)week) {
		case 0 -> '일';
		case 1 -> '월';
		case 2 -> '화';
		case 3 -> '수';
		case 4 -> '목';
		case 5 -> '금';
		case 6 -> '토';
		default -> throw new IllegalArgumentException();
		};

		
		System.out.printf("%04d-%d-%d %c %02d:%02d:%02d\n", year, month, day, weekName, hour, minute, second);
		
	}

}