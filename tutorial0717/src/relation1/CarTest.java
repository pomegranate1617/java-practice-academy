package relation1;

public class CarTest {

	public static void main(String[] args) {
		Tire[] ts = {
				new Tire(),
				new Tire(),
				new Tire(),
				new Tire()
		};
		
		Car c = new Car();
		c.setTires(ts);
		
//		for(int i=0; i<ts.length; i++) {
//			ts[i].setPrice((int)(Math.random()*100));
//		}

//		
//		for(Tire i : c.getTires()) {
//			System.out.println(i.getPrice());
//		}

		int [] prices = {100,50,1000,70};
		String [] shapes = {"네모", "세모", "별", "동그라미"};
		String [] colors = {"빨간색", "노란색", "파란색", "검정색"};
		
		for(int i=0; i<ts.length; i++) {
			ts[i].setShape(shapes[i]);
			ts[i].setPrice(prices[i]);
			ts[i].setColor(colors[i]);
		}
		c.setTires(ts);
		c.setName("곽은지");
		System.out.println("차량 운전자 : "+c.getName());
		
		for(Tire i :c.getTires() ) {
			System.out.println("형태 : "+i.getShape()+", 가격 : "+i.getPrice()+", 색상 : "+i.getColor());
		}

	}

}
