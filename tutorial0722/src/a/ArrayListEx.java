package a;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList();
		
		for(int i=0; i<5; i++) {
			list.add(new Board("제목"+(i+2), "내용"+(i+1), "글쓴이"+(i+1)));
		}
		//리스트의 크기 구하기
		int size = list.size();
		System.out.println("총 객체의 수 : "+size);
		System.out.println();
		//특정 인덱스의 객체 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+", "+b.getContent()+", "+b.getWriter());
		}
		System.out.println();
		//객체 삭제
		list.remove(2);
		list.remove(2);
		//enhanced for문으로 데이터 출력
		for(Board b:list) {
			System.out.println(b.getSubject()+", "+b.getContent()+", "+b.getWriter());
		}
	}

}
