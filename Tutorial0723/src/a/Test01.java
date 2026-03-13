package a;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	//Car에 다른 클래스(Tire)를 List타입으로 포함(has a 상속)
	//차 한대에 타이어가 4개가 있다
	//춴래는 원형 타이어인데 구별하기위해 shpe를 다르게 설정
	public static void main(String[] args) {
		String[] shapes= {"동그라미","네모","세모","별"};
		String[] colors= {"빨강","노랑","파랑","금색"};
		int [] prices= {100,50,70,200};
		
		
		//문1)Tire객체를 4개 만들어서 List에 저장하고
		//Car객체를 만들어서 setter로 채우세요
		//Car 객체의 driver를 setter로 세우시고 결과를 출력하세요
		Tire [] tire=new Tire[4];
		List<Tire> tirelist=new ArrayList<>();
		for(int i=0;i<shapes.length;i++) {
//		for(int i=0;i<4;i++) {
			Tire t=new Tire();	
//			tire[i]=new Tire();
			t.setColor(colors[i]);
			t.setShape(shapes[i]);
			t.setPrice(prices[i]);
			tirelist.add(t);
//			tirelist.add(tire[i]);
		}
		Car a=new Car(); //
		a.setDriver("사람");
		a.setTires(tireList);
		
		System.out.println("운전자"+a.getDriver());
		int tireCnt=1;
		for(Tire i:a.getTires()) {
			System.out.println(tireCnt+);
		}
		
//		for(Tire i:tire) System.out.println("색상:"+i.getColor()+",가격:"+i.getPrice()+",모양:"+i.getShape()); 
			
		
		
		
		

	}

}
