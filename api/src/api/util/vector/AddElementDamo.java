package api.util.vector;

import java.util.Vector;

/*
 	java.util.vector�޼ҵ���
 	addElement()�� �⺻������ add()�� �����ϴ�.
 */

public class AddElementDamo {
	public static void main(String[] args) {
		String[] heros={"iron","thor","hulk","hawk"};
		Vector<String> avengers = new Vector<String>();
		//���Ϳ� �迭�� ��Ҹ� ���� 
		for (int i = 0; i < heros.length; i++) {
			avengers.addElement(heros[i]);
		}
		//�丣�� ���� �ϴ� �� üũ
		String thor="thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("�丣��"+idx+"��°�� �ֽ��ϴ�");
		}else{
			System.out.println("�丣 ����~");
		}

		
		/*
		 	ù��° �ɹ� ��� ����
		 	���Ϳ� �ε����� 0 ���� �����Ѵ�. 0�� ù��°���
		 */
		System.out.println(avengers);
		avengers.removeElementAt(0);
		System.out.println("������ �ɹ� ��ġ �ε��� ��ȭ");
		System.out.println(avengers);
		for (int i = 0; i < avengers.size(); i++) {
			System.out.println("avenger�� "+(i+1)+"��°�ɹ���"+avengers.elementAt(i));
		}

	}
}
