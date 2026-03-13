package g;

public abstract class Robot {
	private String name;
	//인터페이스
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	private EatingStrategy eatingStrategy;
	
	
	public Robot(String name) {this.name=name;}
	public String getName() {return this.name;}
	
	//공격
	public  void attack(){
		attackStrategy.attack();
	}
	//이동
	public  void move() {
		movingStrategy.move();
	}
	public void eat() {
		eatingStrategy.eat();
	}
	
	//getter,setter를 만들어서 캡쳐
	MovingStrategy getMovingStrategy() {return this.movingStrategy;}
	AttackStrategy getAttackStrategy() {return this.attackStrategy;}
	EatingStrategy getEatingStrategy() {return this.eatingStrategy;}
	void setAttackStrategy(AttackStrategy attackStrategy) {this.attackStrategy=attackStrategy;}
	void setMovingStrategy(MovingStrategy movingStrategy) {this.movingStrategy=movingStrategy;}
	void setEatingStrategy(EatingStrategy eatingStrategy) {this.eatingStrategy=eatingStrategy;}
	

}
