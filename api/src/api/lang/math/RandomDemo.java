package api.lang.math;

import java.util.Scanner;

/*
 	java.lang.math 에 속한
 	ramdom()메소드는 난수를 생성 시키는 기능을 한다.
 */

public class RandomDemo {
	public static void main(String[] args) {
		int com = (int)(Math.random()*5)+1;
		/*
		 	의 예제에서 5는 리미트(최대) 값이고 1은 begin(시작)값이다
		 	따라서 예제는 1부터 5까지의 난수를 발생(랜덤으로)시키는 구문이다.
		 */
		int myVal;
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while(true){
			i++;
			System.out.println("1부터 5까지의 숫자맞추기 입니다.");
			System.out.println("현재는 "+i+"번째 시도합니다.");
			myVal = scanner.nextInt();
			if(myVal == com){
				System.out.println("컴퓨터가 발생한 숫자:"+com);
				System.out.println("정답입니다.");
				break;
			}
			if(i==3){
				System.out.println("실패입니다.");
				break;
			}
		}
	}
}
