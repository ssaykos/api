package api.util.colletions;

import java.util.Comparator;


public class NameDescCompareImpl implements  Comparator<GradeVO> {
	/*
	 * �̸����� �������� ����
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compare(GradeVO first, GradeVO second) {
		// TODO Auto-generated method stub
		return second.getName().compareTo(first.getName()) ;
	}

	
}
