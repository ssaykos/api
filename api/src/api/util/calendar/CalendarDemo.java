package api.util.calendar;

import java.util.Calendar;
/*
 	java.util.Calendar
 */

public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
		//Calendar,getInstance()는 내부적으로 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		//여러개의 인스턴스를 생성하지 않도록 방지 하려는 목적에서 코딩 됨.
		Calendar date = Calendar.getInstance();
		System.out.println("날짜:");
		System.out.print(date.get(Calendar.YEAR)+"년");
		/*
		 	API에는 Calendars is JANUJARY which is 되어 있으므로
		 	아래 식처럼 구할때는 +1 해줘야 한다.
		 	만약 1을 더하지 않으면 현재 월이 -1 되서 출력된다.
		 */
		System.out.print(date.get(Calendar.MONTH)+"월");
		System.out.println(date.get(Calendar.DATE)+"일");
		
		System.out.println("시간:");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.println(date.get(Calendar.SECOND)+"초");
		
		System.out.println("=== 1달 후 ===");
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
		
		System.out.println("=== 7일 전 ===");
		date.add(Calendar.DATE,-7);
		System.out.println(toString(date));
		/*
		 	출력된 결과값 : java.util.GeGregorianCalendar 로 출력되므로 오버라이딩이 필요하다.
		 */
		System.out.println("특정 시간으로 셋팅");
		date.set(Calendar.HOUR, 13);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 22);
		
		System.out.println("수정된 시간 출력");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.print(Calendar.SECOND);
		
		//수정된 시간 출력 결과값이 101213처럼 되어 나오도록 오버로딩이 필요하다.
	}
	public static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"년"+date.get(Calendar.MONTH)+"월"+date.get(Calendar.DATE)+"일";
	}
}
