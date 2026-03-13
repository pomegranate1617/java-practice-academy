package f;

public abstract class Robot {
	private String name;
	public Robot(String name) {this.name=name;}
	public String getName() {return this.name;}
	//공격
	public abstract void attack();
	
	public abstract void move();
	

}
