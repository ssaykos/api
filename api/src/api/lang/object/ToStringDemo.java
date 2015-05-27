package api.lang.object;

//import java.lang.object; ���� ���� �ʾƵ� ����Ʈ�� ����Ʈ �Ǿ�����.
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("�����̽�",7);
		Card card2 = new Card("��Ʈ",2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		/*
		 	 java.lang.object �� tostring �� �ؽ��ڵ� ���ϰ�(�ּ�)�� �����ϹǷ� �������̵� �ؼ� ����
		 */
		
	}
}
//�� java���Ͽ� �ΰ� �̻��� Ŭ������ �־ ������ public�� �ϳ� ���߸� �Ѵ�..
class Card{
	String kind;
	int number;
	
	public Card() {
		// TODO Auto-generated constructor stub
		this("",0);
	}
	/*
	 	������ �����ε��� ���� �ϴ� ��.
	 	��Ʈ��+�����̽� ��  ����Ʈ ������ �� ������Ų��
	 	������ ȣ�� ���� this(�Ķ����); ��� ȣ���ϸ� �ڵ������ȴ�.
	 	���� ����Ʈ �����ڸ� ȣ���ϴ��� �Ķ���Ͱ� �ִ� ������ ���� ȣ��ǹǷ�
	 	������ �Ķ���� ������� ���ʿ���� �ڵ� ����������.
	 */
	/*
	 	���� ���ʹ� �ʿ�ø� �����.
	 */

	public Card(String string, int i) {
		// TODO Auto-generated constructor stub
		this.kind = string;
		this.number = i;
	}
	//��Ʈ��+�����̽� ���� �����̽����� ����� �ϵ��ڵ����� �þ��. // no push key Ctrl+Space 
	//��Ʈ+����Ʈ + s�� ����..���ʷ����� ����Ʈ���� �Ѵ�..//ALT+Shift+s >ge

	@Override
	public String toString() {
		return "Card [����=" + kind + ", ����=" + number + "]";
	}
	
	
}