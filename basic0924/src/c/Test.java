package c;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Car c=new CarImpl();//다형성 부모가 자식 객체를 저장할 수 있다.
		List<String> li=new ArrayList<>();//인터페이스
		Drivable d=new DriveImpl();
		d.run();
		d.drive();
		//1)ADrivable 2)BDrivable 3)CDrivable만들기
		//다형성 확인하시고 List에 담은 후 메서드 실행
		Drivable aa=new ADrivable();
		Drivable ba=new BDrivable();
		Drivable ca=new CDrivable();
		List<Drivable> listD=new ArrayList<>();
		
		listD.add(aa);
		listD.add(ba);
		listD.add(ca);
		for(Drivable i:listD) {
			i.drive();
			i.run();
		}
		
		
		
	}

}
