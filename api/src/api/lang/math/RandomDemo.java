package api.lang.math;

import java.util.Scanner;

/*
 	java.lang.math �� ����
 	ramdom()�޼ҵ�� ������ ���� ��Ű�� ����� �Ѵ�.
 */

public class RandomDemo {
	public static void main(String[] args) {
		int com = (int)(Math.random()*5)+1;
		/*
		 	�� �������� 5�� ����Ʈ(�ִ�) ���̰� 1�� begin(����)���̴�
		 	���� ������ 1���� 5������ ������ �߻�(��������)��Ű�� �����̴�.
		 */
		int myVal;
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while(true){
			i++;
			System.out.println("1���� 5������ ���ڸ��߱� �Դϴ�.");
			System.out.println("����� "+i+"��° �õ��մϴ�.");
			myVal = scanner.nextInt();
			if(myVal == com){
				System.out.println("��ǻ�Ͱ� �߻��� ����:"+com);
				System.out.println("�����Դϴ�.");
				break;
			}
			if(i==3){
				System.out.println("�����Դϴ�.");
				break;
			}
		}
	}
}
