package c;

public class Phone {
	//public<protected<dafault(같은 패키지내에서)>private(같은 클래스)
	protected String model;//다른 패키지라도 상속하는 곳에서는 사용가능
	protected String color;
	
	String getModel() {return this.model;}
	String getColor() {return this.color;}
	void setModel(String model) {this.model=model;}
	void setColor(String color) {this.color=color;}
	
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sengVoice(String message) {
		System.out.println("자기:"+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방:"+message);
	}
	void hangUp(String message) {
		System.out.println("전화를 끊습니다");
	}
}
