package api.lang.object;

//import java.lang.object; 선언 하지 않아도 디폴트로 임폴트 되어있음.
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("스페이스",7);
		Card card2 = new Card("하트",2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		/*
		 	 java.lang.object 의 tostring 은 해시코드 리턴값(주소)을 리턴하므로 오버라이드 해서 쓴다
		 */
		
	}
}
//한 java파일에 두개 이상의 클래스가 있어도 되지만 public은 하나 여야만 한다..
class Card{
	String kind;
	int number;
	
	public Card() {
		// TODO Auto-generated constructor stub
		this("",0);
	}
	/*
	 	생성자 오버로딩을 쉽게 하는 법.
	 	컨트롤+스페이스 로  디폴트 생성자 를 생성시킨후
	 	생성자 호출 예약어만 this(파라미터); 라고 호출하면 자동생성된다.
	 	또한 디폴트 생성자를 호출하더라도 파라미터가 있는 생성자 까지 호출되므로
	 	생성자 파라미터 내용까지 알필요없이 코딩 간편해진다.
	 */
	/*
	 	게터 세터는 필요시만 만든다.
	 */

	public Card(String string, int i) {
		// TODO Auto-generated constructor stub
		this.kind = string;
		this.number = i;
	}
	//컨트롤+스페이스 에서 스페이스에서 만들면 하드코딩양이 늘어난다. // no push key Ctrl+Space 
	//알트+쉬프트 + s를 한후..제너레이터 투스트링을 한당..//ALT+Shift+s >ge

	@Override
	public String toString() {
		return "Card [무늬=" + kind + ", 숫자=" + number + "]";
	}
	
	
}