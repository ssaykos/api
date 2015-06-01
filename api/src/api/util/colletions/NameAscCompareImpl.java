package api.util.colletions;

import java.util.Comparator;

public class NameAscCompareImpl implements  Comparator<GradeVO>{
	/*
	 * 	 이름으로 오름차순 정렬
	 * 	ㄱ, ㄴ, ㄷ...
	 * 	a,b,c...
	 * 
	 */
	public int compare(GradeVO first , GradeVO second) {
		// TODO Auto-generated method stub
		return first.getName().compareTo(second.getName());
		/*
		 * 뒤의 파라미터에 있는 앞글자와 비교해서 앞글자가 먼저나오는 글자라면 그 글자부터 리턴.
		 */
	}

}
