package a;

public class Phone {
	//public<protected<dafault(같은 패키지내에서)>private(같은 클래스)
	protected String model;//다른 패키지라도 상속하는 곳에서는 사용가능
	protected String color;
	
	Phone(){
		System.out.println("1)부모인 기본생성자 호출~~~");
	}
	
	
	Phone(String color){this.color=color;}
	String getModel() {return this.model;}
	String getColor() {return this.color;}
	void setModel(String model) {this.model=model;}
	void setColor(String color) {this.color=color;}
	//메서드 정의
	void call(){
		System.out.println("아날로드 폰으로 전환한다");
	}
}
