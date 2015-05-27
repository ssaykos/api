package api.lang.object;
/*
 	java.lang.object의 메소드
 	equals() : 값이 같은지 여부 체크
 	 = 인스턴스 변수의 해시코드값(힙주소값)을 비교하는 메소드
 */

public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		//reselt 가 지역변수 이기 때문에 반드시 초기화 해야 한다. // 맴변은 (필드에 있는 변수는) 초기화 하지 않아도 됨.
		String result = "";
//		if (condition) {
//			
//		}else{
//			
//		}// 이형태는 하드코딩으로 익숙해져야 한다.
		if (t1.equals(t2)) {
			System.out.println("t1과 t2의 값이 같다.");
		}else{
			System.out.println("t1과 t2의 값이 다르다.");
		}
		// 삼항 연산자는 if else를 대체 하는 구문이다.
		// 구성은 (조건식) ? "참 인 경우" : "거짓 인 경우";
		result = (t1.equals(t2)) ? "t1과 t2의 값이 같다." : "t1과 t2의 값이 다르다.";
		System.out.println("생성자를 통해 생성된 참조변수 값의 비교 : "+result);
		t2= t1;
		result =(t1.equals(t2)) ? "t1과 t2의 값이 같다." : "t1과 t2의 값이 다르다.";
		System.out.println("참조 변수 사이의 할당된 연산 이후 값의 비교 : "+result);
	}
}

class Temp{
	int num; // 필드에 있는 인스턴스 변수는 초기화 필요 없심 // 필드는 클래스 내부에만 이야기 하지 메서드 내부는 필드가 아니다.
	
	public Temp(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		/*
		 	 상기 형태는 힙에 저장된 인스턴스 변수에 
		 	 콜 스택에 있는 넘 지역변수에 할당된 값을 
		 	 인스턴스에 넘겨주고 로컬 (지역) 변수 자신은 
		 	 사라지는 시나리오를 진행 한다. 
		 */
	}
}