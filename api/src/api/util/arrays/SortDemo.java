package api.util.arrays;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/*
 	java.util.Arrays�� �޼ҵ���
 	sort()�� ���� ����� �Ѵ�.
 */

public class SortDemo {
	Vector<Integer> vec = new Vector<Integer>();
	
	public Vector<Integer> getAscSort1(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]){
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i : arr) {
			vec.addElement(i);
		}
		return vec;
	}
	/*
	 	�������� ���� 1.2.3...
	 */
	/*
	 	���Ʒ��� �ΰ��� ��� ������������
	 */
	public Vector<Integer> getAscSort2(int[] arr) {
		Arrays.sort(arr);//���������� �������� ������ �����Ǿ��ִ�.
		for (int i : arr) {
			vec.addElement(i);
		}
		return vec;
	}
	public static void main(String[] args) {
		SortDemo util = new SortDemo();
		SortDemo util2 = new SortDemo();
		SortDemo util3 = new SortDemo();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		int[] arr = {0,5,9,4,1,0};
		list1= util.getAscSort1(arr);
		list2=util2.getAscSort2(arr);
		list3=util3.getAscSort1(arr);
		System.out.println("���Ҿ˰��� ����� �������� ����: "+list1.toString());
		System.out.println("Arrays.sort() ������� �������� ���� : "+list2.toString());
		Collections.reverse(list3);
		System.out.println(list3.toString());
		
	}
}
