package api.util.vector.graderetry;

import java.util.Vector;

public class GreadeServiceImpl implements GradeService{
/*
 	�޼ҵ帶�� �����ϴ� �ټ��� �� (�л����� �ټ� )�� �ʿ��ѵ�
 	�Ѱ��� ������ �÷����� �ʵ忡 ���� �ؾ� �Ѵ�. 
 	�ʵ忡 �����ؾ� �޼ҵ� ���� ���� ����. 
 */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	GradeVO GradeService = new GradeVO();
	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		vc.add(vo);
	}
//	1.input(GradeVO vo) - �л����� ������ �Է��� �޴��� �׷� �Է¹޾Ƽ� ��������� �ʿ��ϴµ� 
//	�迭�� �ٸ� ������ �����ϴ� �����ε� �ѹ� �����ϸ� �߰��� �ø��� ������ �������� Ȯ���ϴ� �÷��� ����.
//	������ ���� ���� �ƴ°� ���� ���̶� ���ͷ� �ִ´�.

	@Override
	public void print() {
		// TODO Auto-generated method stub
		GradeService.toString();
	}
//	2.print() - ����ϴ°����� ���� ������ vo��ü�� ����Ʈ���� �̿�
	
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
//	5. �������� ����- Collection.sort ���� �ȴ� - �˰ԵǸ� ó��

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
//	6.�������� ���� - Arrays.sort ���� ��

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
//	3. searchGradeByHak(String hak) - �й����� ������ ��ȸ�ϴ� ���
//	�й��� ��ġ�� �����Ƿ� ���ϰ��� ���ڿ� ���״� ������ ���� + ������ ������ �̿�

	@Override
	public Vector<String> searchGradeByName(String name) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

//	4. �̸��˻� - �̸����� ���� ��ȸ�ε� ���ϰ��� �����̴�. �������� ��Ʈ���� ó���ϰ� ����
//	���ϰ��� �ϳ��̵� �������̵� ������ ������ �����ۿ��� ���Ϳ�� ����� �Ҽ��� ����. ���� ��
}
