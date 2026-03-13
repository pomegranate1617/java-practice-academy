package d;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {

	public static void main(String[] args) {
		Map<String,Red>map=new HashMap<>();//type추론(inference)
		
		String[]str= {"가","나","다","라"};
		
		for(int i=0;i<10;i++) {
			Red r= new Red();
			r.setDodo((int)(Math.random()*100));
			r.setPopo((int)(Math.random()*100));
			int idx= (int)(Math.random()*str.length);//str에서 랜덤의 문자열 하나를 가져오기 위한 index
			int idx2=(int)(Math.random()*10);//하나의 문자열을 몇번 반복할지 결정하는 index
			r.setYudo((r.randomString(str[idx], idx2)));//Red의 method호출
			r.setTongtong((float)(Math.random()*100));
			map.put("a"+(i+1), r);
		
		}
		Set<String>key=map.keySet();//Key들의 모임을 반환하는 기능			
		for(String i:key) {
			System.out.println(map.get(i));
		}
//		System.out.println("======enhanced for=======");
//		for(int i:list)System.out.println(i+"\t");
//		List<Red>listRed=new ArrayList<>();
//		for(int i=0;i<10;i++) {
//			Red r= new Red();
//			r.setDodo((int)(Math.random()*100));
//			r.setPopo((int)(Math.random()*100));
//			int idx= (int)(Math.random()*str.length);//str에서 랜덤의 문자열 하나를 가져오기 위한 index
//			int idx2=(int)(Math.random()*10);//하나의 문자열을 몇번 반복할지 결정하는 index
//			r.setYudo((r.randomString(str[idx], idx2));//Red의 method호출
//			r.setTongtong((float)(Math.random()*100));
//			listRed.add(r);
//			}
//		for(Red i:listRed) {
//			System.out.println(i.getDodo()+","+i.getTongtong()+","+i.getYudo()+","+i.getPopo());
//		}
//
//	}

}
}
