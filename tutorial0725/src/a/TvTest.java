package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TvTest {
	public static void u(Tv t) {
		Tv[] tvs= {new Tv(),new SamsungTv(),new LgTv(),new GoldTv()};
		List<Tv>list=new ArrayList<>();
		
		list=Arrays.asList(tvs);
		
		for(Tv i:list) {
				if(i instanceof SamsungTv) {
//				System.out.println("if 2)");
				SamsungTv vv=(SamsungTv)i;
				vv.turnon();
				vv.service();
			}else if(i instanceof LgTv) {
//				System.out.println("if 3)");
				LgTv t=(LgTv) i;
				t.turnon();
				t.visit(4);
			}else if(i instanceof GoldTv) {
//				System.out.println("if 4)");
				GoldTv g=(GoldTv)i;
				g.turnon();
				int re=g.eat("맘마");
				System.out.println(re);
			}else {
				System.out.println("전별님 얘기했던 것과 동일");
			}
				//Tv,오브젝트의 인스텐스도 된다
		}
		
	}
//		if(t instanceof SamsungTv) {
//			SamsungTv s=(Samsung) t;
//			s.service();
//			s.turnon();
//		}
//		if(t instanceof LgTv) {
//			LgTv l=(Lg) t; 
//			l.turnon();
//			l.visit();
//			
//				}
//		if(t instanceof GoldTv) {
//			
//		}
//	}

	public static void main(String[] args) {
		

	}

}
