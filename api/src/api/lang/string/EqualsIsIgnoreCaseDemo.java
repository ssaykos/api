package api.lang.string;

public class EqualsIsIgnoreCaseDemo {
	public static void main(String[] args) {
		System.out.println("Hello".equals("hello") ?  "true" : "false" );
		//비교대상의 대소문자 차이점까지 비교.
		System.out.println("Hello".equalsIgnoreCase("hello") ?  "true" : "false" );
		//비교대상의 대소문자 차이 무시
	}
}
