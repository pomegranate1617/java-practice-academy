package d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test01 {
	public static void main(String [] args) {
		Star a=()->{System.out.println("사랑");};
		
		a.run();
		
		Moon b=(i)->i*i*i;
		//4의 3승의 결과가 나오도록 설계
		int t=b.ride(4);
		System.out.println(t);
		
		Rara z=i ->{
			String u="";
			
			for(int j=1;j<10;j++)u+=i+"x"+j+"="+(i*j)+"\n";
			return u;
		};
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,8,9);
		//문1)list의 데이터를 반복문을 이용하여 구구단 구현하세요
		String vv=z.rara(3);
		System.out.println(vv);
		for(int i:list) {
			String c=z.rara(i);
			System.out.println(c);
		}
		
		Consumer<String> c1= kk->System.out.println("입력값:"+kk);
		c1.accept("홍말자");
		
		BiConsumer<String,Integer> c2=(r1,r2)->System.out.println("r1="+r1+",r2="+r2+",결과="+r1+r2);
		c2.accept("홍길동", 3);
		Function<String,Integer>f2=(i)->i.length();
		int tttt=f2.apply("홍길동");
		System.out.println(tttt);
		//5개의 red객체를 받어서 각각의 grade를 5개 반환하는 기능을 구현
//		Function<List<Red>,List<String>>ff4=(kkk)->{
//			List<String>result=new ArrayList<>();
//			for(Red i:kkk) {
//				result.add(i.getGrade());
//			}
//			return result;
//			
//		};
		Function<List<Red>,List<String>>ff4=(kkk)->{
			return kkk.stream().map(i->i.getGrade()).toList();
		};
		List<Red>listRed=new ArrayList<>();
		for(int i=0;i<5;i++) {
			Red r=new Red();
			r.setMath((int)(Math.random()*100));
			r.setEng((int)(Math.random()*100));
			r.setKorea((int)(Math.random()*100));
			r.setTotal(r.getMath()+r.getEng()+r.getKorea());
			r.setAvg(r.getTotal()/3.0f);
			r.setGrade(r.calcGrade(r.getAvg()));
			listRed.add(r);
		}
		List<String>res=ff4.apply(listRed);
		System.out.println(res);
			
		
		
		
	}
}
