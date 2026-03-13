package ch04;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자하나 입력하세요");
		int score=sc.nextInt();
		//아래의 코드를 else를 추가하여 수정하세요
		//전체 집합에서 90보다 같거나 큰것과 그렇지 않은 것으로 분리가능
		//교집합(intersection)이 없어요
	
		
		
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
			}
		
		
		else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");
		}

	}

}
