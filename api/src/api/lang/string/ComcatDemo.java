package api.lang.string;
/*
 	java.lang.string �� ���� �޼ҵ�
 	�ΰ��� ���ڿ��� ��ģ��.
 */
public class ComcatDemo {
	public static void main(String[] args) {
		String str1 = "�ڹ�";
		String str2 = "API �н���..";
		String str3 = str1+str2;
		System.out.println("+������ ��� ��� : "+str3);
		
		//concat����
		String str4="concat()���� : ��ο� ,";
		System.out.println(str4.concat("�ڹٿ���.."));
	}
}
