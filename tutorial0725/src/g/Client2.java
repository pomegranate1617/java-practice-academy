package g;

public class Client2 {

	public static void main(String[] args) {
		Robot taekwonV=new TaeKwonV("태권브이");
		Robot atom=new Atom("아톰");
		//외부에서 주입한다,Dependency(의존성),Injection(주입)
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());
		taekwonV.setEatingStrategy(new FalkStrategy());
		
		
		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());
		atom.setEatingStrategy(new ChopstickStarategy());
		
		System.out.println("내이름은"+taekwonV.getName()+"이에요");
		taekwonV.attack();
		taekwonV.move();
		taekwonV.eat();
		System.out.println();
		System.out.println("내이릅은"+atom.getName()+"이에요");
		atom.attack();
		atom.move();
		atom.eat();
		
		//문제1)EatingStrategy(인터페이스) 전략 패턴
		//태권브이 FalkStrategy(클래스)
		//아톰 찹스틱 스테레테지(클래스)
		//디자인 패턴의 한 종류입니다.(인터페이스를 왜 사용하는지 확인가능)
		//싱글튼 패턴
		//아답터 패턴
		
		
	}

}
