package g;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
		
	}

	@Override
	public void attack() {
		System.out.println("나는 강력하 펀치를 가지고 있고 펀치로 공격을 해요");
		
	}

	@Override
	public void move() {
		System.out.println("나는 날수도 있어요");
		
	}
	
}
	
