package c;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

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
		List<SmartPhone> a=new ArrayList<>();
		
//		String []color= {"빨강","주황","노랑","초록","파랑","남색","보라","회색","검정색","무지개"};
//		String [] model= {"1","2","3","4","5","6","7","8","9","10"};
		
		
	
		for(int i=0;i<dimensionTwo.length;i++) {
			SmartPhone s=new SmartPhone(dimensionTwo[1][i],dimensionTwo[0][i]);
			a.add(s);
			
		}
		
		for(SmartPhone x:a) {
			System.out.println(x.getColor()+","+x.getModel());
		}
		
	}
			
	

}
