package b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarsTest {

	public static void main(String[] args) {
		
		//문3)
		//Car클래스 생성,drive(){sysout("차가 부릉부릉")}
		//PoliceCar Car를 상속 받아서, 싸이렌 소리가 울려요,FireCar는 Car를 상속받아서 "불을 끄러 가는 중이에요"
		//다형성으로 List,Map,배열을 모두 사용해서 해보세요
		Car c=new Car();
		PoliceCar p=new PoliceCar();
		FireCar f=new FireCar();
		
	
		
		Map<String,Car> map=new HashMap<>();
		map.put("가", c);
		map.put("나", p);
		map.put("다", f);
		Set<String> s=map.keySet();
		for(String i:s) {
			map.get(i).drive();
		}
		
		
		List<Car> listC=new ArrayList<>();
		listC.add(c);
		listC.add(p);
		listC.add(f);
		System.out.println("============================");
		for(Car i:listC) i.drive();
		System.out.println("==============================");
		Car [] carstr= {c,p,f};
		for(Car i:carstr) i.drive();
		
		
		

	}

}
