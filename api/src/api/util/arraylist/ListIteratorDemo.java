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
		//listIterator(), listIterator(int index) 두가지 형태가 있는데 파라미터가 없는 것은 순방향을 한번 돌리려야 
		//역방향 출력이 되고  (list.size())가 있으면 인덱스 역활을 순방향 돌리기 대신으로 되서 출력된다.
		
		//역방향 출력 전 미리 순방향 돌리기.
//		System.out.println("순방향 출력");
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		System.out.println("역방향 출력");
		/*
		 	이클립스 제안으로 자동생성시키면 아래 조건식에 it.hasNext() 가 생성된다.
		 	역순출력을 위해서 hasPrevious()라고 바꿔주도록 한다.
		 */
		while (it.hasPrevious()) {
			System.out.println(it.previous()+"\t");
			
		}
//		list.add("6");
//		ListIterator<String> it2 = list.listIterator();
//		//역방향 출력 전 미리 순방향 돌리기.
//		System.out.println("순방향 출력");
//		while (it2.hasNext()) {
//			System.out.println(it2.next());
//		}
//		while (it2.hasPrevious()) {
//			System.out.println(it2.previous()+"\t");
//			
//		}
	}
}
