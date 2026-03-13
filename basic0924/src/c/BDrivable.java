package c;

public class BDrivable implements Drivable{

	@Override
	public void drive() {
		System.out.println("운전을 해요 빵빵");
		
	}

	@Override
	public void run() {
		System.out.println("중간 속도로 달립니다.");
		
	}

}
