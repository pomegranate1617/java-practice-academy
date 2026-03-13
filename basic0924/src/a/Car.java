package a;

public class Car {
	private int price;
	private String color;
	
	int getPrice() {return this.price;}
	String getColor() {return this.color;}
	
	void setPrice() {this.price=price;}
	void setColor() {this.color=color;}
	
	public Car(int a){
		System.out.println(" 기본 생성자에서 호출되요1.정수값을 받아요"+a);
	}
	public Car() {
		this(7);
		System.out.println("기본생성자 호출2");
	}
	public Car(int a,String b) {
		this.price=a;
		this.color=b;
	}
	//문1)메서드 생성
	//walk
	//기능은 숫자 하나를 받아서 "사랑"문자열을 그 숫자만큼
	//반복하여 결합한 결과를 반환
	String walk(int a){
		String v="";
		for(int i=0;i<a;i++) {
			v+="사랑";
		}
		return v;
	}
	//문2)메서드 생성
	//walk
	//기능은 문자열을 받아서 문자열의 길이가 짝수이면true를 반환하고
	//그렇지 않으면 홀수 반환
	boolean walk(String a){
		boolean v=true;
		if(a.length()%2==0)v=true;
		else  v=false;
		return v;
	}
	
}
	

	
	
	


