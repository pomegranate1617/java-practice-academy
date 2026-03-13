package ch04;

public class Q3 {

	public static void main(String[] args) {
		//문3)Q3파일 생성후
				String [] str= {"홍길동","김말자","그린","아카데미","노랑머리","호랑이"};
				//문자열의 길이가 홀수인것들의 문자열 결합한 하나의 문자열과 문자열의 길이가
				//짝수인것들만 결합한 하나의 문자열 두개의 문자열을 각각 구하기(일반반복문, enhanced for)
				String odd="";
				String even="";
				for(int i=0;i<str.length;i++) {
					if(str[i].length()%2==0) {
						even+=str[i];
						
					}
					else {
						odd+=str[i];
						
					}
				}
				System.out.println(even+","+odd);
				
				for(String i:str) {
					if(i.length()%2==0) {
						even+=i;
						
					}
					else {
						odd+=i;
						
					}
				}
				
				System.out.println(even+","+odd);
				
	
	
	
	}

}
