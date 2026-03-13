package functionalinterface1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test01 {

	public static void main(String[] args) {
		
		Function<Integer, Board> makeBoard = x->{
			Board b = new Board("제목:"+x,"내용:"+(x*x),"작성자:"+(x*x*x));
			return b;
		};
		//arr을 순회하면서 makeBoard 메서드 호출하고 반환되는 것을 List에 담으세요
		int [] arr = {2,3,4,5,6};
		
		List<Board> boardList = new ArrayList<>(); //List 생성하기
		
		for(int i:arr) boardList.add(makeBoard.apply(i)); //makeBoard 람다식에 arr에서 하나씩 던져서 받고 boardList에 추가하기
		
		for(Board i:boardList) { //boardList 출력하기
			System.out.println(i.getSubject()+","+i.getContent()+","+i.getWriter());
		}
		
		//문제1) 9000보다 큰 것의 개수를 구하세요
				long [] arr1 = {9007l,5600l,10000l, 57890l, 3l};
				
				Predicate<Long> isOver9000 = i-> i>9000;//boolean 타입 반환 (predicate)
				
				System.out.println();
				int cnt = 0;
				for(long i:arr1) if(isOver9000.test(i)) cnt++;
				System.out.println(cnt);
	}
}
