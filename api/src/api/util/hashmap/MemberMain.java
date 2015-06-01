package api.util.hashmap;

import java.util.Scanner;


public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 -> ");
		String id = scanner.next();
		System.out.println(" 비밀번호 를 입력하세요 ->");
		String password = scanner.next();
		System.out.println("이름을 입력하세요 - >");
		String name = scanner.next();
		System.out.println("나이를 입력하세요->");
		int age = scanner.nextInt();
		System.out.println("주소를 입력하세요 - >");
		String addr= scanner.next();
		
		//객체를 생성 완성
		//객체를 생성하는 이유
		MemberService service = new MemberServiceImpl();
		id = "hong";
		password = "pass";
		name = "홍길동";
		age=20;
		addr="서울시 금천구";
		service.join(id, password, name, age, addr);
		
		System.out.println(" 회원 가입이 되었습니다.");
		System.out.println("로그인을 해주세요.");
		System.out.println("ID를 입력해주세요");
		id = scanner.next();
		System.out.println("비밀번호를 입력해주세요");
		password = scanner.next();
		service.login(id, password);
		
	}
}
