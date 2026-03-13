package ch02;

import java.util.Scanner;

public class JoenStarAdvanced {
//static키워드는 객체 생성하지 않고 바로 호출 가능
	//일반적으로 클래스를 생성하고 그 클래스에 method를 추가하고 생성된 객체,메서드 명으로 후출함
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		Car car=new Car();
		System.out.println("원하는 구구단의 숫자를 입력하세요=>");
		int times=v.nextInt();//키보드를 입력받아서
		String uv=car.gugu(times);//gugu함수 호출시 키보드로 입력 받은 숫자를 전달하여
		//gugu함수에서는 전달 받은 수수자를 기반으로 구구단 문자열을 반환함
		System.out.println(uv);
		
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
