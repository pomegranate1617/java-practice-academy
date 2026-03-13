package g;

import java.util.ArrayList;
import java.util.List;



public class Test03 {

	public static void main(String[] args) {
		int ar[][]= {
				{1,2,4,5},
				{1,5,4,3},
				{1,5,4,8}
			  };
		float br[][]= {
				{1.1f,2.3f,3.2f,8.9f},
				{1.9f,2.6f,3.9f,8.5f},
				{1.6f,2.7f,3.3f,8.8f}
		};
		int cr[][]= {
				{5,8,4,11},
				{7,4,4,15},
				{9,0,8,16}
		};
		String dr[][]= {
				{"감","사","해","요"},
				{"노","루","가","뒷"},
				{"산","서","뛴","다"}
		};
		
		
//		Baram [] b=new Baram[4];
		List<List<Baram>>list=new ArrayList<>();
		//일반반복문
		for(int i=0;i<3;i++) {
			List<Baram> k=new ArrayList<>();
			for(int j=0;j<4;j++) {
				Baram h=new Baram();
				h.setEurope(dr[i][j]);
				h.setMama(ar[i][j]);
				h.setNoru(cr[i][j]);
				h.setPapa(br[i][j]);
				k.add(h);
			}
			list.add(k);
		}
		String r="";
		for(List<Baram> y:list) {
			
			for(Baram u: y) {
				System.out.println(u.getEurope()+","+u.getMama()+","+u.getPapa()+","+u.getNoru());
				
			}
			
			
		}
		
		
		
	}

}
