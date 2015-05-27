package api.lang.string;
/*
 	java.lang.string  에 속한 메소드
 	charAt(): 지정된 위치에 있는 문자를 리턴함. index는 0 부터 시작
 	indexOf() : 주어진 문자가 존재하는 지 확인 하여 위치를 알려줌 없으면 - 1 을 반환
 */

public class CharAtDemo {
	public static void main(String[] args) {
		String ssn="900101-1234567";
		/*
		 	index는 0부터 시작하므로 구별하는 1값은 7번째에 위치
		 */
		/*
		 	indexOf() 는 파라미터로 주어진 String 값의 위치 값을 리턴한다.
		 	"-" 의 다음 값이 남녀를 구분하는 값이므로 +1을 주엇다.
		 */
		//char isMan = ssn.charAt(7);
		char isMan = ssn.charAt(ssn.indexOf("-")+1);
		switch (isMan) {
		case '1':case '3': System.out.println("남성"); break;

		case '2':case '4': System.out.println("여성"); break;
			
		default: System.out.println("잘못된 입력값입니다"); break;
		}
	}
}
