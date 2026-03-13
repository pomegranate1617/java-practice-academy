package c;

public class Car {
	private int price;
	private String name;//멤버변수(속성/arribute)
	//멤버변수는 데이터를 감춰서 다른 곳에서 함부로 수정할 수 없도록 해야 함
	
	
	//접근제한자
	//private(클래스 내에서만 접금)
	//<default(같은 패키지 내에서/아무키워드 없으면)<protected (다른 패키지라도 상속한 곳에서는 접근가능)<public(어디에서
	//멤버 변수에 값을 쓰려면(저장) setter를 통해서 접근한다
	//setter는 member변수의 가장 앞의 문자를 대문자로 변경하고 set을 붙인다
	//setter는 멤버변수값을 파라미터로 받은 값으로 저장하므로 반환할 필요가 없다 그래서 void를 붙인다
	//getter를 어디에선가 멤버변수의 값을 읽기위해 사용하는 거라서 그 사용하는 곳의 멤버변수 값을 전달해야 하므로
	//return이필요하다, 그러나 파라미터는 필요없다
	//getter에서 this를 안 붙여도 자동으로 붙는다
	//여기의 this는 실제로 우리가 객체를 생성하면 그 생성된 객체의 주소가 된다
	public int getPrice() {return this.price;}//default
	String getName() {return this.name;}
	
	void setPrice(int price) {this.price=price;}
	void setName(String name) {this.name=name;}
	Car(){
		this(5);//다른 생성자 호출
		System.out.println("기본 생성자 호출");
	}
	
	
	Car(int a){
		
		this.price=a;
		this.name="홍길동";
	
	}
	
	Car(String a){
		this.name=a;
		
	}
	Car(int a,String b){
		this.name=a+b;
		
	}
	Car(int a,float b,String c){
		
		this.name=a+b+c;
		this.price=c.length();
		
		
	}
	
	
}

