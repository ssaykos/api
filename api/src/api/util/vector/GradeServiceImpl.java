package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl extends GradeVO implements GradeService {// �����ϴ� ���� ��ӽ�Ŵ..
	private Vector<GradeVO> vecvo = new Vector<GradeVO>();
//	ArrayList<GradeVO> list = new ArrayList<GradeVO>();
	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
//		vo.GradeVO(vo.hak, vo.name, kor, vo.eng, vo.getMath());
//		vo.getClass().getConstructor(GradeVO<vo>vo.hak, vo.getName(), vo.kor, vo.eng, vo.getMath());
//		vo.setName(null);
//		vo.setHak(null);
//		vo.setKor(0);
//		vo.setEng(0);
//		vo.setMath(0);
//		super.getClass().getConstructors();
//		??
		vecvo.add(vo);  //�̰� �´°ǰ�??????????????????????????
	}
	
	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString()���� ó�� ����
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#print()
	 */

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < vecvo.size(); i++) {
			System.out.println(vecvo.elementAt(i).toString()+"����"+vecvo.elementAt(i).getTotal());
		}
		
	}
	
	/*
	 * �������� ���� �������� ����
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#descGradeTotal()
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
//		super.getTotal();
//		Arrays.sort(a.get(getTotal()), 1, 2, a);
//		for (int i = 0; i < vecvo.size(); i++) {
//			list.addAll(i, (Collection<? extends Vector<GradeVO>>) vecvo.elementAt(i));
//		}
//		
//		Arrays.sort(list);
//		GradeVO vo;
//		for (int i = 0; i < vecvo.size(); i++) {
//			vo=vecvo.elementAt(i);
//			list.addAll(i, vo);
//		}
//		for (int i = 0; i < vecvo.size(); i++) {
//			GradeVO vo = vecvo.elementAt(i);
//			list.add(vo);
//		}
//		Arrays.sort(list, 0,vecvo.get(getTotal());
//		List list = new ArrayList<GradeVO>();
//		for (int i = 0; i < vecvo.size(); i++) {
//			list.add(vecvo.elementAt(i));
//		}
//		Arrays.
//		vecvo.add(aa);
		
//		vecvo.removeElementAt(vecvo.size()-1);
		GradeVO a1=null,a2=null;
		for (int k = 0; k < vecvo.size(); k++) {
			for (int i = 1; i < vecvo.size(); i++) {
				for (int j = i-1; j < vecvo.size(); j++) {
					if (i<vecvo.size()&&vecvo.elementAt(j).getTotal()>vecvo.elementAt(i).getTotal()) {
						a1=vecvo.elementAt(j);
						a2=vecvo.elementAt(i);
//						vecvo.elementAt(j)=vecvo.elementAt(i);
						vecvo.insertElementAt(a2, j);
						vecvo.remove(j+1);
						vecvo.insertElementAt(a1, i);
						vecvo.remove(i+1);

					}
				}
			}
		}

	}

	/*
	 * �������� �������� �������� ����
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#ascGradeTotal()
	 */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		GradeVO a1=null,a2=null;
		for (int k = 0; k < vecvo.size(); k++) {
			for (int i = 1; i < vecvo.size(); i++) {
				for (int j = i-1; j < vecvo.size(); j++) {
					if (i<vecvo.size()&&vecvo.elementAt(j).getTotal()<vecvo.elementAt(i).getTotal()) {
						a1=vecvo.elementAt(j);
						a2=vecvo.elementAt(i);
//						vecvo.elementAt(j)=vecvo.elementAt(i);
						vecvo.insertElementAt(a2, j);
						vecvo.remove(j+1);
						vecvo.insertElementAt(a1, i);
						vecvo.remove(i+1);

					}
				}
			}

		}
	}

	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ�
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#descGradeTotal()
	 */
	@Override
	public String searchGradeByHak(String hak) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < Vector.length; i++) {
//			array_type array_element = Vector[i];
//		}
//		for (Vector<String> vo : ) {
//		}
//		String msg="";
//		for (int i = 0; i < vecvo.size(); i++) {
//			if(vecvo.get(i).getHak()==hak){
//				System.out.println(vecvo.get(i).toString());
//				msg=vecvo.get(i).toString();
//				System.out.println(msg);
//				break;
//			}
//		}
//		
//		return null;
		String grade="";
		for (int i = 0; i < vecvo.size(); i++) {
			if(hak.equalsIgnoreCase(vecvo.elementAt(i).getHak())){
				grade+=vecvo.elementAt(i).toString();
			}
		}
		return grade;
	}

//	public String searchGradeByHak1(String hak) {
//
//
//		// TODO Auto-generated method stub
////		for (int i = 0; i < Vector.length; i++) {
////			array_type array_element = Vector[i];
////			
////		}
////		for (Vector<String> vo : ) {
////			
////		}
////		Vector<GradeVO> a = new Vector<GradeVO>();
////		String msg="";
////		for (int i = 0; i < a.size(); i++) {
////			if(a.get(i).getHak()==hak){
////				System.out.println(a.get(i).toString());
////				msg=a.get(i).toString();
////				break;
////			}
////		}
////		
////		return msg;
//		String grade="";
//		for (int i = 0; i < vecvo.size(); i++) {
//			if(hak.equalsIgnoreCase(vecvo.elementAt(i).getHak())){
//				grade+=vecvo.elementAt(i).toString();
//			}
//		}
//		return grade;
//	}
	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 * (non-Javadoc)
	 * @see api.util.vector.GradeService#searchGradeByName(java.lang.String)
	 */
	
	public String searchGradeByName1(String name) {
		String grade="";
		for (int i = 0; i < vecvo.size(); i++) {
//			System.out.println(vecvo.elementAt(i)+name);
			if(name.equalsIgnoreCase(vecvo.elementAt(i).getName())){
				grade+=vecvo.elementAt(i).toString();
			}
		}
		if(grade.equalsIgnoreCase("")){
			grade="ã���� �����ϴ�.";
		}
		return grade;
	}
	
	public Vector<String> searchGradeByName(String name){
		Vector<String> aas = new Vector<String>();
		String as="";
		for (int i = 0; i < vecvo.size(); i++) {
			if (name.equalsIgnoreCase(vecvo.elementAt(i).getName())) {
				as=vecvo.elementAt(i).toString();
				aas.add(as);
			}
		}
		if(aas.equals(null)){
			as="ã�� �� �����ϴ�.";
			aas.add(as);
		}
		return aas;
	}
}