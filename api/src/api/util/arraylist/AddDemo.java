package api.util.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import java.util.Iterator;;
/*
 	java.util.ArrayList의 메소드만
 	add() 는 Vector와 동일하당.
 */

public class AddDemo {
	public static void main(String[] args) {
		/*
		 	벡터는 내부적으로 스트링을 사용
		 	속도는 느리고 동기화를 지원한다.
		 	어레이리스트는 내부적으로 스트링 버퍼를 사용한다.
		 	동기화 지원안함.
		 */
		ArrayList<String> list =new ArrayList<String>();
		//항목추가
		list.add("서울");
		list.add("부산");
		list.add("대구");
		
		//출력 1. iterator() 이용
		
		/*
		 	iterator 객체를 생성하면 이클립스는 제안에 3가지 선택사항을 준다.
		 	그중에 두번째 with iterator를 선택한다.
		 
		 */
		
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			//printf를 사용한다
			System.out.printf("%s", it1.next());
			//위의 예문에서 %s는 스트링값을 의미.
			//뒤의 값은 %s의 밸류..
		}
		System.out.println();
		
		//출력2 list. listInterator() 이용
		ListIterator<String> it2 = list.listIterator();
		while (it2.hasNext()) {
			System.out.printf("%s",it2.next());
		}
		System.out.println();
		
		//출력3 .previos()이용
		while (it2.hasPrevious()) {
			System.out.printf("%s",it2.previous());
			//위의 메소드는 listIterator에서만 사용가능
		}
		//전체 요소를 한번에 입력
		//List 인터페이스는 java.util이다
		/*
		 	확장포문 
		 	콜랙션은 인덱스에 대한 조건이 굳이 주어지지 않는 출력형태가 많기 때문에 
		 	확장포문이 즐겨 사용된다.
		 */
		List<String> list3 = new ArrayList<String>();
		//인터페이스는 <제네릭> 참조변수명 = new 구현한 객체 <제네릭>();
		
		list3.addAll(list);
		
		for (String s : list3) {
			System.out.printf("%s",s);
		}
		System.out.println();
		
		list3.add("광주");
		list3.add("인천");
		list3.add("대전");
		
		Iterator <String> it3 = list3.iterator();
		String str;
		while (it3.hasNext()) {
			str= it3.next();
			if(str.startsWith("대")){
				System.out.printf("%s",str);
			}
		}
		System.out.println();
		list3.add("인천");
		list3.add("인천");
		list3.add("인천");
		
		Iterator<String> it4= list3.iterator();
		while (it4.hasNext()) {
			System.out.printf("%s",it4.next());			
		}
		System.out.println();
	}
	
}
