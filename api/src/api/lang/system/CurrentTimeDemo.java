package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	java.lang.System �� ���� CurrentTime
 */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime :"+curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 	new Date()���� import ������ �ΰ����ε�
		 	�׷� java.util.Date�� �����Ѵ�.
		 */
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("����ð� :"+nowTime);
	}
}
