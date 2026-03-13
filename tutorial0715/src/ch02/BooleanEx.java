package ch02;

import java.util.Scanner;

public class BooleanEx {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("키보드로 숫자하나를 입력하세요 inputData");
		int inputData=sc.nextInt();//키보드로 입력받은 숫자가 inputData에 저장됨
		System.out.println("cnt값을 입력하세요 cnt");
		boolean a=false;
		int iterator=sc.nextInt();//여기서 입력하는 만큼 반복이 되어 cnt값이 변경되겠죠?
		System.out.println("inputData:"+inputData+",iterator=>"+iterator);
		int cnt=0;
		for(int i=0;i<iterator;i++)       cnt++;
		
		if(cnt>inputData) a=true;
		else a=false;
		System.out.println(a);
	}

}
