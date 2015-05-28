package api.util.vector;

import java.util.Iterator;
import java.util.Vector;
/*
 	java.util.Vector 의 메소드인
 	add() 는 벡터에 값을 할당하는 기능을 한다.
 */

public class AddDemo {
	public static void main(String[] args) {
		String[] chatt = new String[3];
		String id="admin";
		int age=27;
		Boolean male = true;
		
		Vector<String> vec = new Vector<String>();
		String tom = new String ("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		//백터는 length()를 사용하지 않고 size()를 요소와 숫자를 표현하는데 사용
		//배열에서 for loop출력시 get(arr[i]) 하지만 백터는 vec.elementAt(i) 
		vec.add("리터럴 문자로 생성된 객체");
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.elementAt(i));
		}
		//for (String string : vec) {
			System.out.println(vec);
	//	}
//		for (Iterator iterator = vec.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//		}
		/*
		 	출력된 결과물 
		 	admin
			23
			false
			리터럴 문자로 생성된 객체
		 */
	}
}
