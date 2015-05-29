package api.util.hashset;

import java.util.HashSet;
import java.util.Set;

//		java.util.HashSet;
//add()�� ����ó�� ����� �߰� ����� �Ѵ�
/*
 	 Set�� ��ü�� �߰� �� �� HashSet�� �̹� ��ü��� �ߺ����� �����ϰ� ���� ���� ������ false�� ��ȯ�Ѵ�.
 	 Collection �� ��ǥ���ΰ��� list / set / map / tree�� ������..
 	 list = ���� Ưȭ ex> sort /index  //add�� �߰�
 	 set = �ߺ����� �׸��� ������ ������ ���Ѵ�. //add�� �߰�
 	 tree = java ���� �״��� �Ⱦ��� jsp ���� ����..
 	 map =//put�� �߰� ������ ����� ���� Ű���� �ִ�.//�˻��ӵ��� ������.
 */
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = { "1",new Integer(2),"2","3","3","3","4"};
		// ��Ŭ������ ������ java.util.Set�߰�
		Set set= new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println("������ ���"+set);
		/*
		 * 	������ ���[3, 2, 2, 1, 4]
		 * 	���� �ְܼ����� ���� new Integer(2) �� "2"�� �ߺ������� 
		 * 	�������� �ʴ´ٴ� ���� �� �� �ִ�.
		 */
	}
}
