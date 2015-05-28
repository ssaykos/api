package api.lang.string;
/*
 	java.lang.string 의 메소드중
 	toUpperCase()는 해당 문자열을 전부 대문자로 변환
 	toLowerCase()는 해당 문자열을 전부 소문자로 변환
 	valueOf()는 다른 타입을 모두 문자열로 변환
 */

public class ValueOf {
	public static void main(String[] args) {
		String str1 = "Hello Java";
		String msg;
		System.out.println("테스트 문장 : "+str1);
		msg=str1.toUpperCase();
		System.out.println(msg);
		msg=str1.toLowerCase();
		System.out.println(msg);
		/*
		 	예제의 valueOf()의 파라미터값은 int형이다.
		 	Integer.parseInt()를 하지 않고도
		 	String의 스태틱 메소드인 valueOf()
		 	를 호출하면 바로 문자열로 변환된다.
		 */
		msg= String.valueOf(str1.length());
		System.out.println("valueOf의 결과 : "+msg);
	}
}
