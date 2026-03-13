package ch02_1;

import java.util.Scanner;

public class PrintfEx71 {
	public static double calcArea(int a) {
		return 3.12159 *a*a;
	}
	public static double calcDulle(int a) {
		return 2*3.141592*a;//2 phi r
	}

	public static void main(String[] args) {
		int value=123;
		System.out.printf("%d원",value);//d=decimal(10진수)
		System.out.println();
		System.out.printf("6d원",value);//6개의 공간확보후 앞에서부터
		System.out.println();
		System.out.printf("%-6d원",value);//6개의 공간 확보후 뒤에서부터
		System.out.println();
		System.out.printf("%06d원",value);//000을 빈공간에 채우기
//문1)키보드로 입력 받아서 원의 넓이를 구하세요
		Scanner sc=new Scanner(System.in);
		
		double area=calcArea(sc.nextInt());
		System.out.println();
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f",10,area);
		System.out.println();
		String name="홍길동";
		String job="도적";
		System.out.printf("%6d| %-10s|%10s\n",1,name,job);
	}

}
