package api.lang.string;
/*
 	java.lang.string 예시
 	split("구분자")메소드
 	구분자를 기준으로 String 문자열을 분리하여
 	배열등(ArrayList 포함) 에 나눠 담는 기능.
 	뒤에 숫자가 붙으면 단어사이 공백을 주고
 	없으면 디폴트로 다 공백을 준다.
 */
import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("\t"+fruits[i]);
		}
		System.out.println();
		System.out.println("split() 출력결과:");
		/*
		 	split(String,int)
		 	int 크기만큼 공백을 준다.
		 	없으면 디폴트로 전체 공백
		 */
		String[] fruits1 =  fruit.split(",",1);
		System.out.println(Arrays.toString(fruits1));
		String[] fruits2 =  fruit.split(",",2);
		System.out.println(Arrays.toString(fruits2));
		String[] fruits3 =  fruit.split(",",3);
		System.out.println(Arrays.toString(fruits3));
		String[] fruits4 =  fruit.split(",",4);
		System.out.println(Arrays.toString(fruits4));
	}
}
