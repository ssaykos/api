package api.util.colletions;

import java.util.Comparator;

public class NameAscCompareImpl implements  Comparator<GradeVO>{
	/*
	 * 	 �̸����� �������� ����
	 * 	��, ��, ��...
	 * 	a,b,c...
	 * 
	 */
	public int compare(GradeVO first , GradeVO second) {
		// TODO Auto-generated method stub
		return first.getName().compareTo(second.getName());
		/*
		 * ���� �Ķ���Ϳ� �ִ� �ձ��ڿ� ���ؼ� �ձ��ڰ� ���������� ���ڶ�� �� ���ں��� ����.
		 */
	}

}
