package e;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test01 {

	public static void main(String[] args) {
		Function<List<Bus>,List<Taxi>> ff=(i)->{
			List<Taxi> taxiList=new ArrayList<>();
			for(Bus j:i) {
				Taxi taxi=new Taxi();
				if(j.getP()%2==0) {
					
					taxi.setVv(j.getP());
					taxi.setKz(j.getZ());
					String qw="";
					for(int k=0;k<3;k++) {
						qw+=j.getR();
					}
					taxi.setRr(qw);
				}
				taxiList.add(taxi);
			}
			return taxiList;
		};
		List<Bus> busList=new ArrayList<>();
		for(int i=0;i<10;i++) {
			Bus bus=new Bus();
			bus.setP((int)(Math.random()*10));
			bus.setZ((int)(Math.random()*10));
			bus.setQ((int)(Math.random()*10));
			bus.setR("홍길동"+(int)(Math.random()*10));
			busList.add(bus);
			
		}
		List<Taxi> t=ff.apply(busList);
//		System.out.println(t);
		for(Taxi i:t) {
			System.out.println(i.getKz()+i.getVv()+i.getRr());
		}
	}

}
