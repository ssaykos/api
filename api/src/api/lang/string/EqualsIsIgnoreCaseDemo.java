package api.lang.string;

public class EqualsIsIgnoreCaseDemo {
	public static void main(String[] args) {
		System.out.println("Hello".equals("hello") ?  "true" : "false" );
		//�񱳴���� ��ҹ��� ���������� ��.
		System.out.println("Hello".equalsIgnoreCase("hello") ?  "true" : "false" );
		//�񱳴���� ��ҹ��� ���� ����
	}
}
