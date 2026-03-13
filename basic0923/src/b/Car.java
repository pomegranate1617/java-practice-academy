package b;

import java.util.Map;

public class Car {
	String mm(String a,int b) {
		String r="";
		for(int i=0;i<b;i++)r+=a;
		return r;
	}
//---문2)선생님정답	
	int gogo(String a,Map<String,Integer> b) {
		return b.get(a);
	}
	
	//----------문2)내가풀다만거----------------------------
//	int gogo(String a,Map<String a,Integer b>) {
//		int result=a.slice(-1);
//		return result;
//	}
	
}
