package api.lang.string;
/*
 	java.lang.string ����
 	split("������")�޼ҵ�
 	�����ڸ� �������� String ���ڿ��� �и��Ͽ�
 	�迭��(ArrayList ����) �� ���� ��� ���.
 	�ڿ� ���ڰ� ������ �ܾ���� ������ �ְ�
 	������ ����Ʈ�� �� ������ �ش�.
 */
import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("\t"+fruits[i]);
		}
		System.out.println();
		System.out.println("split() ��°��:");
		/*
		 	split(String,int)
		 	int ũ�⸸ŭ ������ �ش�.
		 	������ ����Ʈ�� ��ü ����
		 */
		String[] fruits1 =  fruit.split(",",1);
		System.out.println(Arrays.toString(fruits1));
		String[] fruits2 =  fruit.split(",",2);
		System.out.println(Arrays.toString(fruits2));
		String[] fruits3 =  fruit.split(",",3);
		System.out.println(Arrays.toString(fruits3));
		String[] fruits4 =  fruit.split(",",4);
		System.out.println(Arrays.toString(fruits4));
	}
}
