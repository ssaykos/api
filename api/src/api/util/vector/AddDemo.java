package api.util.vector;

import java.util.Iterator;
import java.util.Vector;
/*
 	java.util.Vector �� �޼ҵ���
 	add() �� ���Ϳ� ���� �Ҵ��ϴ� ����� �Ѵ�.
 */

public class AddDemo {
	public static void main(String[] args) {
		String[] chatt = new String[3];
		String id="admin";
		int age=27;
		Boolean male = true;
		
		Vector<String> vec = new Vector<String>();
		String tom = new String ("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		//���ʹ� length()�� ������� �ʰ� size()�� ��ҿ� ���ڸ� ǥ���ϴµ� ���
		//�迭���� for loop��½� get(arr[i]) ������ ���ʹ� vec.elementAt(i) 
		vec.add("���ͷ� ���ڷ� ������ ��ü");
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.elementAt(i));
		}
		//for (String string : vec) {
			System.out.println(vec);
	//	}
//		for (Iterator iterator = vec.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//		}
		/*
		 	��µ� ����� 
		 	admin
			23
			false
			���ͷ� ���ڷ� ������ ��ü
		 */
	}
}
