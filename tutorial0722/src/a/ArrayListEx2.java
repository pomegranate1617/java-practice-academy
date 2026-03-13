package a;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList();
		
		for(int i=0; i<5; i++) {
			list.add(new Board());
		}
		
		int index = 0;
		for(Board i:list) {
			i.setSubject("주제"+(index+1));
			i.setContent("내용"+(index+1));
			i.setWriter("작성자"+(index+++1));
		}
		//enhanced for문으로 데이터 출력
		for(Board b:list) {
			System.out.println(b.getSubject()+", "+b.getContent()+", "+b.getWriter());
		}
	}

}
