package b;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
		
		for(int i=0;i<6;i++) {
			map.put("사랑"+(i+1), 4*i+2);
		}
		map.put("사랑1", 2);
		map.put("사랑2", 6);
		map.put("사랑3", 10);
		map.put("사랑4", 14);
		map.put("사랑5", 18);
		map.put("사랑6", 22);
		
		Set<String> keys=map.keySet();//key값들을 확인하는 메서드가 keySet
		for(String i:keys)System.out.println(map.get(i));//map의 데이터를 읽을때는 get에 key값을 전달하면 value를 준다
		
		//문2)
		//Car 클래스에 gogo 메서드 생성, 인자로는 문자열을 받고 두번째 인자로는 map을 받아서, 정수로 반환하는 메서드이고
		//위에서 만든 map을 반복문을 이용하여 key값을 전달하고 value를 받아서 출력하세요
		for(String i:keys) {
			Car car=new Car();
			int d=car.gogo(i,map);
			System.out.println("key="+i+"car 객체에서 반환된 value="+d);
		}
		

	}

}
