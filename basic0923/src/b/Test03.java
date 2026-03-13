package b;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
	
//	public static int rr(String z,Map<String,Integer>v) {
//		return v.get(z);
//	}
//
//	public static void main(String[] args) {
//		
//		Map<String,Integer> map=new HashMap<>();
//		
//		map.put("권", "기현".length());
//		int t=rr("권",map);
	public static String rr(String z,Map<String,Integer>v,Map<String,String> w) {
		int rr=v.get(z);
		String ww=w.get(z);
		System.out.println(rr+","+ww);
		if(rr!=0) return ww;
		else if(ww==null)return ""+rr;
		else return "7";
//		return null;
	}

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		Map<String,String> map2=new HashMap<>();
		
		map.put("권", "기현".length());
		map2.put("강", "기현");
		
		String t=rr("권",map,map2);
		System.out.println(map.get("권")+",t="+t);
//		System.out.println(map.get("권"));
//		System.out.println(t);
//	
	

	}

}
