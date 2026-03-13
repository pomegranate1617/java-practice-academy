package ch02_1;

import java.util.Scanner;

public class TaxiTest {
	

	public static void main(String[] args) {
		Taxi taxi=new Taxi();
		Scanner sc=new Scanner(System.in);
		int menu=0;
		System.out.println("(1)더하기,(2)빼기,(3)곱하기");
		menu=sc.nextInt();
		
		int result=0;
		if(menu==1) {
			System.out.println("첫번째값을 입력해주세요=>");
			int first=sc.nextInt();
			System.out.println("두번째값을 입력해주세요=>");
			int second=sc.nextInt();
			result=taxi.add(first, second);
		}
		
		else if(menu==2) {
			System.out.println("첫번째값을 입력해주세요=>");
			int first=sc.nextInt();
			System.out.println("두번째값을 입력해주세요=>");
			int second=sc.nextInt();
			result=taxi.minus(first, second);
		}
		
		else if(menu==3) {
			System.out.println("첫번째값을 입력해주세요=>");
			int first=sc.nextInt();
			System.out.println("두번째값을 입력해주세요=>");
			int second=sc.nextInt();
			result=taxi.mul(first, second);
		}
		
		else {System.out.println("잘못입력하였습니다");
		}
		System.out.println(result);
		
	}
		
}
