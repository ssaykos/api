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
		 * ���� ���� ���� 
		 * 1. map.put(vo.getId() , vo.getPassword); => map.put("id",vo.getId());
		 * 2. map.put("age",vo.getAge); =>String.valueOf(vo.getAge()));
		 * 3.map.get(Id) => �Ķ���� ������ �ݵ�� String���� �ؾ�..�Ѵ�..
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		map.put("age", String.valueOf(vo.getAge()));
		// Ű�� ��� ���Ͽ��� ������� String������ ���� ��Ű����
		//��Ʈ ������ ���� age�� ��Ʈ�� Ÿ������ ��ȯ �Ͽ���
		map.put("addr", vo.getAddr());
		//�� ������ DB�� ���� �ϴ� ���ϰ� ���� �ϴ�.. 
		//�� ���� Ȱ�� �ϸ鼭 �����ǰų� ���� �� �� �ֱ⿡ ���� ���� ������ ����DB�� �����ϰ� ����.
		
	}
	/*
	 * ȸ�� ������ �α��� ����� �ϴ� �޼ҵ� ���� �α��� ���� ���� �޼��� ���� ���⿡ ��������� �Ѵ�. 
	 */
	

	@Override
	public void login(String id, String password) {
		// TODO Auto-generated method stub
//		if(id.equals(vo.getId())&&password.equals(vo.getPassword())){
//			
//		}
		if(map.get("id").equals(id)&&map.get("password").equals(password)){
			System.out.println(vo.getAddr()+"�� ��ô�"+vo.getAge()+"����"+vo.getName()+"��ȯ���մϴ�.");
		}else if(!(map.get("id").equals(id))&&map.get("password").equals(password)){
			System.out.println("��й�ȣ�� ���� �۽��ϴ�");
		}else if(map.get("id").equals(id)&&!(map.get("password").equals(password))){
			System.out.println("�Է��Ͻ� ID�� �������� �ʰų� ��ġ ���� �ʽ��ϴ�.");
		}
	}

	//�α���
			/*
			 * ȸ�� ������ �α��� ����ϴ� �޼ҵ� ���Ŀ� ���ٸ� ���� �����ϱ�
			 * �α��� ������ ���� �޼������� ���⿡�� ��������� �Ѵ�.
			 */
	/*
	 * ��¹� ����  -> �Է��Ͻ� ID�� �������� �ʰų� ��ġ ���� �ʽ��ϴ�.
	 * 				����� �ٸ��ϴ�..�ٽ� �Է��ϼ���
	 * 				xx�� ��ô� xx�� xxx�� ȯ���մϴ� 
	 */
}
