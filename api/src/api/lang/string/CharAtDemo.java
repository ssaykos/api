package api.lang.string;
/*
 	java.lang.string  �� ���� �޼ҵ�
 	charAt(): ������ ��ġ�� �ִ� ���ڸ� ������. index�� 0 ���� ����
 	indexOf() : �־��� ���ڰ� �����ϴ� �� Ȯ�� �Ͽ� ��ġ�� �˷��� ������ - 1 �� ��ȯ
 */

public class CharAtDemo {
	public static void main(String[] args) {
		String ssn="900101-1234567";
		/*
		 	index�� 0���� �����ϹǷ� �����ϴ� 1���� 7��°�� ��ġ
		 */
		/*
		 	indexOf() �� �Ķ���ͷ� �־��� String ���� ��ġ ���� �����Ѵ�.
		 	"-" �� ���� ���� ���ฦ �����ϴ� ���̹Ƿ� +1�� �־���.
		 */
		//char isMan = ssn.charAt(7);
		char isMan = ssn.charAt(ssn.indexOf("-")+1);
		switch (isMan) {
		case '1':case '3': System.out.println("����"); break;

		case '2':case '4': System.out.println("����"); break;
			
		default: System.out.println("�߸��� �Է°��Դϴ�"); break;
		}
	}
}
