package b;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
		
		Map<String,String> m=new HashMap<>();
		//문1)m에 {"기현":"종민"}저장
			//key    value
		m.put("기현", "종민");
		m.put("종민", "기현");
		//문2)"종민"value값을 가져오려면?
		String r=m.get("기현");
		System.out.println(r);
		Set<String>keys=m.keySet();//>>keyset()다시,Set<string>은 리스트?
		for(String i:keys) {
			String u=m.get(i);
			System.out.println(u);
		}
		//문3)반복문을 활용하여 m에 데이터 10개를 저장 후 출력하세요
		Map<String,Double> n=new HashMap<>();
		String[]str= {"사랑","믿음","증오","갈증","속도","행복","유라","기현","소라","종민"};
		for(int i=0;i<str.length;i++) {
			n.put(str[i],(double)i);
		}
		Set<String>keys2=n.keySet();
		for(String i:keys2) {
			String w=n.get(i);
			System.out.println(w);
		}
		
		for(int i=0;i<10;i++) {
			m.put("기현"+i,"종민"+i);	
		}
		Set<String>keys3=m.keySet();
		for(String i:keys3) {
			String w=m.get(i);
			System.out.println(w);
		}

	}

}
