package api.lang.object;
/*
 	java.lang.object�� �޼ҵ�
 	equals() : ���� ������ ���� üũ
 	 = �ν��Ͻ� ������ �ؽ��ڵ尪(���ּҰ�)�� ���ϴ� �޼ҵ�
 */

public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		//reselt �� �������� �̱� ������ �ݵ�� �ʱ�ȭ �ؾ� �Ѵ�. // �ɺ��� (�ʵ忡 �ִ� ������) �ʱ�ȭ ���� �ʾƵ� ��.
		String result = "";
//		if (condition) {
//			
//		}else{
//			
//		}// �����´� �ϵ��ڵ����� �ͼ������� �Ѵ�.
		if (t1.equals(t2)) {
			System.out.println("t1�� t2�� ���� ����.");
		}else{
			System.out.println("t1�� t2�� ���� �ٸ���.");
		}
		// ���� �����ڴ� if else�� ��ü �ϴ� �����̴�.
		// ������ (���ǽ�) ? "�� �� ���" : "���� �� ���";
		result = (t1.equals(t2)) ? "t1�� t2�� ���� ����." : "t1�� t2�� ���� �ٸ���.";
		System.out.println("�����ڸ� ���� ������ �������� ���� �� : "+result);
		t2= t1;
		result =(t1.equals(t2)) ? "t1�� t2�� ���� ����." : "t1�� t2�� ���� �ٸ���.";
		System.out.println("���� ���� ������ �Ҵ�� ���� ���� ���� �� : "+result);
	}
}

class Temp{
	int num; // �ʵ忡 �ִ� �ν��Ͻ� ������ �ʱ�ȭ �ʿ� ���� // �ʵ�� Ŭ���� ���ο��� �̾߱� ���� �޼��� ���δ� �ʵ尡 �ƴϴ�.
	
	public Temp(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		/*
		 	 ��� ���´� ���� ����� �ν��Ͻ� ������ 
		 	 �� ���ÿ� �ִ� �� ���������� �Ҵ�� ���� 
		 	 �ν��Ͻ��� �Ѱ��ְ� ���� (����) ���� �ڽ��� 
		 	 ������� �ó������� ���� �Ѵ�. 
		 */
	}
}