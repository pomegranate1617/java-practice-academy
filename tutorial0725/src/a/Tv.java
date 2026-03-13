package a;

//public class Tv {//추상클래스
//	abstract void turnon(); //추상메서드,이 클래스로 객체 생성 불가,어디에선가는 구현부를 Override를 해서 강제적으로 해야
//	{
//		System.out.println("tv를 켠다");
//	}

	
public class Tv{	//일반 클래스
	void turnon() {//추상메서드,이 클래스로 객체 생성 불가,어디에선가는 구현부를 Override를 해서 강제적으로 해야
		System.out.println("Tv를 켜다");
	}
	
}	
