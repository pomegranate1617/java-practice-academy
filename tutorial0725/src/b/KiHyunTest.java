package b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KiHyunTest {

	public static void main(String[] args) {
		List<KiHyun>list=new ArrayList<>();
		Integer[][] twoDimensionArr= {
				{10,20,30,40,50,60,70,80,90,100},
				{145,156,178,189,115,168,177,169,152,116},
				{54,45,24,36,78,89,56,75,111,95},
		};
		String [] name= {"하나","둘","셋","넷","다섯","여섯","일곱","여덟","아홉","열"};	
//		Integer [] age= {10,20,30,40,50,60,70,80,90,100};
//		Integer[] height= {145,156,178,189,115,168,177,169,152,116};
//		Integer [] weight= {54,45,24,36,78,89,56,75,111,95};
//		String [] name= {"하나","둘","셋","넷","다섯","여섯","일곱","여덟","아홉","열"};	
		List<Integer> ageList=Arrays.asList(twoDimensionArr[0]);
		List<Integer> heightList=Arrays.asList(twoDimensionArr[1]);
		List<Integer> weightList=Arrays.asList(twoDimensionArr[2]);
		List<String> nameList=Arrays.asList(name);
		for(int i=0;i<name.length;i++) {
			KiHyun k=new KiHyun();
			k.setAge(ageList.get(i));
			k.setHeight(heightList.get(i));
			k.setHeight(weightList.get(i));
			k.setName(nameList.get(i));
			list.add(k);
		}
		for(KiHyun i:list)System.out.println(i.getAge()+",몸무게"+i.getWeight()+",키"+i.getHeight()+",이름"+i.getName());
			
			
		

		
//	System.out.println(ageList.getage()+","+ageList.add.getheight()+","+ageList.getWeight()+ageList.getname());
//	?	

	}

}
