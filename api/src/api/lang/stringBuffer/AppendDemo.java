package api.lang.stringBuffer;
/*
 	StringBufferŬ����
 	-String Ŭ������ �������� �ν��Ͻ� ������ ���ڿ��� ��� �� �ְ� ���� �ִ�.
 */
/*
 	java.langStringBuffer�� �żҵ��� append()�� �Ķ���ͷ� ���� String ���� 
 	������ ���ڿ� �ڿ� ���δ�.
 */
public class AppendDemo {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		StringBuffer buf1 = new StringBuffer("A B C");
		StringBuffer buf2 = buf1.append("D E F");
		String msg;
		if(buf1==buf2){
			msg="buf1 == buf2";
		}else{
			msg="buf1 != buf2";
		}
		System.out.println(msg);
		System.out.println(buf1.toString());
		System.out.println(buf2.toString());
		/*
		 	buf2�� ���Ӱ� �����Ǿ� ���޵� ��ü�� �ƴϸ�
		 	buf1�� ���������� �����Ǿ� ���޹����Ƿν� ������ �ּҰ��� �����ȴ�.
		 	
		 	StringBufferŬ������ String Ŭ������ �ٸ��� ���к��ϰ� ��ü ������ ���� �ʴ´�.
		 	�׸���, ���� ������ �� �ִ� �������� Ư¡�� �ִ�.
		 	�׷��Ƿ� ����� ���ڿ� ���� �۾��� �ʿ��� ��� String Ŭ���� ����  StringBuffer Ŭ������ �� �����ϴ�.
		 	
		 	��뿹 :ī�忡�� ���ڸ� ������ ������� ���ٰ� �ٽ� ����� ���ۼ��ؼ� ������ ��찡 ��ǥ���̴�.
		 	�� Buffer�� �����Ű�ٰ� ����ڰ� �������� ���͸� ������ �۾���
		 	 buffer���� ��ü�� ���� ���Ѽ� ������ �ó������� ����ȴ�.
		 */
	}
}
