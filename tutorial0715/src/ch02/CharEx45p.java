package ch02;

public class CharEx45p {

	public static void main(String[] args) {
		char c1='A';//1byte
		char c2=65;//ascii코드 값
		char c3='가';
		char c4=44032;//유니코드
		char[] chars= {'A','B','C','D','E','a','b','c','d','e','z','?',':'};
	
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		for(int i=0;i<20;i++) {
			System.out.println(c1+i);
		}
		System.out.println("=====문자배열, 문자열이 아니고");
		for(int i=0;i<chars.length;i++)System.out.println((int)chars[i]);
		System.out.println("========ascii코드 값이 68인 문자 하나를 찾기");
		for(int i=0;i<chars.length;i++) {
			if((int)chars[i]==97)System.out.println(chars[i]);
		}
		//기본자료형,char,byte,int,float,double
		//참조자료형 대문자로 시작하는 클래스 String,
		
		
		

	}

}
