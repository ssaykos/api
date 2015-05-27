package api.lang.object;
/*
 	�ؽ�(hashing)����� ���Ǵ� �ؽ��Լ�(hash function)�� �����ϴ� ��.
 	�ؽ��� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� ���Ǵ� ������ ���� ���.
 	ex) Ʈ��Ƽ���� �ؽ��±׸� �Խñۿ� ÷���ϴ� ��.
 		������ �ؽ��±װ� ÷�ε� �Խñ��� ������ �ؽ��ױ� ( �ּҰ�) �� �����ϰ� 
 		�Ǿ� �˻��� ������ ������� �����ϴ� ����� �Ѵ�.
 */

public class HashCodeDemo {
	public static void main(String[] args) {
		String abc = new String("abc");
		String abc2 = "abc";
		System.out.println("abc�� �ؽ� �±� : " + abc.hashCode());
		System.out.println("abc�� �ؽ� �±� : " + abc2.hashCode());
		/*
		 	abc�� �ؽ� �±� : 96354
			abc�� �ؽ� �±� : 96354  // ���� �����ؼ�����.. �п��� �ݳ����� ��� ��ǻ�Ϳ��� ���� �ּ� ���� ���. 
			 ���� �ܼ� ��� ���̴�.
			 �ᱹ String Ÿ���� new String("abc")ó��
			 �����ڸ� ���� �����̳�, ""ó�� ���ͷ� ������ �����̳�
			 ������ �ּҰ��� �����ٴ� ���� �� �� �ִ�.
			 ��� ��ü�� , �����ϰ� String �� �̰��� Ư¡�� ������.
		 */
	}
}
