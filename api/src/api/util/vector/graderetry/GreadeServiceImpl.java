package api.util.vector.graderetry;

import java.util.Vector;

public class GreadeServiceImpl implements GradeService{
/*
 	메소드마다 공유하는 다수의 값 (학생수가 다수 )이 필요한데
 	한곳에 저장할 컬렉션을 필드에 선언 해야 한다. 
 	필드에 선언해야 메소드 들이 값을 공유. 
 */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	GradeVO GradeService = new GradeVO();
	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		vc.add(vo);
	}
//	1.input(GradeVO vo) - 학생별로 성적을 입력을 받는지 그럼 입력받아서 저장공간이 필요하는데 
//	배열이 다른 변수를 저장하는 공간인데 한번 생성하면 추가로 늘릴수 없으니 동적으로 확장하는 컬랙션 선택.
//	하지만 내가 지금 아는건 백터 뿐이라 백터로 넣는다.

	@Override
	public void print() {
		// TODO Auto-generated method stub
		GradeService.toString();
	}
//	2.print() - 출력하는것인지 보고 맞으면 vo객체의 투스트링을 이용
	
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
//	5. 내림차순 정렬- Collection.sort 쓰면 된다 - 알게되면 처리

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
//	6.오름차순 정렬 - Arrays.sort ㄱㄱ ㅅ

	@Override
	public String searchGradeByHak(String hak) {
		// TODO Auto-generated method stub
		Vector<String> local = new Vector<String>();
		String msg ="";
		for (int i = 0; i < vc.size(); i++) {
			if(hak.equalsIgnoreCase(vc.elementAt(i).getHak())){
				local.add(name);
			}else{
				
			}
			
		}
		return msg;
	}
//	3. searchGradeByHak(String hak) - 학번으로 성적을 조회하는 기능
//	학번은 겹치지 않으므로 리턴값이 문자열 일테니 백터의 포문 + 내부의 이프문 이용

	@Override
	public Vector<String> searchGradeByName(String name) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

//	4. 이름검색 - 이름으로 성적 조회인데 리턴값이 백터이다. 복수계의 스트링을 처리하게 설계
//	리턴값이 하나이든 여러개이든 포문과 이프문 구성밖에는 백터요소 출력을 할수가 없다. ㄱㄱ ㅅ
}
