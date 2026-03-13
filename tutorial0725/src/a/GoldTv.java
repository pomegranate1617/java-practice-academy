package a;

public class GoldTv extends Tv {
	
	@Override
	void turnon() {
		System.out.println("금성Tv를 켜다");
	}
	
	int eat(String a ) {
		System.out.println(a+"를 먹는다");
		return a.length();
		
	}
	

}
