package api.util.calendar;

import java.util.Calendar;
/*
 	java.util.Calendar
 */

public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = {"1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��"};
		//Calendar,getInstance()�� ���������� ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		//�������� �ν��Ͻ��� �������� �ʵ��� ���� �Ϸ��� �������� �ڵ� ��.
		Calendar date = Calendar.getInstance();
		System.out.println("��¥:");
		System.out.print(date.get(Calendar.YEAR)+"��");
		/*
		 	API���� Calendars is JANUJARY which is �Ǿ� �����Ƿ�
		 	�Ʒ� ��ó�� ���Ҷ��� +1 ����� �Ѵ�.
		 	���� 1�� ������ ������ ���� ���� -1 �Ǽ� ��µȴ�.
		 */
		System.out.print(date.get(Calendar.MONTH)+"��");
		System.out.println(date.get(Calendar.DATE)+"��");
		
		System.out.println("�ð�:");
		System.out.print(date.get(Calendar.HOUR)+"��");
		System.out.print(date.get(Calendar.MINUTE)+"��");
		System.out.println(date.get(Calendar.SECOND)+"��");
		
		System.out.println("=== 1�� �� ===");
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
		
		System.out.println("=== 7�� �� ===");
		date.add(Calendar.DATE,-7);
		System.out.println(toString(date));
		/*
		 	��µ� ����� : java.util.GeGregorianCalendar �� ��µǹǷ� �������̵��� �ʿ��ϴ�.
		 */
		System.out.println("Ư�� �ð����� ����");
		date.set(Calendar.HOUR, 13);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 22);
		
		System.out.println("������ �ð� ���");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.print(Calendar.SECOND);
		
		//������ �ð� ��� ������� 101213ó�� �Ǿ� �������� �����ε��� �ʿ��ϴ�.
	}
	public static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"��"+date.get(Calendar.MONTH)+"��"+date.get(Calendar.DATE)+"��";
	}
}
