package a;

public class Test01 {

	public static void main(String[] args) {
		String a="사랑";
		int b=5;
		//사랑5가 가 나오도록 하는데
		//sysout사용하지 마시고 변수 선언 후 저장후 출력;
		String c=a+b;
		System.out.println(c);
		float f=2.3f;
		double d=34.3;
		int g=(int)f;//down casting은 강제로
		f=g;//up casting은 자동으로 일어난다
		//나중에 클래스 할 때 상속의 관계에서 매우 중요
		int cnt=0;
		cnt+=2;
		cnt+=3;
		cnt+=4;
		cnt+=5;
		cnt+=6;
		cnt+=7;
		//반복문으로 변경
		for(int i=0;i<6;i++) {
			cnt+=(i+2);
		}
		
		
		
		

	}

}
