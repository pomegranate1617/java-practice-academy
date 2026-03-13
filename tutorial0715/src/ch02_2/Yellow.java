package ch02_2;

import java.util.Scanner;

public class Yellow {

	public static void main(String[] args) {

					
			Scanner sc= new Scanner(System.in);
			Taxi y=new Taxi();
			System.out.println("1)구구단 2)a의 b승 3)2개의 숫자비교");
			int input =sc.nextInt();
			if(input==1) {
				System.out.println("원하는 구구단의 숫자 입력");
				String r=y.gugu(sc.nextInt());
				System.out.println(r);
				
			}
			else if(input==2) {
				System.out.println("첫번째 숫자 입력");
				int first=sc.nextInt();
				System.out.println("두번째 숫자 입력");
				int second=sc.nextInt();
				int r=y.pow(first,second);
				System.out.println(r);
			}
			else if(input==3) {
				System.out.println("첫번째 숫자 입력");
				int first=sc.nextInt();
				System.out.println("두번째 숫자 입력");
				int second=sc.nextInt();
				boolean r=y.isGreaterThanAandB(first,second);
				System.out.println(r);
			}
			



}
}