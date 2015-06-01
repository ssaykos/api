package api.util.colletions;

import java.util.Vector;

public interface GradeService {
	public void input(GradeVO vo);
	public void print();
	public void descGradeTotal();
	public void ascGradeTotal();
	public String searchGradeByHak(String hak);
	public Vector<String> searchGradeByName(String name);
//	public Vector<String> searchGradeByHak(String hak);
//	public String searchGradeByName(String name);// 타이핑 잘못했던 부분..
}