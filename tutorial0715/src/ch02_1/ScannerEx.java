package ch02_1;

import java.net.MulticastSocket;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("x값 입력:");
		String strx=sc.nextLine();
		int x=Integer.parseInt(strx);
		
		System.out.println("y값 입력:");
		String stry=sc.nextLine();
		int y=Integer.parseInt(stry);
		
		int result =x+y;
		System.out.printf("x+y=%d",result);
		System.out.println();
		while(true) {
			System.out.println("입력 문자열=>");
			String data=sc.nextLine();
			if(data.equals("q"))break;//q를 누르면종료
			System.out.println("출력 문자열:"+data);
		}
		System.out.println("프로그램 종료");

	}

}
