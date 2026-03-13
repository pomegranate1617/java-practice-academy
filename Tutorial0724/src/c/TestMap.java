package c;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		String[][] dimensionTwo= {
				{"빨강","X91"},
				{"주황","X92"},
				{"노랑","X93"},
				{"초록","X94"},
				{"파랑","X95"},
				{"남색","X96"},
				{"보라","X97"},
				{"검정","X98"},
				{"흰색","X99"},
				{"무지개","X100"}
		};
		

//		SmartPhone s=new SmartPhone("빨강","X97");
//		for(int i=0;i<10;i++) s.onAndOff();
		
		//문1)스마트폰 10개를 list에 저장하세요
		//색상과 모델은 서로 다르게
		
		
//		String []color= {"빨강","주황","노랑","초록","파랑","남색","보라","회색","검정색","무지개"};
//		String [] model= {"1","2","3","4","5","6","7","8","9","10"};
		
		
		Map<Integer,SmartPhone> map=new HashMap<>();
		for(int i=0;i<dimensionTwo.length;i++) {
			SmartPhone x=new SmartPhone(dimensionTwo[i][0],dimensionTwo[i][1]);
		    map.put((i+1)*10, x);
			
		}
		Set<Integer> keys=map.keySet();
		boolean flag=false;
		for(int i:keys) {
			SmartPhone v=map.get(i);
			String result=v.getColor()+","+v.getModel();
			v.bell();
			v.internet();
			flag=!flag;//!는 not을 의미하고 true->flase로flase를 true
			v.setWifi(flag);
			System.out.println("wifi상태:"+v.isWifi());
			v.hangUp();
			System.out.println(result);
			
//			System.out.println(map.get(i).getColor()+","+map.get(i).getModel());
		}
		
//		
//		for(SmartPhone x:a) {
//			System.out.println(x.getColor()+","+x.getModel());
//		}
		
		
	}
			
	

}
