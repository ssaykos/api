package api.lang.string;
/*
 	java.lang.string 에 속한 메소드
 	두개의 문자열을 합친다.
 */
public class ComcatDemo {
	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "API 학습중..";
		String str3 = str1+str2;
		System.out.println("+연산자 사용 결과 : "+str3);
		
		//concat사용시
		String str4="concat()사용시 : 헬로우 ,";
		System.out.println(str4.concat("자바월드.."));
	}
}
