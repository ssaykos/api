package api.util.vector;

import java.util.Vector;

/*
 	java.util.vector메소드인
 	addElement()는 기본적으로 add()와 동일하다.
 */

public class AddElementDamo {
	public static void main(String[] args) {
		String[] heros={"iron","thor","hulk","hawk"};
		Vector<String> avengers = new Vector<String>();
		//벡터에 배열의 요소를 저장 
		for (int i = 0; i < heros.length; i++) {
			avengers.addElement(heros[i]);
		}
		//토르가 존재 하는 지 체크
		String thor="thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("토르는"+idx+"번째에 있습니다");
		}else{
			System.out.println("토르 없다~");
		}

		
		/*
		 	첫번째 맴버 요소 삭제
		 	벡터와 인덱스도 0 부터 시작한다. 0이 첫번째요소
		 */
		System.out.println(avengers);
		avengers.removeElementAt(0);
		System.out.println("삭제후 맴버 위치 인덱스 변화");
		System.out.println(avengers);
		for (int i = 0; i < avengers.size(); i++) {
			System.out.println("avenger의 "+(i+1)+"번째맴버는"+avengers.elementAt(i));
		}

	}
}
