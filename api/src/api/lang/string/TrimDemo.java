package api.lang.string;
/*
 	java.lang.string �� �ִ� trim()�޼ҵ�� ���ڿ� �յ� ������ �����Ѵ�.
 	���ڿ� ������ ������ �������� �ʴ´�.
 */
public class TrimDemo {
	public static void main(String[] args) {
		String str = "     Hello java world!!";
		System.out.println("trim()����:"+str.trim());
		String str2="   Hello java world!!        ";
		System.out.println("�޼��� ü������ ���� :"+str2.trim().replace("Java", "J.S.P."));
		/*
		 	trim() ó�� �����ϴ� ���� String Ÿ���̸� String �޼ҵ带 �����ؼ� ����Ҽ� �ִµ�
		 	�̰��� �޼ҵ� ü���̶�� �ϸ�, ���� STring Ŭ������ ���� �޼ҵ带 �����Ҷ� 
		 	���������� trim()�� ������Ѽ� ����ȴ�.
		 */
		System.out.println("trim()�� ������� �������"+"    Hello  Java".indexOf("J"));
		System.out.println("trim()�� ����Ѱ��"+"     Hello  Java".trim().indexOf("J"));
	}
}
