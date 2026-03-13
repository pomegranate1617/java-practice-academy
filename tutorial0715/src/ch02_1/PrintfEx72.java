package ch02_1;

import java.util.Scanner;

public class PrintfEx72 {
	public static double calcArea(int a) {
		return 3.12159 *a*a;
	}
	public static double calcDulle(int a) {
		return 2*3.141592*a;//2 phi r
	}
	public static int calcAreaRectanguLar(int a) {
		return a*a;//2 phi r
	}
	public static void main(String[] args) {
		//문1)키보드로 입력 받아서 원의 넓이를 구하세요

		Scanner sc=new Scanner(System.in);
		System.out.println("원의 면적:1),원의 둘레:2),정사각형의 면적:3)");
		int input =sc.nextInt();
		double area=0.0;
		int rectArea=0;
		if(input==1) {
			System.out.println("반지름 입력");
			int data=sc.nextInt();
			area=calcArea(data);
			System.out.printf("반지름이 %d인 원의 넓이:%10.2f",data,area);
			
		}
		if(input==2) {
			System.out.println("반지름 입력");
			int data=sc.nextInt();
			area=calcArea(data);
			System.out.printf("반지름이 %d인 원의 넓이:%10.2f",data,area);
			
		}
		else if(input==3) {
			System.out.println("변의 길이 입력");
			int data=sc.nextInt();
			rectArea=calcAreaRectanguLar(data);
			System.out.printf("변의 길이가 %d인 정사각형의 넓이:%10d",data,rectArea);
			
		}
		else {
			System.out.println("반지름 입력");
			int data=sc.nextInt();
			rectArea=calcAreaRectanguLar(data);
			System.out.printf("반지름이 %d인 원의 둘레:%10.2f",data,area);
		}
		
		
	}
}
