package a;


public class Tire {
	private int price;
	private String color;
	private String shape;
	Tire(){}
	Tire(int price,String color, String shape){
		this.price=price;
		this.color=color;
		this.shape=shape;
	}
	
	int getPrice(){return this.price;}
	String getColor() {return this.color;}
	String getShape() {return this.shape;}
	
	void setPrice(int price) {this.price=price;}
	void setColor(String color) {this.color=color;}
	void setShape(String shape) {this.shape=shape;}


}
