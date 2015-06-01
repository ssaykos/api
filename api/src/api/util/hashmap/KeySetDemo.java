package api.util.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import java.util.*;

/*
 	 주소를 포괄적으로 넣는것과 세부적으로 넣는 차이 이다.
 */

public class KeySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 		map의 값을 입력하는 경우 = > 1가지만 존재..
		 		
		 */
		map.put("김연아", new Integer(98));
		map.put("아사다 마오", new Integer(66));
		map.put("소트나 포바", new Integer(10));
		
		/*
		 	GoF 의 디자인 패턴중에서 Iterator패턴이라고 불리우는 map에서 값을 추출하는 정규화된 패턴
		 	
		 	맵에서 키값 벨류값의 맵핑 현황을 전부 출력 할 때는 entrySet()사용
		 	맵에서 키값만 출력할 경우 keySet()사용..
		 	단, 어느경우든지 Set사용
		 	이유는 컬랙션에서 인터페이스는 Set, List , Map 이 세가지가 대표적..
		 	Set과 Map은 인덱스 값이 없어서 상호보안이 잘되고 Set은 중복값 제거 기능이 있어서 
		 	Map에서 키 값으로 중복이 없어야 하는 부분과도 일치해 Set을 통해 키 값, 혹은 키 +벨류 값을 출력하는데 쓰인다.
		 	참고로 맵은 Iterator가 없어서 Set의 Iterator를 사용 하기 위함이다.
		 */

		/*
		 	Map 에서 값을 출력하는 경우는 3가지 ..  /1
		 	1. Key+ Velue 형태 인 경우
		 	2. entrySet()+ Iterator 패턴 사용 //Iterator는 제임스 고슨이 만든게 아니다..
		 	
		 */
		Set set = map.entrySet();//객체에게 기능을 추가. 맵에는 이터레이터의 기능이 없어서 이터레이터 기능이 있는 셋에 넘기고..
		Iterator it = set.iterator();//이터레이터 에 다시 셋을 넘겨서..
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();//Entry=요소
			System.out.println("참가자 :"+e.getKey()+"점수"+e.getValue());
		}
		
		/*
	 	Map 에서 값을 출력하는 경우는 3가지 .. /2
	 	1. Key 형태 인 경우
	 	2. keySet()사용 
		 */
		set= map.keySet();
		System.out.println("참가자 명단 :"+set);
		//collection 예시 이클립스 제안중에서 java.util.Collection
		
		
		/*
	 	Map 에서 값을 출력하는 경우는 3가지 .. /3
	 	1. Velue 형태 인 경우
	 	2. Collection 사용
		 */
		Collection value = map.values();
		it = value.iterator();
		int total=0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total +=i.intValue();
		}
		System.out.println("총점:"+total);
		System.out.println("평균:"+total/set.size());
		System.out.println("1등:"+Collections.max(value));
		System.out.println("꼴지:"+Collections.min(value));
	}
}
