import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CalenderExample4 {
	/*
	 * Test 풀이
	 * 1. 입력	Scanner 사용
	 * 2. 계산	입력에 대한 정확한 계산결과
	 * 			// 핵심 : week 계산 
	 * 			매월 1일의 요일
	 * 3. 출력	printf 포멧을 사용
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		while(true) {
		for(;;) {
			System.out.print("year >>");
			int year = scan.nextInt();		// 사용자 입력
			if (year < 1) {
				System.out.println("year는 1년 부터 입니다");
				break;
			}
			System.out.print("month >>");
			int month = scan.nextInt();
			if (month < 1 || month >12) {
				System.out.println("월은 1월부터 12월까지 입니다.");
				break;
			}
			
			printMonth( year, month);
		}
		
		System.out.println("Program End...");
		
	}
	
	static void printMonth(int year, int month) {
		
		System.out.printf("[%d, %d]\n", year, month);
		
		LocalDate date = LocalDate.of(year, month, 1);
		System.out.println(date);					// 달의 첫날
		System.out.println(date.getDayOfWeek());		// 요일
		System.out.println(date.isLeapYear() ? "윤년" : " 평년");	// 윤년 평년 구분
		System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));	// 달의 마지막날
		
		/*
		 *  1년 1월 1일은 MONDAY.
		 *  
		 *  일 월 화 수 목 금 토
		 *  0  1 2 3  4 5 6
		 */
		int totalDay = 0;
		
//		for (int i=1; i<year; i++) {
//			totalDay += 365;
//			if (i%4==0 || i%100!=0 || i%400==0)
//				totalDay++;
//		}
		//						(		    	윤년의 개수		     		)
		totalDay = (year-1)*365 +(year-1)/4 -(year-1)/100 + (year-1)/400;
		
		//					 1월 2월	 3월  4월  5월 6월 7월  8월  9월 10월 11월 12월			
		int [] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		if (year%4==0&&year%100!=0 || year%400==0)
			dayOfMonth[1] = 29;
		
		for (int i=1; i<month; i++)
			totalDay += dayOfMonth[i-1];
		
		int week = (1 + totalDay)%7;
		
		System.out.printf("         %4d년 %2d월\n", year, month);
		
		System.out.printf(" SUN MON TUE WED THU FRI SAT\n");
		
		for (int i =0; i<week; i++) 
			System.out.printf("%4s", "#");
		
		for (int i=1; i<=dayOfMonth[month-1]; i++) {
			System.out.printf("%4d", i);
			week++;
			if (week%7==0)
				System.out.println();
		}
			
		System.out.println();
		
		
		
		
	}

	
	
	
}
