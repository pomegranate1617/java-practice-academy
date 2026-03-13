package Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		Map<String,Integer>l=new HashMap<>();//mao이름은 l이다
		//map은 key와 value의 쌍으로 저장된다
		//첫번째 인자는 key의 데이터 타입, 두번째 인자는 value의 데이터 타입
		//추가put
		//이코드를 반복문으로 변경
		//l.put("홍"+(i+2),(i-1)*10+1)?
		for(int i=0;i<5;i++) l.put("홍"+((i*2)+1),(i*10)+1);
			String [] str= {"홍1","홍3","홍5","홍7","홍9"};
			Set<String> keys=l.keySet();
			for(String i:keys) {
				System.out.println(l.get(i));
			}
	}
			
		
		
//		int r=0;
//			for(int i=0;i<5;i++) {
//				r=1.get(str[i]);
//				System.out.println(r);
//			}
//		r=l.get("홍1");
//		System.out.println(r);
//		
//		r=l.get("홍3");
//		System.out.println(r);
//		
//		r=l.get("홍5");
//		System.out.println(r);//이 코드도 반복문으로 변경
//		for(int i=0)
//		
		

	}

}
