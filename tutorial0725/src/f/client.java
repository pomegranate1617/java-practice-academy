package f;

public class client {

	public static void main(String[] args) {
		Robot taekwonV=new TaekwonV("태권브이");
		Robot atom=new Atom("아톰");
		
		System.out.println("내이름은"+taekwonV.getName());
		taekwonV.attack();
		taekwonV.move();
		System.out.println("내이름은"+atom.getName());
		atom.attack();
		atom.move();

	}

}
