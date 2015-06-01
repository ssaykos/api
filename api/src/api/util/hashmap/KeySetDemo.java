package api.util.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import java.util.*;

/*
 	 �ּҸ� ���������� �ִ°Ͱ� ���������� �ִ� ���� �̴�.
 */

public class KeySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 		map�� ���� �Է��ϴ� ��� = > 1������ ����..
		 		
		 */
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�� ����", new Integer(66));
		map.put("��Ʈ�� ����", new Integer(10));
		
		/*
		 	GoF �� ������ �����߿��� Iterator�����̶�� �Ҹ���� map���� ���� �����ϴ� ����ȭ�� ����
		 	
		 	�ʿ��� Ű�� �������� ���� ��Ȳ�� ���� ��� �� ���� entrySet()���
		 	�ʿ��� Ű���� ����� ��� keySet()���..
		 	��, ��������� Set���
		 	������ �÷��ǿ��� �������̽��� Set, List , Map �� �������� ��ǥ��..
		 	Set�� Map�� �ε��� ���� ��� ��ȣ������ �ߵǰ� Set�� �ߺ��� ���� ����� �־ 
		 	Map���� Ű ������ �ߺ��� ����� �ϴ� �κа��� ��ġ�� Set�� ���� Ű ��, Ȥ�� Ű +���� ���� ����ϴµ� ���δ�.
		 	����� ���� Iterator�� ��� Set�� Iterator�� ��� �ϱ� �����̴�.
		 */

		/*
		 	Map ���� ���� ����ϴ� ���� 3���� ..  /1
		 	1. Key+ Velue ���� �� ���
		 	2. entrySet()+ Iterator ���� ��� //Iterator�� ���ӽ� ���� ����� �ƴϴ�..
		 	
		 */
		Set set = map.entrySet();//��ü���� ����� �߰�. �ʿ��� ���ͷ������� ����� ��� ���ͷ����� ����� �ִ� �¿� �ѱ��..
		Iterator it = set.iterator();//���ͷ����� �� �ٽ� ���� �Ѱܼ�..
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();//Entry=���
			System.out.println("������ :"+e.getKey()+"����"+e.getValue());
		}
		
		/*
	 	Map ���� ���� ����ϴ� ���� 3���� .. /2
	 	1. Key ���� �� ���
	 	2. keySet()��� 
		 */
		set= map.keySet();
		System.out.println("������ ��� :"+set);
		//collection ���� ��Ŭ���� �����߿��� java.util.Collection
		
		
		/*
	 	Map ���� ���� ����ϴ� ���� 3���� .. /3
	 	1. Velue ���� �� ���
	 	2. Collection ���
		 */
		Collection value = map.values();
		it = value.iterator();
		int total=0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total +=i.intValue();
		}
		System.out.println("����:"+total);
		System.out.println("���:"+total/set.size());
		System.out.println("1��:"+Collections.max(value));
		System.out.println("����:"+Collections.min(value));
	}
}
