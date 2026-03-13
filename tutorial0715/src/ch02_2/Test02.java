package ch02_2;


import java.util.Scanner;

public class Test02 {
	
		
		
//	잘못쓴코드	Scanner c=new Scanner(System.in);
//		System.out.println("키보드로 숫자하나를 입력하세요 inputData");
//		System.out.println("cnt값을 입력하세요 cnt");
//		boolean y=false;
//		int isGreaterThanAandB=sc.nextInt();
//		System.out.println("inputData:"+inputData+",iterator+>"+iterator);
//		int cnt=0;
//		for(int u=0;u<iterator;i++)
//			
//		if(cnt>inputData)a=true;
//		else a=false;
//		System.out.println(a);
	

	public static void main(String[] args) {
		//문1)메뉴( 1) 구구단 입력=>1개의 숫자를 입력으로 받아서 gugu함수 호출시 전달
		//2)a의 b승(3의4승) 3을 4번 곱하기=>2개의 숫자를 입력으로 받아서 pow함수에 전달
		//3)a가 b보다 큰가 작은가?=>2개의 숫자를 입력으로 받아서 isGreaterThanAandB함수에
		//a가b보다 크면 true반환하고 그렇지 않으면 false반환
		//전달하고 조건문을 사아ㅛㅇ하여 메뉴1,2,3 중 하나를 호출하고 반환되는 결과를 main함수에서 출력
		//
		Scanner sc= new Scanner(System.in);
		Taxi t=new Taxi();
		System.out.println("1)구구단 2)a의 b승 3)2개의 숫자비교");
		int input =sc.nextInt();
		if(input==1) {
			System.out.println("원하는 구구단의 숫자 입력");
			String r=t.gugu(sc.nextInt());
			System.out.println(r);
			
		}
		else if(input==2) {
			System.out.println("첫번째 숫자 입력");
			int first=sc.nextInt();
			
			System.out.println("두번째 숫자 입력");
			int second=sc.nextInt();
			int r=t.pow(first,second);
			System.out.println(r);
		}
		else if(input==3) {
			System.out.println("첫번째 숫자 입력");
			int first=sc.nextInt();
			
			System.out.println("두번째 숫자 입력");
			int second=sc.nextInt();
			int r=t.pow(first,second);
			System.out.println(r);
		}
		
	}

}
