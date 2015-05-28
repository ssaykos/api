package api.lang.wrapper;
/*
 	JDK1.5(자바버전5)부터 도입된 오토박싱(autoboxing)기능으로
 	반환 값이 기본형일경우와 wrapper class이면..
 	서로차이없다.
 	그래서 parseInt()와 valueOf()가 차이없다.
 */

public class ParseIntDemo {
	public static void main(String[] args) {
		//리터럴 값을 기본형으로 캐스팅시 변환방법
		//즉 string =>int
		int num1=Integer.parseInt("200");
		int num2=Integer.parseInt("200");
		int result=num1+num2;
		System.out.println(result);
		//기본형을 참조형으로 형변환 하는 경우 (캐스팅 생략가능)
		Integer num3=result;
		System.out.println("기본형을 참조형으로 형변환한 결과 : "+num3);
		int num4 = 2+num3;
		System.out.println("참조형과 기본형간의 연산 비교:"+num4);
		int num5=Integer.parseInt("Hello");
		/*
		 * num5는 at java.lang.NumberFormatException.forInputString이발생한다.
		 * 이경우라면 문자값을 숫자형으로 형변환 시도햇는지 여부를 고민하고 디버깅해야 한다.
		 */
		System.out.println(num5);
	}
}
