package ch05_2;

public class ChildICar implements ICar{

	@Override
	public void drive() {
		System.out.println("아들차가 운전해요");
		
	}

	@Override
	public void run() {
		System.out.println("아들차가 달려요");
		
	}

	@Override
	public void eat() {
		System.out.println("아들차가 딸기를 먹어요");
		
	}

	@Override
	public void hit() {
		System.out.println("아들차가 때려요");
		
	}//implenents(구현)

}
