package api.util.vector;

import java.util.Vector;

public interface GradeService {
	public void input(GradeVO vo);
	public void print();
	public void descGradeTotal();
	public void ascGradeTotal();
	public Vector<String> searchGradeByHak(String hak);
	public String searchGradeByName(String name);
}
