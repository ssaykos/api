package api.text.simplDateFormat;

import java.util.Date;


public class SimpleDateFormat {
	public static void main(String[] args) {
		//��Ŭ���� ������ java.util.Date�� �ְ�
		//java.sql.date�� �ִµ� ���� ���� ����.
		Date today = new Date();
		SimpleDateFormat date01,Date02,Date03,Date04;
		
		date01= new SimpleDateFormat("yyyy-mm-dd");
		Date02= new SimpleDateFormat("yy�� mm��dd�� E����");
		Date03= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date04= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
	}
}
