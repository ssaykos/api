package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensdemo {
	public static void main(String[] args) {
		/*
		 	������ Ȥ�� ���� ��� ������ token �̶�� �ϴµ�
		 	Ư�� �����ڸ� �����ϸ� �װ��� �������� �߶󳻴� Ŭ������ �޼ҵ�.
		 */
		String date ="2015/05/24";
		StringTokenizer tok = new StringTokenizer(date,"/");
		/*
		 * �� ������ �Ķ������ �տ����� String ��� ��ü,
		 * �ڰ��� ������
		 */
		int idx =  0;
		/*
		 		with enumeration ���� �� ���� ����
		 		�׸��� hasMoreTokens() �θ� ����
		 */
		while(tok.hasMoreTokens()) {
			String token = tok.nextToken();
			System.out.println("["+idx+"]:"+token);
			idx++;
		}
	}
}
