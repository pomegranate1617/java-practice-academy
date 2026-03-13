package ch02;

public class integerLliterralEx {

	public static void main(String[] args) {
		//p43
		int var1=0b1011;//0b 2진수
		int var2=0206;//8진수
		int var3=365;//10진수
		int var4=0x83;//16진수
		//System.out.println(var1==1*pow(2,3)+1*2+1);
		//System.out.println(var2==1*Math.pow(2,3)+1*2+1));
		//System.out.println(var2==2*pow(8,2)+6);
		System.out.println(var2==8*16+3);
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		int var7=0b1111100111100;;//를 16진수로 표현하고 결과를 출력하세요
		System.out.println(var7=0x1f3c);
		//System.out.println(var7=1*pow(16,3)+115*pow(16,2)+3*16+12);
		

	}

}
