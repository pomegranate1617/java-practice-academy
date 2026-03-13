package c;

import java.util.ArrayList;
import java.util.List;

public class RobotTest {

	public static void main(String[] args) {
		String[][] str=new String[7][8];
		String[] s= {"가","나","다","라","마","바","사"};
		for(int k=0;k<7;k++) {
			for(int j=0;j<8;j++) {
				String merge="";
			for(int i=0;i<(int)(Math.random()*10+1);i++) {
				int randIdx=(int)(Math.random()*s.length);
					merge+=s[randIdx];
			}
			str[k][j]=merge;
			
		}
		}
		for(String[]i:str) {
			for(String j:i) {
				System.out.println(j);
			}
			System.out.println("===========");
		}
		List<Robot> robotList=new ArrayList<>();
		for(int i=0;i<7;i++) {
			List<String> sList=new ArrayList<>();
			for(int j=0;j<8;j++) {
				sList.add(str[i][j]);
				
			}
			Robot r=new Robot(sList);
			robotList.add(r);
		}
		List<Boolean>blist=new ArrayList<>();
		for(Robot i:robotList) {
			for(String j:i.getList()) {
				if(j.length()%3==0) {
					blist.add(true);	
				}else {
					blist.add(false);
				}
			}
		}
		for(boolean i:blist)System.out.println(i+"\t");
		
		
//		
//		String []arr= {"빨","주","노","초","파","남","보"};
//		String []arr2= {"가","나","다","라","마","바","사","아"};
//		List<Robot>listRobot=new ArrayList<>();
//		
//		for(int i=0;i<arr.length;i++) {
//			String a="";
//			a=arr[i];
//		}return a;
//		
//		for(int j;j<arr2.length;j++) {
//			String b="";
//			b=arr2[j];
//		}return b;
//		System.out.println(a+b);
//		
//		List<Boolean> b=new ArrayList<>();
//		for(int i=0;list.add)
//			
//			
//			for(int j=0;i<b.add(arr[i][j]).length();j++) {
//				String ar
//			}
//			
//		}
//		
		
		
		

	}

}
