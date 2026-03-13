package b;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<Tire> tireList=new ArrayList<>();
		Tire a=new Tire();
				a.setColor("노랑");
				a.setPrice(80);
				a.setShape("네모");
				
				Tire b=new Tire();
				b.setColor("빨강");
				b.setPrice(90);
				b.setShape("세모");
				tireList.add(b);
				tireList.add(a);
				
				Car c=new Car("홍길동",tireList);
				System.out.println(c.getDriver());
				//홍길동 노랑 80 네모 빨강 90세모
				for(Tire i:c.getTires()) {
					System.out.println(i.getColor()+"가격,"+i.getPrice()+",모양"+i.getShape());
				}
	}

}
