package api.lang.wrapper;
/*
 	JDK1.5(�ڹٹ���5)���� ���Ե� ����ڽ�(autoboxing)�������
 	��ȯ ���� �⺻���ϰ��� wrapper class�̸�..
 	�������̾���.
 	�׷��� parseInt()�� valueOf()�� ���̾���.
 */

public class ParseIntDemo {
	public static void main(String[] args) {
		//���ͷ� ���� �⺻������ ĳ���ý� ��ȯ���
		//�� string =>int
		int num1=Integer.parseInt("200");
		int num2=Integer.parseInt("200");
		int result=num1+num2;
		System.out.println(result);
		//�⺻���� ���������� ����ȯ �ϴ� ��� (ĳ���� ��������)
		Integer num3=result;
		System.out.println("�⺻���� ���������� ����ȯ�� ��� : "+num3);
		int num4 = 2+num3;
		System.out.println("�������� �⺻������ ���� ��:"+num4);
		int num5=Integer.parseInt("Hello");
		/*
		 * num5�� at java.lang.NumberFormatException.forInputString�̹߻��Ѵ�.
		 * �̰���� ���ڰ��� ���������� ����ȯ �õ��޴��� ���θ� ����ϰ� ������ؾ� �Ѵ�.
		 */
		System.out.println(num5);
	}
}
