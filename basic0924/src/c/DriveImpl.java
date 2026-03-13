package c;

public class DriveImpl implements Drivable{//인터페이스 상속받을때는 implement를 쓴다.
	@Override
	public void drive() {
		System.out.println("운전을 해요 부릉부릉~~");
		
	}

	@Override
	public void run() {
		System.out.println("달려요 뛰뛰빵빵~~");
		
	}
	
}
