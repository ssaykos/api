package api.lang.string;
/*
 	java.lang.string
 	endwith(s) : s로 끝나는지 여부체크
 */

public class EndwithDemo {
	public static void main(String[] args) {
		System.out.println("Hello.txt".endsWith("txt")? "txt파일 입니다.": "txt파일 이 아닙니다.");
	}//확장자 검색할 시 많이쓰임 동영상 파일 , 이미지 파일 확인할때.
}
