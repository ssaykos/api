package api.text.simplDateFormat;

import java.util.Date;


public class SimpleDateFormat {
	public static void main(String[] args) {
		//이클립스 제안중 java.util.Date가 있고
		//java.sql.date가 있는데 앞의 것을 쓴다.
		Date today = new Date();
		SimpleDateFormat date01,Date02,Date03,Date04;
		
		date01= new SimpleDateFormat("yyyy-mm-dd");
		Date02= new SimpleDateFormat("yy년 mm월dd일 E요일");
		Date03= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date04= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
	}
}
