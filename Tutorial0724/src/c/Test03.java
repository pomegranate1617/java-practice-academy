package c;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*150+1));
			
		}for(int i:list)System.out.println(i);
		//문1)
		List<Boolean>trueList=new ArrayList<>();
		List<Boolean>falseList=new ArrayList<>();
		
		//생성된 숫자가 30보다 같거나 크고 100보다 작은 수가 나오면 trueList에 true를 저장하고
		//그렇지 않으면 falseList에 false를 저장
		for(int i:list) {
			if(i>=30&&i<100) trueList.add(true);
			else falseList.add(false);
			
			
		}
		int cntTrue=0;
		for(boolean i:trueList) {
			if(!i) cntTrue++;
//			System.out.println(i);
		}
		System.out.println("true가 아닌 데이터가 있는가"+(cntTrue==0));
		System.out.println("데이터의 갯수가 같은가?"+((trueList.size()+falseList.size())==list.size()));
		List<String>strlist=new ArrayList<>();
		
		for(boolean i:falseList) {
			
			System.out.println(i);
		}
		List<String> strList=new ArrayList<>();
		//문2)숫자가 짝수이면 "짝수10" 이런식으로 strList에 저장,만약 홀수이면 홀수5이렇게 저장
		for(int i:list) {
			if(i%2==0) strList.add("짝수"+i);
			else strList.add("홀수"+i);
		}
		for(String i:strList) System.out.println(i);
		
			
	
	}
}
