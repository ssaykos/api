package api.lang.string;
/*
  	api.lang.string
  	==�� ��ü�� ���۷��� ���� (hash code table)�� ���Ѱ�
  	���ڿ��� ���� �񱳴� �ݵ�� equals() �޼ҵ带 �̿�.
  	new �� �̿��ϸ� heap ������ ���ο� �޸𸮸� �Ҵ��ϰ�
  	hashcode �� �����Ѵ�.
 */

public class EqualsDemo {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		//��Ʈ�� ���� ���ͷ� ����� �����ؼ� �����Ѱ��
		String result1 = (str1==str2) ? " 1-2�� ����" : "1-2�� �ٸ�";
		String result2 = (str1.equals(str2)) ? " 1-2�� ����" : "1-2�� �ٸ�";
		
		System.out.println("(str1==str2) �� ��� ="+result1);
		System.out.println("(str1.equals(str2)) �� ���="+result2);
		//�Ѵ� �ּҰ� ����.
		
		String str3 = new String("abc");// �ּҰ� �Ӽ��� ������ ȥ�� �ٸ��� ������ ����?
		String str4 = new String("abc");
		//��Ʈ�� ���� �����ڷ� ������ ���
		String result3 = (str3==str4) ? " 3-4�� ����" : "3-4�� �ٸ�";// �ּҰ� �Ӽ��� ������ ȥ�� �ٸ��� ������ ����?
		String result4 = (str3.equals(str4)) ? " 3-4�� ����" : "3-4�� �ٸ�";
		
		System.out.println("(str3==str4) �� ��� ="+result3);
		System.out.println("(str3.equals(str4)) �� ���="+result4);
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());
		/*
		 	result3�� ����� �ٸ��Ƿ� ���� ����.
		 	string Ŭ������ �����ڸ� �̿��Ͽ� String �ν��Ͻ��� ������ ��쿡��
		 	 = new �����ڿ� ���� �޸� �Ҵ��� �̷����� ������ 
		 	 - �׻� ���ο� String �����ڰ� �����ȴ�.
		 	 - �׷��� , String Ÿ���� �����ڷ� ��ü�� �������� ���� ���ͷ��� �����Ѵ�.
		 */
		/*
		 	��� Ŭ�������� (*.class)���� constant pool �̶�� ������� �־ 
		 	Ŭ���� ���� ���Ǵ� ��� ���ͷ��� ������� ����Ǿ��ִ�..
		 	����ϰ��� �ϴ� ���ڿ��� ���Ǯ(static)�� �̹� �����ϴ� ��쿡�� �� ���ڿ��� �ּҰ��� ��ȯ�Ѵ�.
		 */
		String str5 = new String("abc");
		String str6 = "abc";
		String result5 = (str5==str6) ? "5-6�� ����" : "5-6�� �ٸ�";
		String result6 =(str5.equals(str6))?"5-6�� ����" : "5-6�� �ٸ�";
		System.out.println("(str5==str6)�ΰ��="+result5);
		System.out.println("(str5.equals(str6))�ΰ��="+result6);
	}
}
