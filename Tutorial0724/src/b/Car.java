package b;

public class Car {
	private int price;
	private float data;
	private String nunu;
	
	
	Car(int a){
		this(a,"홍길동");//다른 생성자 호출
		System.out.println("2)정수를 하나를 받은 생성자 호출~~~~");
		this.price=a;
	}//생성자 오버로딩
	Car(double a,String b){
		System.out.println("1)실수 하나와 문자열 하나를 받는 생성자 호출");
		this.data=(float)a;
		this.nunu=b;
		
	}
	Car(){}//생성자 오버로딩
	Car(double a,String b,Float c){
		this.data=(float)a;
		this.nunu=b;
		this.price=(int)a+(int)b.length();
		
	}
	Car(String a,double b){
		this.nunu=a+b;
	}
	Car(String a,double b,float c){
		this.nunu=a+b+c;
		
	}
	

}
