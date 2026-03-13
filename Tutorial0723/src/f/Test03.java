package f;

import java.util.ArrayList;
import java.util.List;



public class Test03 {

	public static void main(String[] args) {
		int ar[]= {1,2,4,5};
		float br[]= {1.1f,2.3f,3.2f,8.9f};
		int cr[]= {5,8,4,11};
		String dr[]= {"감","사","해","요"};
		
		
//		Baram [] b=new Baram[4];
		List<Baram>list=new ArrayList<>();
		//일반반복문
		for(int i=0;i<ar.length;i++) {
			Baram c=new Baram();
			c.setNoru(ar[i]);
			c.setEurope(dr[i]);
			c.setMama(cr[i]);
			c.setPapa(br[i]);
			list.add(c);
		}
		
		//en반복문
		
		for(Baram u:list) {
			System.out.println(u.getEurope()+","+u.getMama()+u.getNoru()+u.getNoru());
			
			
		}
		
	}

}
