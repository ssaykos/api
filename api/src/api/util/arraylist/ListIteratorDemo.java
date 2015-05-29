package api.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		ListIterator<String> it = list.listIterator(list.size());
		//listIterator(), listIterator(int index) �ΰ��� ���°� �ִµ� �Ķ���Ͱ� ���� ���� �������� �ѹ� �������� 
		//������ ����� �ǰ�  (list.size())�� ������ �ε��� ��Ȱ�� ������ ������ ������� �Ǽ� ��µȴ�.
		
		//������ ��� �� �̸� ������ ������.
//		System.out.println("������ ���");
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		System.out.println("������ ���");
		/*
		 	��Ŭ���� �������� �ڵ�������Ű�� �Ʒ� ���ǽĿ� it.hasNext() �� �����ȴ�.
		 	��������� ���ؼ� hasPrevious()��� �ٲ��ֵ��� �Ѵ�.
		 */
		while (it.hasPrevious()) {
			System.out.println(it.previous()+"\t");
			
		}
//		list.add("6");
//		ListIterator<String> it2 = list.listIterator();
//		//������ ��� �� �̸� ������ ������.
//		System.out.println("������ ���");
//		while (it2.hasNext()) {
//			System.out.println(it2.next());
//		}
//		while (it2.hasPrevious()) {
//			System.out.println(it2.previous()+"\t");
//			
//		}
	}
}
