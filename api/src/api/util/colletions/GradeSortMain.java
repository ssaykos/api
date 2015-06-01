package api.util.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO a1 = new GradeVO("ȫ�浿", "2011", 99, 99, 99);
		GradeVO a2 = new GradeVO("��浿", "2012", 77, 77, 77);
		GradeVO a3 = new GradeVO("��浿", "2013", 99, 99, 88);
		GradeVO a4 = new GradeVO("��浿", "2014", 88, 88, 88);
		
		grades.add(a1);
		grades.add(a2);
		grades.add(a3);
		grades.add(a4);
		/*
		 * �Ʒ��� �ѹ����� ������ Anonymous 
		 */
		grades.add(new GradeVO("���浿","2015", 99,88,77));
	
		System.out.println("�̸� �������� ����");
		Collections.sort(grades, new NameAscCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
		System.out.println("�̸� �������� ����");
		Collections.sort(grades,new NameDescCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
		System.out.println("���� �������� ����");
		Collections.sort(grades, new TotalAscCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
		System.out.println("���� �������� ����");
		Collections.sort(grades, new TotalDescCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
	}
}
