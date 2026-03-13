package a;

public class test01For {

	public static void main(String[] args) {
		String a="";
		
		for(int i =1;i<10;i++) a+=9+"x"+i+"="+ (9*i)+"\n";//+=은 하나의 연산자
		
		//문자열+문자열\문자열이다
		//+는 결합
		System.out.println(a);

	}

}
