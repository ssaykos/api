package api.lang.object;
/*중요*/
public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		// 가입 했는데 했는지 모르고 또 가입 할려는 경우.
		String result;// 스태틱 메소드 내부라서 지역변수가 스태틱화 되었다.
		result = (p1==p2) ? "p1과 p2는 같은 사람":"p1과 p2는 다른 사람";
		System.out.println("(p1==p2)에 대한 결과값 : "+result);
		
		result = (p1.equals(p2)) ? "p1과 p2는 같은 사람":"p1과 p2는 다른 사람";
		System.out.println("(p1.equals(p2))에 대한 결과값 : "+result);
		
	}
}
class Person{
	private String ssn; // 주민번호
	
	public Person(String ssn) {
		// TODO Auto-generated constructor stub
		this.ssn = ssn;
	}
	//ALT+SHIFT+ S
	//제너레이트 겟 셋

	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//ALT+SHIFT+ S
	//제너레이트 hashCode And equals 이퀼스만 하자

	@Override
	public boolean equals(Object obj) {
		/*
		 	Object 는 모든 데이터 타입을 의미하기 때문에
		 	반드시 주민번호를 갖고있는 Person 인지를 확인해야
		 	주민번호를 일치여부를 따질수 있기 때문에
		 	객체 캐스팅 연산자 instanceof를 사용한다.
		 	이러한 기능을 Valliodation 유효성 체크라고 한다.
		 */
		if (obj!=null&&obj  instanceof Person) {
			return ssn == ((Person)obj).ssn;
			
			//java.lang.Object  의 객체 캐스팅은
			//((객체타입)obj)..의 형태로 캐스팅이 이뤄진다.
		}else{
			return false;
		}
		
	}
	
}
