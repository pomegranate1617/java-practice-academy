package c;

public abstract class Car {//추상메서드를 쓰기 위해서는 추상클래스여야 하므로 마찬가지로 abstract를 붙인다.
	public void drive(){
		System.out.println("차가 부릉부릉");
	}
	public abstract void  kwon();//구현부가 없는 추상 메서드//추상메서드를 만들기 위해서는abstract을 붙여야한다.
}//구현부가 없으므로 Car를 상속받는 다른 클래스를 만들어서 메서드를 오버라이드해서 정의내려야 한다(Carimpl클래스로 이동해 작성)
