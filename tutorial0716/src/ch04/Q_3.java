package ch04;

public class Q_3 {

	public static void main(String[] args) {
		//문3)Q3파일 생성후
		
		String [] str= {"홍길동","김말자","그린","아카데미","노랑머리","호랑이"};
		//문자열의 길이가 홀수인것들의 문자열 결합한 하나의 문자열과 문자열의 길이가
		//짝수인것들만 결합한 하나의 문자열 두개의 문자열을 각각 구하기(일반반복문, enhanced for)
		System.out.println(str[0].length());
		String even="";
		String odd="";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()%2==0) {
				even+=str[i];
				
			}else {
				odd+=str[i];
			}
		}
		System.out.println("짜ㅏㄱ수길이의 문자열 결합=>"+even);
		System.out.println("홀수길이의 문자열 결합=>"+odd);
		System.out.println("=====enhanced forans====");
		even="";
		odd="";
		for(String i:str) {//str은 container(여러개의 데이터가 저장되어 있어요)에요
			//container에서 하나씩 꺼내어 변수(i) 에 저장하고 사용해요
			if(i.length()%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		

	}

}
