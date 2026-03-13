package b;

public class Test04 {
	
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
		String u ="";//문자열을 저장하기 위해 u변수를 문자열로 선안과 동시에""를 저장
		for(int i=2;i<10;i++) {//for문을 실행하면서 처음 i값이2이고 이때gugu함수를 호출시 i값이 2인것을 gugu함수에 전달
			
		    u=gugu(i);//u에 저장되는 값을 gugu함수에 2가 전달되었기때문에 2단의 문자열 하나가 반환되어 u에wjwkdehlrh
		    
		    System.out.println("============"+i+"단");
		    System.out.println(u); //그 저장된결과를 출력
		    
		   
		}
		//다시 i가3으로 변경되어gugu함수에 3이 전달되고 gugu함수에서 3단의 문자열이 반환되어 3단이 출력되고
		//계속 반독되어 i가10이되면 반복문 종료
	}

}
