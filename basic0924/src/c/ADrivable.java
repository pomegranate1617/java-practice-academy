package c;


public class ADrivable implements Drivable{

	@Override
	public void drive() {
		System.out.println("운전을 해요 뛰뛰");
		
	}

	@Override
	public void run() {
		System.out.println("느린 속도로 달립니다.");
		
	}

}
