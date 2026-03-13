package ch02_2;

import java.util.Scanner;

public class Test01 {
	//아래의 main함수에서 세번째 데이터를 받을 수 있도록 수정하고
	//기능은 a가b의 배수이면 true일것이 세번째 데이터와 같은지 확인하여
	//같으면 3을 반환하고 그렇지 않으면 7을 반환함
	//예를들어 a=10,b=2이면 a가 b의 배수이므로 true일것이고 세번째 전달되는 값이 true이면
	//3을 반환함
	//main에서 false를 세번째 인자로 전달하면 같지 않으므로 7을 반환함
	//main함수의 반환되는 값의 변수를 변경해야함
	
	public static int total(int a,int b,boolean c) {
		boolean isTimes=a%b==0;
		int result=0;
		if(isTimes==c)  result=3;
		else result=7;
		return result;
	}
		
		//여기 안을 잘 작성해야 합니다
	
	public static void main(String[] args) {
		Scanner u= new Scanner(System.in);
		
		
		
		int u1=u.nextInt();
		int u2=u.nextInt();
		
		
		int rr=total(u1,u2,true);//total(u1,u2,false);로도 호출가능합니다.
		System.out.println(rr);
		int uu=total(u1,u2,false);//total(u1,u2,false);로도 호출
		System.out.println(uu);
		}
		
		//문1)
		// u1과u2의 값을 total 함수에 전달하여 u1이u2의 배수이면 true를 반환하고
		//그렇지 않으면 false를 반환함
		//그 결과를 여기에서 출력함

}


