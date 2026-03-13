package a;

import java.util.ArrayList;
import java.util.List;

public class TestList02 {
	//Car에 다른 클래스(Tire)를 List타입으로 포함(has a 상속)
	//차 한대에 타이어가 4개가 있다
	//춴래는 원형 타이어인데 구별하기위해 shpe를 다르게 설정
	public static void main(String[] args) {
		String[][] shapes= {
				{"동그라미","네모","세모","별"},
				{"마름모","사다리꼴","평행사변형","역삼각"},
				{"육각형","팔각형","구각형","십각형"}
		};
		String[][] colors={ 
				{"빨강","노랑","파랑","금색"},
				{"은색","보라","똥색","갈색"},
				{"주황","초록","남색","연두"}
		};
		int [][] prices= {
				{100,50,70,200},
				{120,77,182,785},
				{78,89,100,345}
		};
		
		
		//문1)Tire객체를 4개 만들어서 List에 저장하고
		//Car객체를 만들어서 setter로 채우세요
		//Car 객체의 driver를 setter로 세우시고 결과를 출력하세요
		
		List<Car> carList=new ArrayList<>();
		List<Tire> tireList=new ArrayList<>();
		
		String [] drivers= {"홍길동","김말자","김개똥"};
		int idx=0;
		for(int i=0;i<3;i++) {//차량 3대를 저장하기 위해 반복문
			Car c=new Car();
			c.setDriver(drivers[idx++]);
			List<Tire>tireList=new ArrayList<>();//각각의 차량마다 별도의 tireList를 생성
			for(int j=0;j<4;j++) {//각각의 차량마다 4개의 tire를 설정
				Tire t=new Tire();
				t.setColor(colors[i][j]);
				t.setShape(shapes[i][j]);
				t.setPrice(prices[i][j]);
				tireList.add(t);
			}
			c.setTires(tireList);
			carList.add(c);//반복문을 돌면서 차량3대가 여기에서 3번 추가
		}//차량 3대의 각각의 차량마다 4대의 타이어를 제조한후 3대의 차량
		int cnt=1;
		for(Car i:carList) {//여기서 i변수는 Car한대
			System.out.println(cnt+++"의 차량의 운전자:"+i.getDriver());
			List<Tire>tires=i.getTires();
			int cntTire=1;
			for(Tire j:tires) {//4회 반복함,tires는 i변수에서 tires를 받아서 j는 각각의 타이어
				System.out.println(cnt+"의 차량의"+cntTire+"타이어의 가격:"+j.getPrice()
				+",색상:"+j.getColor()+",모양:"+j.getShape());
				cntTire++;
			}
		}
	}
}
				
		idx=0;
		for(String[] i:colors) {
			for(String j:i) {
				carList.get(idx).getTires().set
			}
				
				
			}
//			List<Tire> tirelist=new ArrayList<>();
//			Car a=new Car(); //
//			for(int j=0;j<shapes[0].length;j++) {
//				Tire t=new Tire();	
//
//				t.setColor(colors[i][j]);
//				t.setShape(shapes[i][j]);
//				t.setPrice(prices[i][j]);
//				tirelist.add(t);
				
			
			
		
		
//		a.setDriver("사람");
//		a.setTires(tireList2);
//		
//		System.out.println("운전자"+a.getDriver());]
//		int tireCnt=1;
//		int tireCnt2=1;
//		for(Tire i:a.getTires()) {
//			System.out.println(tireCnt+);
//		}
//		
	

