package api.util.vector;
/*
 * vo,interface Ŭ�������̾�׷�
 * vo ���ͼ��� implement
 * 
 	1.����߿� ��Ż�� ���ϴ� ����� �ʿ��ѵ� ��Ż�� ���ϱ� ���ؼ��� �������� ���� �ʿ��ϰ� ������ VO���� �� ���ϹǷ� �������ϴ� ��ɰ� �� ��Ʈ�� ����� VO���� �����ϰڴ�.
 	2.vo�� �ϼ��ߴٰ� ���� Ȧ��
 	3.�뷫 ����� �����ؼ� ����ǰ(������Ÿ��) �� �����.
 	 = �̶� �׽�Ʈ ���� ������ ���� ���� ���� �ẻ��.
 */
import java.io.ObjectInput;
import java.util.Scanner;
import java.util.Vector;

public class GradeController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl grade = new GradeServiceImpl();
		
		System.out.println("�������� ���α׷�");
		
//		System.out.print("�Է��� �л��� �ο� ��->");
//		int n = scanner.nextInt();
		String name, hak;
//		int kor,eng,math;
//		for (int i = 0; i < n; i++) {
//			System.out.print("�̸� �Է� ->");
//			name=scanner.next();
//			
//			System.out.print("�й� �Է� ->");
//			hak=scanner.next();
//			
//			System.out.println("���� ���� �Է� ->");
//			kor=scanner.nextInt();
//			
//			System.out.println("���� ���� �Է� ->");
//			eng= scanner.nextInt();
//			
//			System.out.println("���� ���� �Է� ->");
//			math=scanner.nextInt();
//		
//			GradeVO vo = new GradeVO(name,hak,kor,eng,math);
//			
//			grade.input(vo);
//			
//		}
		GradeVO vo1 = new GradeVO("aa","1111",99,99,99);
		GradeVO vo2 = new GradeVO("aa","1112",88,88,88);
		GradeVO vo3 = new GradeVO("as","1113",89,89,89);
		grade.input(vo1);
		grade.input(vo2);
		grade.input(vo3);
//		Vector<GradeVO> vec = new Vector<GradeVO>();
//		
//		vec.add(vo1);
//		vec.add(vo2);
//		vec.add(vo3);
//		GradeVO a1=null;
//		vec.insertElementAt(a1, 1);
//		System.out.println(vec);
		
		grade.print();
		
		System.out.println("�˻��� �л��� �̸� ->");
		name =scanner.next();
		System.out.println("���ϰ� ��Ʈ�� ��ġ �̸� �޼��� �����");
//		String val1=grade.searchGradeByName1(name);
		System.out.println(grade.searchGradeByName1(name));
//		System.out.println(val1);
		System.out.println("���ϰ� ���ͽ�Ʈ�� ��ġ �̸� �޼��� �����");
//		Vector<String> val2=grade.searchGradeByName(name);
		System.out.println(grade.searchGradeByName(name));
//		System.out.println(val2);
		System.out.println("�й� �˻� ->");
		hak=scanner.next();
		System.out.println(grade.searchGradeByHak(hak));

		//		Object[] vo={name,hak,kor,eng,math};

		//		GradeVO vo={vo.setName(name),hak,kor,eng,math};

		//		vo.getClass().getConstructor(vo<GradeVO>name,hak,kor,eng,math);

		//		gradeS.input(vo);
		
		//�÷��� ������ <Ŭ���� Ÿ��> �� ���׸� �̶�� ��.
		//Ư���� ����� ���ϴ� ���� �ƴϰ� �÷��� ������ Ÿ�� ĳ������ �Ѵ�
		System.out.println();
		System.out.println("�������� ����");
		grade.descGradeTotal();
		grade.print();
		System.out.println();
		
		System.out.println("�������� ����");
		grade.ascGradeTotal();
		grade.print();
		System.out.println();
	}
}