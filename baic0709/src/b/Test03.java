package b;

public class Test03 {
	
	public static String gugu(int a) {//함수정의,함수명(gugu)
		//인자(argument(은 정수형 변수a로 선언
		String r="";//문자열을 저장하기 위해 r변수를 문자열로 선언과 동시에 ""를 저장
		for(int i=1;i<10;i++) r+=a+"x"+i+"="+(a*i)+"\n";
		//반복문을 이용하여 구구단 문자열 하나를 만들기 위해 사용하는데 호출하는 곳에서 전달되는 값을  a에 저장되고
		//그 저장된 값을 이용하여 구구단 문자열을 r에 저장
		return r;//생성된 구구단 문자열 하나를 변환
	}

	public static void main(String[] args) {
		
		
		int dan=3;//dan에 정수3을 저장
		
	    String u =gugu(dan);//gugu함수호출시 dan변수에 저장된3을 전달하면
	    //호출되는gugu함수에서 3을 받아서 3단 문자열을 반환하면 그 반환 된 문자열을 u변수에 저장
	    System.out.println(u); //u의 넣어 출력
		
		
	}

}
