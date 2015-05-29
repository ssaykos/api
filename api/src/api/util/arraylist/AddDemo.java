package api.util.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import java.util.Iterator;;
/*
 	java.util.ArrayList�� �޼ҵ常
 	add() �� Vector�� �����ϴ�.
 */

public class AddDemo {
	public static void main(String[] args) {
		/*
		 	���ʹ� ���������� ��Ʈ���� ���
		 	�ӵ��� ������ ����ȭ�� �����Ѵ�.
		 	��̸���Ʈ�� ���������� ��Ʈ�� ���۸� ����Ѵ�.
		 	����ȭ ��������.
		 */
		ArrayList<String> list =new ArrayList<String>();
		//�׸��߰�
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		
		//��� 1. iterator() �̿�
		
		/*
		 	iterator ��ü�� �����ϸ� ��Ŭ������ ���ȿ� 3���� ���û����� �ش�.
		 	���߿� �ι�° with iterator�� �����Ѵ�.
		 
		 */
		
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			//printf�� ����Ѵ�
			System.out.printf("%s", it1.next());
			//���� �������� %s�� ��Ʈ������ �ǹ�.
			//���� ���� %s�� ���..
		}
		System.out.println();
		
		//���2 list. listInterator() �̿�
		ListIterator<String> it2 = list.listIterator();
		while (it2.hasNext()) {
			System.out.printf("%s",it2.next());
		}
		System.out.println();
		
		//���3 .previos()�̿�
		while (it2.hasPrevious()) {
			System.out.printf("%s",it2.previous());
			//���� �޼ҵ�� listIterator������ ��밡��
		}
		//��ü ��Ҹ� �ѹ��� �Է�
		//List �������̽��� java.util�̴�
		/*
		 	Ȯ������ 
		 	�ݷ����� �ε����� ���� ������ ���� �־����� �ʴ� ������°� ���� ������ 
		 	Ȯ�������� ��� ���ȴ�.
		 */
		List<String> list3 = new ArrayList<String>();
		//�������̽��� <���׸�> ���������� = new ������ ��ü <���׸�>();
		
		list3.addAll(list);
		
		for (String s : list3) {
			System.out.printf("%s",s);
		}
		System.out.println();
		
		list3.add("����");
		list3.add("��õ");
		list3.add("����");
		
		Iterator <String> it3 = list3.iterator();
		String str;
		while (it3.hasNext()) {
			str= it3.next();
			if(str.startsWith("��")){
				System.out.printf("%s",str);
			}
		}
		System.out.println();
		list3.add("��õ");
		list3.add("��õ");
		list3.add("��õ");
		
		Iterator<String> it4= list3.iterator();
		while (it4.hasNext()) {
			System.out.printf("%s",it4.next());			
		}
		System.out.println();
	}
	
}
