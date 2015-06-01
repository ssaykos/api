package api.util.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String id, String password, String name, int age, String addr) {
		// TODO Auto-generated method stub
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		/*
		 * 맵의 에러 유형 
		 * 1. map.put(vo.getId() , vo.getPassword); => map.put("id",vo.getId());
		 * 2. map.put("age",vo.getAge); =>String.valueOf(vo.getAge()));
		 * 3.map.get(Id) => 파라미터 유형은 반드시 String으로 해야..한다..
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		map.put("age", String.valueOf(vo.getAge()));
		// 키의 밸류 패턴에서 밸류값을 String값으로 통일 시키려고
		//인트 값으로 들어온 age를 스트링 타입으로 변환 하엿다
		map.put("addr", vo.getAddr());
		//이 패턴은 DB에 저장 하는 패턴과 동일 하다.. 
		//즉 값을 활용 하면서 오염되거나 변질 될 수 있기에 가장 먼저 순수한 값을DB에 저장하고 본다.
		
	}
	/*
	 * 회원 가입후 로그인 기능을 하는 메소드 이후 로그인 성공 실패 메세지 까지 여기에 마감지어야 한다. 
	 */
	

	@Override
	public void login(String id, String password) {
		// TODO Auto-generated method stub
//		if(id.equals(vo.getId())&&password.equals(vo.getPassword())){
//			
//		}
		if(map.get("id").equals(id)&&map.get("password").equals(password)){
			System.out.println(vo.getAddr()+"에 사시는"+vo.getAge()+"세의"+vo.getName()+"님환영합니다.");
		}else if(!(map.get("id").equals(id))&&map.get("password").equals(password)){
			System.out.println("비밀번호가 맞지 앟습니다");
		}else if(map.get("id").equals(id)&&!(map.get("password").equals(password))){
			System.out.println("입력하신 ID는 존재하지 않거나 일치 하지 않습니다.");
		}
	}

	//로그인
			/*
			 * 회원 가입후 로그인 기능하는 메소드 이후에 별다른 말이 없으니까
			 * 로그인 성공시 실패 메세지까지 여기에서 마감지어야 한다.
			 */
	/*
	 * 출력문 예시  -> 입력하신 ID는 존재하지 않거나 일치 하지 않습니다.
	 * 				비번이 다릅니다..다시 입력하세요
	 * 				xx에 사시는 xx세 xxx님 환영합니다 
	 */
}
