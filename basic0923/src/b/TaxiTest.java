package b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaxiTest {

	public static void main(String[] args) {
		String[] address= {"서울","부산","마산","광주","제주"};
		String[] driver= {"홍길동","김말자","김개똥","하희라","최수종"};
		Map<String,Taxi>map=new HashMap<>();
		
		//반복문을 이용하여 Map에 5개의 데이터 저장
		//각각의 Taxi객체에는 setter를 통해 멤버변수의 값을 저장 후
		//map에 저장하고
		//keyset을 이용하여 key값을 가지고 출력하세요
		for(int i=0;i<5;i++) {
			Taxi taxi=new Taxi();
			taxi.setDriver(driver[i]);
			taxi.setPrice(1100+i);
			taxi.setDoorNumber(i);
			taxi.setAddress(address[i]);
			map.put("사랑"+i,taxi);
		}
		Set<String> key=map.keySet();
		for(String i:key) {
			Taxi m=map.get(i);
			System.out.println(m.getAddress()+m.getDoorNumber()+m.getDriver()+m.getPrice());
			
		}
		//------------------------------------------------------
		List<List<String>>listOfList=new ArrayList<>();
		for(int i=0;i<address.length;i++) {
			List<String>rr=new ArrayList<>();
			rr.add(address[i]);
			rr.add(driver[i]);
			listOfList.add(rr);
			
		}
		for(List<String>v:listOfList) {
			for(String k:v)System.out.println(k);
		}
		

	}

}
