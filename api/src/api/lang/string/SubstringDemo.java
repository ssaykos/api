package api.lang.string;
/*
 	java.lang.string에 있는 substring()메소드는 시작위치(begin) 부터 끝위치(end)범위 문자열 리턴
 	begin <=x<end
 */
public class SubstringDemo {
	public static void main(String[] args) {
		System.out.println("파라미터가 한개일때 :"+"Hello Java".substring(6));
		//0부터 시작하고 공백도 자리를 차지한다.
		System.out.println("파라미터가 두개일때 :"+"Hello Java".substring(6, 8));
		
	}
}
