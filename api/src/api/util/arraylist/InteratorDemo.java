package api.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorDemo {
	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		//�� ������ Ʋ���� ������ �÷��� Ÿ�Ե��� �������̽� Ÿ������ ����
		//List�� import�Ҷ� ���� ���� ��Ŭ���� ���ȵ� �� ���� �ִ� java.awt.List�� �����ϸ� �ȵ�.
		//�ι�° util��Ű���� �����ϵ��� ���� ��3
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.hasNext());
		}
	}
}
