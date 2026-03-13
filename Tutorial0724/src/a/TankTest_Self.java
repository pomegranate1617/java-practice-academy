package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TankTest_Self {

	public static void main(String[] args) {
		Map<String,Tank> map=new HashMap<>();
	
		
		
		int [] arr= {5,3,6,4,3};
		int []math= {7,3,4,5,6};
		int []sora= {9,7,9,7,6};
		int [] rr= {3,5,7,2,3};
		String [] uu= {"하나","둘","셋","넷","다섯","여섯","일곱","여덟","아홉","열","열하나","열둘","열셋","열넷","열다섯"};
		List<String> strlist=new ArrayList<>();
		List<Integer> intlist=new ArrayList<>();
		for(String u:uu) {
			strlist.add(u);
		}
		
		for(int t:sora) {
			intlist.add(t);
		}
		
		
		
		for(int i=0;i<5;i++) {
			Tank tank=new Tank();
			tank.setMath(math[i]);
			tank.setNodo(arr[i]);
			tank.setSora(sora[i]);
			tank.setUu(strlist);
			tank.setRr(intlist);
			map.put("홍"+i, tank);
			
		}
		Set<String> keys=map.keySet();
		for(String i:keys) {
			System.out.println(map.get(i).getMath()+","+map.get(i).getNodo()
		}
		
		
				

	}

}
