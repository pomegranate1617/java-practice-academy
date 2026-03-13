package relation2;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

	public static void main(String[] args) {
		List<Tire> ts = new ArrayList<>();
		for(int i=0; i<4; i++) ts.add(new Tire());
		
		int [] prices = {100,50,1000,70};
		String [] shapes = {"네모", "세모", "별", "동그라미"};
		String [] colors = {"빨간색", "노란색", "파란색", "검정색"};
		
		int idx = 0;
		for(Tire i:ts) {
			i.setShape(shapes[idx]);
			i.setPrice(prices[idx]);
			i.setColor(colors[idx]);
			idx++;
		}
		
		Car c = new Car();
		c.setTires(ts);
		c.setName("곽은지");
		System.out.println("차량 운전자 : "+c.getName());
		for(Tire i :c.getTires() ) {
			System.out.println("형태 : "+i.getShape()+", 가격 : "+i.getPrice()+", 색상 : "+i.getColor());
		}

	}

}
