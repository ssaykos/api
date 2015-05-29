package api.util.hashset;

import java.util.HashSet;
import java.util.Set;

//		java.util.HashSet;
//add()는 벡터처럼 요소의 추가 기능을 한다
/*
 	 Set은 객체를 추가 할 때 HashSet에 이미 객체라면 중복으로 간주하고 저장 하지 않으며 false를 반환한다.
 	 Collection 의 대표적인것은 list / set / map / tree가 있으며..
 	 list = 정렬 특화 ex> sort /index  //add로 추가
 	 set = 중복제거 그리고 랜덤의 성격을 지닌다. //add로 추가
 	 tree = java 에서 그다지 안쓰고 jsp 에서 쓴다..
 	 map =//put로 추가 정렬의 기능을 위해 키값이 있다.//검색속도가 빠르다.
 */
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = { "1",new Integer(2),"2","3","3","3","4"};
		// 이클립스의 제안중 java.util.Set추가
		Set set= new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println("저장요소 출력"+set);
		/*
		 * 	저장요소 출력[3, 2, 2, 1, 4]
		 * 	위의 콘솔값으로 보아 new Integer(2) 와 "2"는 중복값으로 
		 * 	간주하지 않는다는 것을 알 수 있다.
		 */
	}
}
