package ch04;

import java.util.Scanner;

public class SwitchEx {

		public static int sum(int a, int b) {
			return a+b;
		}
		
		public static int minus(int a, int b) {
			return a-b;
		}
		
		public static int mul(int a, int b) {
			return a*b;
		}
		
		public static int mod(int a, int b) {
			return a%b;
		}
		
		public static void  main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("1)더하기,2)빼기 ,3)곱하기,2)나머지");
			int input=sc.nextInt();
			System.out.println("첫번째 숫자==>");
			int first=sc.nextInt();
			System.out.println("두번째 숫자==>");
			int second=sc.nextInt();
			int result=0;
			switch(input){	
			
			
			case 1:			
				result=sum(first,second);
				System.out.println(result);
				break;
			case 2:			
				result=minus(first,second);
				System.out.println(result);
				break;
			case 3:			
				result=mul(first,second);
				System.out.println(result);
				break;	
			case 4:			
				result=mod(first,second);
				System.out.println(result);
				break;
			default:
				System.out.println("잘못입력하셨어요");
				break;
			}
	}

}
