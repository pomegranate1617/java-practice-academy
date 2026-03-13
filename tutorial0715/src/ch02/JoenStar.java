package ch02;

import java.util.Scanner;

public class JoenStar {
//	public static String gugu(int pp) {//함수 내에서 사용하는 변수를 지역변수(local variavles)
//		String r="";//지역변수(r,pp)
//		for(int i=1;i<10;i++) {
//			r+=times+"x"+i+"="+"="+(times*i)+"\n";
//			
//	}return r;

	public static void main(String[] args) {
		String r="";
		Scanner v=new Scanner(System.in);
				
		System.out.println("원하는 구구단의 숫자를 입력하세요=>");
		int times=v.nextInt();//키보드로 입력 받아서
		
		//gugu함수 호출시 키보드로 입력 받은 숫자를 전달하여
		//gugu합수에서는 전달받은 숫자를 기반으로 구구단 문자열을 반환함
		for(int i=1;i<10;i++) {
			r+=times+"x"+i+"="+"="+(times*i)+"\n";
		}
		
		System.out.println(r);
		
//		int a=4;
//		System.out.println("전스타"+"4"+"홍길동");
//		String r="";
//		int times=4;
//		for(int i=1;i<10;i++) {
//			r+=times+"x"+i+"="+""(times*i)+"\n";
//		}
//		System.out.println(r);
	}

}
