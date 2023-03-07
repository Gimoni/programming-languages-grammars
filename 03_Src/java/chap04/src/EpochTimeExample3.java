
public class EpochTimeExample3 {

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
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		long week = (4 + epoch/60/60/24) %7;
		long hour = epoch/60/60%24;
		long minute = epoch/60%60;
		long second = epoch%60;
		
		char weekName = switch ((int)week) {
		case 0: {
			yield '일';
		}
		case 1: {
			yield '월';
		}
		case 2: {
			yield '화';
		}
		case 3: {
			yield '수';
		}
		case 4: {
			yield '목';
		}
		case 5: {
			yield '금';
		}
		case 6 : {
			yield '토';
		}
	    default: 
	    	yield ' ';
			
	    };
		
		
		System.out.printf("%04d-%d-%d %c %02d:%02d:%02d\n", year, month, day, weekName, hour, minute, second);
		
		}

}
