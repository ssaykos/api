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
		/*
		 	�� ������ �ڹ� ���� jdk5 ������ ����
		 	���� 5���� replace()����� Ȯ��Ǿ� replaceAll() ó��
		 	������ ���ڿ��� ���� �ϰ� �Ǿ����ϴ�.
		 	�׷��ٸ� �������� ����? �� �ƴմϴ�.
		 	�������� ���� ����� �ִ��� ������ ���ο� ���� �������� �ֽ��ϴ�.
		 */
		System.out.println("[1] A B C D : A B C D".replace(" C D", " E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll(" C D", " E F"));
		
		System.out.println("[3] Hello Java !!".replace("!", ""));
		System.out.println("[4] Hello Java !!".replaceAll(".!", ""));
		System.out.println("[5] Hello Java !!".replaceAll("..!", ""));
		/*
		 	.�� ��Ȱ�� ���ԽĿ��� ���̴µ� �� �� �ѱ��ڸ� �����Ѵ�.
		 	�� ����ǥ�� �ΰ��ִµ� �տ� �ѳ༮�� ����ڴٴ� �ǹ��̰� �̱���� replaceAll()���Ը� �ֽ��ϴ�.
		 	���� replace()���ٴ�  ���Խı��� ó������� replaceAll()�� ����
		 */
	}
}
