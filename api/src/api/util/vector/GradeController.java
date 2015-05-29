package api.util.vector;
/*
 * vo,interface 클래스다이어그램
 * vo 게터세터 implement
 * 
 	1.기능중에 토탈을 구하는 기능이 필요한데 토탈을 구하기 위해서는 과목점수 역시 필요하고 접근이 VO에서 더 편하므로 총점구하는 기능과 투 스트링 기능은 VO에서 구현하겠다.
 	2.vo는 완성했다고 보고 홀딩
 	3.대략 기능을 구현해서 기제품(프로토타입) 을 만든다.
 	 = 이때 테스트 값을 임의의 더미 값을 만들어서 써본다.
 */
import java.io.ObjectInput;
import java.util.Scanner;
import java.util.Vector;

public class GradeController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl grade = new GradeServiceImpl();
		
		System.out.println("성적관리 프로그램");
		
//		System.out.print("입력할 학생의 인원 수->");
//		int n = scanner.nextInt();
		String name, hak;
//		int kor,eng,math;
//		for (int i = 0; i < n; i++) {
//			System.out.print("이름 입력 ->");
//			name=scanner.next();
//			
//			System.out.print("학번 입력 ->");
//			hak=scanner.next();
//			
//			System.out.println("국어 점수 입력 ->");
//			kor=scanner.nextInt();
//			
//			System.out.println("영어 점수 입력 ->");
//			eng= scanner.nextInt();
//			
//			System.out.println("수학 점수 입력 ->");
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
		
		System.out.println("검색할 학생의 이름 ->");
		name =scanner.next();
		System.out.println("리턴값 스트링 서치 이름 메서드 결과값");
//		String val1=grade.searchGradeByName1(name);
		System.out.println(grade.searchGradeByName1(name));
//		System.out.println(val1);
		System.out.println("리턴값 벡터스트링 서치 이름 메서드 결과값");
//		Vector<String> val2=grade.searchGradeByName(name);
		System.out.println(grade.searchGradeByName(name));
//		System.out.println(val2);
		System.out.println("학번 검색 ->");
		hak=scanner.next();
		System.out.println(grade.searchGradeByHak(hak));

		//		Object[] vo={name,hak,kor,eng,math};

		//		GradeVO vo={vo.setName(name),hak,kor,eng,math};

		//		vo.getClass().getConstructor(vo<GradeVO>name,hak,kor,eng,math);

		//		gradeS.input(vo);
		
		//컬랙션 내부의 <클래스 타입> 을 제네릴 이라고 함.
		//특별한 기능을 말하는 것이 아니고 컬렉션 내부의 타입 캐스팅을 한다
		System.out.println();
		System.out.println("오름차순 정렬");
		grade.descGradeTotal();
		grade.print();
		System.out.println();
		
		System.out.println("내림차순 정렬");
		grade.ascGradeTotal();
		grade.print();
		System.out.println();
	}
}