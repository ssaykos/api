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
		/*
		 	위 문법은 자바 버전 jdk5 까지의 문법
		 	버전 5이후 replace()기능이 확대되어 replaceAll() 처럼
		 	복수의 글자에도 반응 하게 되었습니다.
		 	그렇다면 차이점이 없나? 는 아닙니다.
		 	정규직에 대한 기능이 있는지 없는지 여부에 따른 차이점이 있습니다.
		 */
		System.out.println("[1] A B C D : A B C D".replace(" C D", " E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll(" C D", " E F"));
		
		System.out.println("[3] Hello Java !!".replace("!", ""));
		System.out.println("[4] Hello Java !!".replaceAll(".!", ""));
		System.out.println("[5] Hello Java !!".replaceAll("..!", ""));
		/*
		 	.의 역활은 정규식에서 쓰이는데 맨 앞 한글자만 지정한다.
		 	즉 느낌표가 두개있는데 앞에 한녀석만 남기겠다는 의미이고 이기능은 replaceAll()에게만 있습니다.
		 	따라서 replace()보다는  정규식까지 처리기능한 replaceAll()을 권장
		 */
	}
}
