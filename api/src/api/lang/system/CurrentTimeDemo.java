package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	java.lang.System 에 속한 CurrentTime
 */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime :"+curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 	new Date()사용시 import 제안이 두가지인데
		 	그룹 java.util.Date를 선택한다.
		 */
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("현재시간 :"+nowTime);
	}
}
