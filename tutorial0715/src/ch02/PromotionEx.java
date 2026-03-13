package ch02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue=10;
		int intValue=byteValue;//데이터 타입이 다른데 저장가능(up casting)	
		int intValue2=(int)byteValue;//데이터 타입이 다른데 저장가능(up casting)
		//자동으로 형변환이 일어나요(형변화=>type casting)
		System.out.println("intValue=>"+intValue);
		System.out.println("intValue2=>"+intValue2);
		long longValue=34;
		int intValueR=(int)longValue;//타입이 큰것에서 작은것으로 강제로 형변환한다
		long longB=intValueR;//타입이 작은것에서 큰것으로 upcasting(자동)
		
		float f=3.4f;
		f=(float)4.5;//double을 float으로 down casting은 안된다 그래서 강제로 형변환해야 한다
		double d=4.5;
		d=2.7f;//upcasting은 자동으로 일어난다
	}

}
