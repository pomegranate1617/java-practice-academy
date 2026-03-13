package g;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		String[][] s= {
				{"홍1","홍2","홍3"},
				{"홍3","홍5","홍7"},
				{"홍9","홍11","홍13"},
				{"홍100","홍1000","홍1001"}
				
				
		};
		//일반반복문
		List<List<String>> list= new ArrayList<>();
		for(int i=0;i<4;i++) {
			List<String> u=new ArrayList<>();
			for(int j=0;j<3;j++) {
				u.add(s[i][j]);
			}
			list.add(u);
		}
	//방법2) for(int i=0;i<s.length;i++)
		//List<String> r=new ArrayList<>();
//			for(int j=0;j<s[0].length;j++) {
//				r.add(s[i][j]);
//			}
//			list.add(r);
//	}
		
		//enhanced for
		String r="";
		for(List<String> v:list) {
			
			
			for(String j:v) {
				r+=j;
				
			}
		}
		System.out.println(r);

	}

}
