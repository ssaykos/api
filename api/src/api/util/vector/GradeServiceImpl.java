package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {

	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString()으로 처리 예상
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#print()
	 */

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * 종합점수 기준 내림차수 정렬
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#descGradeTotal()
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * 종합점수 기준으로 오름차순 정렬
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#ascGradeTotal()
	 */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * 학번으로 검색하는 기능을 가진 메소드
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#descGradeTotal()
	 */
	@Override
	public Vector<String> searchGradeByHak(String hak) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#searchGradeByName(java.lang.String)
	 */
	@Override
	public String searchGradeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
