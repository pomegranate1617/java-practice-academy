package c;

public class CDrivable implements Drivable{

	@Override
	public void drive() {
		System.out.println("운전을 해요 뛰빵");
		
	}

	@Override
	public void run() {
		System.out.println("고속으로 달립니다.");
		
	}

}
