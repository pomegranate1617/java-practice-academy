package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class a {

	public static void main(String[] args) {
	 
	 List<Map<String,List<Integer>>> list=new ArrayList<>();
	 
	 int[][] twoArray= {{1,2,3,4,},{3,4,7},{11,13}};
	 String[] str= {"a","b"};
	 for(int i=0;i<3;i++) {
		 Map<String,List<Integer>> map=new HashMap<>();
		 for(int[] j:twoArray) {
			 List<Integer>innerList=new ArrayList<>();
			 //SET<String>keys=map.keySet();
			 for(int k:twoArray[i]) {
				 innerList.add(k);
				 
				
				 
			 }
			 map.put("a",innerList);
		 }
		 
		 list.add(map);
		 
	 
	
	 }
	 System.out.println(list);
	 Map<String,List<Integer>>result=new HashMap<>();
//	 int cnt=0;
	 for(Map<String,List<Integer>>data:list) {//1.리스트에서 하나씩 꺼내면 각각의 data는 Map이 되고
		 Set<String> keys=result.keySet();//2.내가 최종적으로 만들려는 Map의 key를 구하고
//		 System.out.println("여기는 출력  ");
			 for(String j:data.keySet()) {//3.리스트에서 하나씩 꺼낸 각각의 Map의 key값을 구하고 그 key를 순회(반복)하면서
//				 for(String i:keys) {
//					 if(i==j)cnt++;//4.결과의 Map의 key에 포함되어있으면 cnt를 증가시키고 결과의 Map에 key가 포함되어 있지 않으면
//					 //5.해당 key값이 value로 빈 List를 저장함
				 if(keys.isEmpty()) {//6.최종 구하려는 Map의 key가 비어있으면
					 result.put(j,new ArrayList<Integer>());//7.새로운 key에 value는 빈 리스트로 저장하고
				 }
//				 System.out.println("key"+j);
//				 if(cnt==0)resul.put("a",new ArrayList<Integer>());
				 for(int v:data.get(j)) result.get("a")	.add(v);//기종의 key가 있으면 빈 리스트에 데이터를 추가
				
			 }
				 
	}
	 System.out.println(result);
	}
}
			 




//list[] =[{'a':[1,2,3,4]]},{'a':[3,4,7]},{'a':[11,13]}];문제의 해답^^^^^^^(파란스프링노트에 있음)
//List<Map<String,List<>>>
//list=newArrayList<>()
//for(int i=0;i<3;i++) {
//	 Map<>map=newHashMap<>();
//	 map.put("a",        )