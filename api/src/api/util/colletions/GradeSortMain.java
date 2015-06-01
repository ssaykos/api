package api.util.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO a1 = new GradeVO("홍길동", "2011", 99, 99, 99);
		GradeVO a2 = new GradeVO("김길동", "2012", 77, 77, 77);
		GradeVO a3 = new GradeVO("장길동", "2013", 99, 99, 88);
		GradeVO a4 = new GradeVO("백길동", "2014", 88, 88, 88);
		
		grades.add(a1);
		grades.add(a2);
		grades.add(a3);
		grades.add(a4);
		/*
		 * 아래는 한번쓰고 버리는 Anonymous 
		 */
		grades.add(new GradeVO("봉길동","2015", 99,88,77));
	
		System.out.println("이름 오름차순 정렬");
		Collections.sort(grades, new NameAscCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
		System.out.println("이름 내림차순 정렬");
		Collections.sort(grades,new NameDescCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
		System.out.println("총점 오름차순 정렬");
		Collections.sort(grades, new TotalAscCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
		System.out.println("총점 내림차순 정렬");
		Collections.sort(grades, new TotalDescCompareImpl());
		for (GradeVO grade : grades) {
			System.out.println(grade);
		}
	}
}
