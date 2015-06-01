package api.util.colletions;

import java.util.Comparator;


public class TotalAscCompareImpl implements Comparator<GradeVO>{

	@Override
	public int compare(GradeVO first, GradeVO second) {
		// TODO Auto-generated method stub
		return (first.getTotal()>second.getTotal()) ? -1 : (first.getTotal() < second.getTotal())?1:0;
	}

}
