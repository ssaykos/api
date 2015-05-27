package api.lang.string;
/*
 	java.lang.string 메소드
 	replace("OLD","NEW") : String 문자열에서 "OLD"글자를 "NEW"글자로 대처한다.
 	만약 대체하는 글자가 복수이면 replaceAll()메소드를 사용한다.
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		System.out.println("A B C D : A B C D".replaceAll(" C D", " E F"));
		//replaceAll한문장에 복수로 겹치는 문자열을 한번에 바꿀때 쓰는 메소드
	}
}
