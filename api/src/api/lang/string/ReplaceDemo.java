package api.lang.string;
/*
 	java.lang.string �޼ҵ�
 	replace("OLD","NEW") : String ���ڿ����� "OLD"���ڸ� "NEW"���ڷ� ��ó�Ѵ�.
 	���� ��ü�ϴ� ���ڰ� �����̸� replaceAll()�޼ҵ带 ����Ѵ�.
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		System.out.println("A B C D : A B C D".replaceAll(" C D", " E F"));
		//replaceAll�ѹ��忡 ������ ��ġ�� ���ڿ��� �ѹ��� �ٲܶ� ���� �޼ҵ�
	}
}
