package api.util.hashmap;

import java.util.Scanner;


public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ��� -> ");
		String id = scanner.next();
		System.out.println(" ��й�ȣ �� �Է��ϼ��� ->");
		String password = scanner.next();
		System.out.println("�̸��� �Է��ϼ��� - >");
		String name = scanner.next();
		System.out.println("���̸� �Է��ϼ���->");
		int age = scanner.nextInt();
		System.out.println("�ּҸ� �Է��ϼ��� - >");
		String addr= scanner.next();
		
		//��ü�� ���� �ϼ�
		//��ü�� �����ϴ� ����
		MemberService service = new MemberServiceImpl();
		id = "hong";
		password = "pass";
		name = "ȫ�浿";
		age=20;
		addr="����� ��õ��";
		service.join(id, password, name, age, addr);
		
		System.out.println(" ȸ�� ������ �Ǿ����ϴ�.");
		System.out.println("�α����� ���ּ���.");
		System.out.println("ID�� �Է����ּ���");
		id = scanner.next();
		System.out.println("��й�ȣ�� �Է����ּ���");
		password = scanner.next();
		service.login(id, password);
		
	}
}
