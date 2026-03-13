package f;

import java.util.function.Predicate;

public class Test01 {

	public static void main(String[] args) {
		
		Function<Integer, String> f = x ->{
			String r = "";
			for(int i=1; i<10; i++)	{
				r += x+"x"+i+"="+(x*i)+"\n";
			}
			return r;
		};
		
		String r = f.apply(3); //9단 출력하기 //3단 출력하기
		System.out.println(r);
		
		//문제1) 9000보다 큰 것의 개수를 구하세요
		long [] arr = {9007l,5600l,10000l, 57890l, 3l};
		
		Predicate<Long> isOver9000 = i-> i>9000;//boolean 타입 반환 (predicate)
		
		System.out.println();
		int cnt = 0;
		for(long i:arr) if(isOver9000.test(i)) cnt++;
		System.out.println(cnt);
//		boolean uv = isOver9000.test(500l);
//		System.out.println(uv);
		
		

	}

}
