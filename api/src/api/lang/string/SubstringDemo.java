package api.lang.string;
/*
 	java.lang.string�� �ִ� substring()�޼ҵ�� ������ġ(begin) ���� ����ġ(end)���� ���ڿ� ����
 	begin <=x<end
 */
public class SubstringDemo {
	public static void main(String[] args) {
		System.out.println("�Ķ���Ͱ� �Ѱ��϶� :"+"Hello Java".substring(6));
		//0���� �����ϰ� ���鵵 �ڸ��� �����Ѵ�.
		System.out.println("�Ķ���Ͱ� �ΰ��϶� :"+"Hello Java".substring(6, 8));
		
	}
}
