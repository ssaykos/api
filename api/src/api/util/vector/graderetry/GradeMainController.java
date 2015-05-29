package api.util.vector.graderetry;

import api.util.vector.GradeServiceImpl;

public class GradeMainController {
	public static void main(String[] args) {
		GradeServiceImpl impl = new GradeServiceImpl();
		
		GradeVO v1 = new GradeVO("±è±æµ¿", "1111", 99, 99, 99);
		GradeVO v2 = new GradeVO("ÀÌ±æµ¿", "2222", 77, 77, 77);
		GradeVO v3 = new GradeVO("È«±æµ¿", "1111", 99, 99, 99);
	}
}
