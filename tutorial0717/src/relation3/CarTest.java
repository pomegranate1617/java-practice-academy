package relation3;

import java.util.ArrayList;
import java.util.List;

public class CarTest {


	public static void main(String[] args) {
		List<List<Car>> ts= new ArrayList<>(); 		
		//Car를 여러개 담는 List
		//그것을 또 여러개 담는 CarList의 여러개의 모임
		
		String [] shapes= {"네모","세모","동그라미","별모양"};
		String [] shapes1= {"네모1","세모1","동그라미1","별모양1"};
		String [] shapes2= {"네모2","세모2","동그라미2","별모양2"};
		String [] shapes3= {"네모3","세모3","동그라미3","별모양3"};
		String [] colors1 = {"빨강1","노랑1","똥색1","금색1"};
		String [] colors2 = {"빨강2","노랑2","똥색2","금색2"};
		String [] colors3 = {"빨강3","노랑3","똥색3","금색3"};
		String [] colors4 = {"빨강4","노랑4","똥색4","금색4"};
		String[][] shapeList= {shapes ,shapes1 , shapes2 , shapes3};
		String[][] colorsList= {colors1 ,colors2 , colors3 , colors4};

		for(int k=0; k<5; k++) {//차량 4대를 가진 리스트가 5개 있어요 
			List<Car> carList=new ArrayList<>();
			for(int j=0; j<4; j++) {//carList에 차량 4대를 List에 담았어요 
				Car c = new Car();
				c.setDriver("차량"+(j+k));
				List<Tire> tires=new ArrayList<>();
				for(int i=0; i<4; i++) {//각각의 차량마다 4개의 tire가 있어요 
					Tire t = new Tire();
					t.setColor(colorsList[j][i]+(i+j+k));
					t.setShape(shapeList[j][i]+(i+j+k));
					tires.add(t);
				}
				c.setTires(tires);
				carList.add(c);
			}
			ts.add(carList);
		}
		for(List<Car> i:ts) {
			for(Car j:i) {
				System.out.println("운전자 : "+j.getDriver());
				for(Tire r:j.getTires()) {
					System.out.println(r.getPrice()+", "+r.getShape()+", "+r.getColor());
				}
			}
		}
	}
}

//	public static void main(String[] args) {
//		List<List<Car>> ts = new ArrayList<>();
//		List<Tire> tires = new ArrayList<>(); 
//
//		for(int i=0; i<4; i++) {
//			tires.add(new Tire());
//		}
//		
//		String [] shapes = {"네모", "세모", "동그라미", "별모양"};
//		String [] shapes1 = {"네모1", "세모1", "동그라미1", "별모양1"};
//		String [] shapes2 = {"네모2", "세모2", "동그라미2", "별모양2"};
//		String [] shapes3 = {"네모3", "세모3", "동그라미3", "별모양3"};
//		String [] colors = {"빨강", "노랑", "똥색", "금색"};
//		String [] colors1 = {"빨강1", "노랑1", "똥색1", "금색1"};
//		String [] colors2 = {"빨강2", "노랑2", "똥색2", "금색2"};
//		String [] colors3 = {"빨강3", "노랑3", "똥색3", "금색3"};
//		String [][] shapeList = {shapes, shapes1, shapes2, shapes3};
//		String [][] colorList = {colors, colors1, colors2, colors2};
//		
//		for(int k=0; k<4; k++) {
//			List<Car> carList1 = new ArrayList<>();
//			for(int j=0; j<4; j++) {
//				Car c = new Car();
//				c.setName("차량"+j);
//				for(int i=0; i<4; i++) {
//					Tire t = new Tire();
//					t.setColor(colorList[j][i]);
//					t.setShape(shapeList[j][i]);
//					tires.add(t);
//				}
//				c.setTires(tires);
//				carList1.add(c);
//			}
//			ts.add(carList1);
//		}
//		for(List<Car> i:ts) {
//			for(Car j:i) {
//				System.out.println(j.getName());
//				for(Tire r:j.getTires()) {
//					System.out.println(r.getPrice()+", "+r.getShape()+", "+r.getColor());
//				}
//			}
//		}
//		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				Tire t = new Tire();
//				t.setColor(colors[i]);
//				t.setShape(shapeList[j][i]);
//				tires.add(t);
//			}
//		}
//		
//		Car c2 = new Car();
//		c2.setName("차량2");
//		c2.setTires(tires);
//		
//		for(int i=0; i<4; i++) {
//			tires.add(new Tire());
//		}
//		
//		Car c3 = new Car();
//		c3.setName("차량3");
//		c3.setTires(tires);
//		
//		List<Car> carList1 = new ArrayList<>();
//		List<Car> carList2 = new ArrayList<>();
//		List<Car> carList3 = new ArrayList<>();
//		carList1.add(c1);
//		carList1.add(c2);
//		carList1.add(c3); //CarList1 => CarList2 => CarList3
//		
//		carList2.add(c1);
//		carList2.add(c2);
//		carList2.add(c3); //CarList1 => CarList2 => CarList3
//		
//		carList3.add(c1);
//		carList3.add(c2);
//		carList3.add(c3); //CarList1 => CarList2 => CarList3
//		
//		ts.add(carList1);
//		ts.add(carList2);
//		ts.add(carList3);

