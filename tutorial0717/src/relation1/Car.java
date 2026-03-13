package relation1;

public class Car {
	//Car has a tires
	//Human is animal
	//다른 클래스를 포함(has a 상속)
	//일반적인 상속 (is a 상속)
	Tire tires[] = new Tire[4]; //멤버변수
	private String name;
	
	String getName() { return this.name; }
	void setName(String name) { this.name = name; } //멤버변수
	
	
	
	Tire[] getTires() {
		return this.tires;
	}
	
	void setTires(Tire[] tires) {
		this.tires = tires;
	}

}
