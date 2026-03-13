package b;

public class Apple {
	private int weight=0;
	private String color="";
	private float width=0.0f;
	
	public Apple(int weight,String color) {
		this.weight=weight;
		this.color=color;
		
		
	}
	
	public Apple(int weight,float width,String color) {
		this.weight=weight;
		this.color=color;
		this.width=width;
		
	}
	int getWeight() {return this.weight;}
	String getColor() {return this.color;}
	float getWidth() {return this.width;}
	
	void setWeight(int weight) {this.weight=weight;}
	void setColor(String color) {this.color=color;}
	void setWidth(float width) {this.width=width;}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color +",width=" + width + "]";
	}
	
	
}
