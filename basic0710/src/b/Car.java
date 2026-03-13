package b;

public class Car {//설계도면
	private int price;//멤버변수
	String name;
	//클래스는 설계도면이고
	//멤버변수(데이터)와 함수(메서드)의 꾸러미
	
	//private키워드는 이 클래스에서만 접근
	
	//외부에서 접근할수있도록 뭔가를 해야한다
	
	//멤버변수(데이터)에 값을 쓸려면
	//stter통해서
	void setPrice(int price) {
		this.price=price;
	}
	void setName(String name) {
		this.name=name;
	}
	
	
	int getPrice() {
		return this.price;
	}
	//멤버변수의 값을 읽으려면 getter를 통해서
	String getName() {
		return this.name;
	
	}

}
