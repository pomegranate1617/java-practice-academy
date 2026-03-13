package d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test05 {

	public static void main(String[] args) {
		
		String[] sArr = {"a","b"};
		int[][][] arr = {
				{{1,2,3,4,5,6,7,8},{10,11,12,13,3,6,9,12}},
				
				{{13,14,15,16,18,19,20,21},{20,30,40,50,100,200,300,400}}
		};
		
		List<List<Map<String,List<Integer>>>> outList = new ArrayList<>();
		
		// outList 1개
		// midList 2개
		// map 4개
		// innerList 8개
		for(int i=0; i<2; i++) {
			List<Map<String, List<Integer>>> midList = new ArrayList<>();

//			for(int j=0; j<2; j++) {

				for(int k=0; k<2; k++) {
					
					Map<String, List<Integer>> map = new HashMap<>();
					List<Integer> innerAList = new ArrayList<>();
					List<Integer> innerBList = new ArrayList<>();
					
					for(int u=0; u<4; u++) {
						innerAList.add(arr[i][k][u]);
					}
					for(int j=4; j<8; j++) {
						innerBList.add(arr[i][k][j]);
					}
					
					map.put("a", innerAList);
					map.put("b", innerBList);
					
					midList.add(map);
				}
				
				
//			}

			outList.add(midList);
		}
		System.out.println(outList);
//		for(List<Map<String, List<Integer>>> midList : outList) {
//			for(Map<String, List<Integer>> map : midList) {
//				Set<String> keys = map.keySet();
//				
//				System.out.println(map);
//				
//				for(String s : keys) {
//					System.out.println(map.get(s));
//				}
//			}
//		}
//		
	
		
	}

}
	 
	 
//	 List<String>strList=new ArrayList<>();
//	
//	 List<String> a=ArraysList<>();
//	 for(const i:data) {
//		 strList.add(i.getdata());
//	 }
//	 List<String> first=Arrays.asList(data).stream().map(i->getconst)
//	 
//	 Map<String,List<String>>map=new HashMap<>();
//	 map.put()
	 
	 
	 
		 
		 //<<<<하다만거~~~~~>>>>>>	 
//		 package d;
//
//	 import java.util.ArrayList;
//	 import java.util.List;
//	 import java.util.Map;
//
//	 public class a {
//	 	 const data = [
//	 	               { a: [1, 2, 3, 4], b: [5, 6, 7, 8] },
//	 	               { a: [10, 11, 12, 13], b: [3, 6, 9, 12] },
//	 	               { a: [13, 14, 15, 16], b: [18, 19, 20, 21] },
//	 	               { a: [20, 30, 40, 50], b: [100, 200, 300, 400] }
//	 	             ];
//	 	 
//	 	 List<Map<String,List>> list=new ArrayList<>();
//	 	 for(const i:data)
//	 	 
//	 	 
//	 	 Map<String,List> list2=new ArrayList2<>();
//	 	 for(data i:)		 
//	  
//	  


	  
	  

