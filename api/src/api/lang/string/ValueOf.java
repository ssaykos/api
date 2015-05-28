package api.lang.string;
/*
 	java.lang.string �� �޼ҵ���
 	toUpperCase()�� �ش� ���ڿ��� ���� �빮�ڷ� ��ȯ
 	toLowerCase()�� �ش� ���ڿ��� ���� �ҹ��ڷ� ��ȯ
 	valueOf()�� �ٸ� Ÿ���� ��� ���ڿ��� ��ȯ
 */

public class ValueOf {
	public static void main(String[] args) {
		String str1 = "Hello Java";
		String msg;
		System.out.println("�׽�Ʈ ���� : "+str1);
		msg=str1.toUpperCase();
		System.out.println(msg);
		msg=str1.toLowerCase();
		System.out.println(msg);
		/*
		 	������ valueOf()�� �Ķ���Ͱ��� int���̴�.
		 	Integer.parseInt()�� ���� �ʰ�
		 	String�� ����ƽ �޼ҵ��� valueOf()
		 	�� ȣ���ϸ� �ٷ� ���ڿ��� ��ȯ�ȴ�.
		 */
		msg= String.valueOf(str1.length());
		System.out.println("valueOf�� ��� : "+msg);
	}
}
