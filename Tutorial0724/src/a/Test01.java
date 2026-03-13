package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		//nodo, math, sora 에저장할 데이터를 2차원 배열로 저장 
		int[][] arr= {
				{1,2,3,4,5},
				{11,12,13,14,15},
				{21,22,23,24,25}
		};
		
		String[] str= {"가","나","다","라","마","바","사"};
		
		Map<String,Tank> map=new HashMap<>();
		
		for(int i =0;i<5;i++) {
			Tank t =new Tank();			
			t.setMath(arr[0][i]);
			t.setNodo(arr[1][i]);
			t.setSora(arr[2][i]);
			map.put("홍"+(i+1), t);
		}
		Set<String> keys= map.keySet();
		for(String i : keys) {
			Tank u = map.get(i);
//			System.out.println(u.getMath()+","+u.getNono()+"," +u.getSora());
		}
		System.out.println("=========================");
		for(String k : keys) {	
			List<String> strList=new ArrayList<>();
			for(int j =0;j<15;j++) {
				String merge="";
				for(int i =0;i<(int)(Math.random()*10+1);i++) {
					int randIdx=(int)(Math.random()*str.length);
					merge+=str[randIdx];
				}
//				System.out.println("문자열 결합" +merge);
				strList.add(merge);
			}
			List<Integer> rrList=new ArrayList<>();
			for(int j=0;j<10;j++) {//10개의랜덤함 숫자를 List에 담아서 각각의 Tank객체에 setter로 저장 
				rrList.add((int)(Math.random()*100));
			}
			map.get(k).setUu(strList);//map.get(k) 는 Tank 객체 하나인데 uu에는 아무것도 없었다 
			map.get(k).setRr(rrList);
		}
		for(String i : keys) {
			Tank u = map.get(i);
			System.out.print(u.getMath()+"," +u.getNodo()+"," +u.getSora()+"\t");
			for(int r: u.getRr()) System.out.print(r+"\t");
			System.out.println();
			for(String r: u.getUu()) System.out.print(r+"\t");
		}

	}
}
