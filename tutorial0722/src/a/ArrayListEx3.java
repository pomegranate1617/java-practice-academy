package a;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList();
		
		for(int i=0; i<5; i++) {
			list.add(new Board());
		}
		Board [] boards = new Board[list.size()];
		int index = 0;
		for(Board i:list) {
			i.setSubject("주제"+(index+1));
			i.setContent("내용"+(index+1));
			i.setWriter("작성자"+(index+1));
			index++;
		}
		list.clear(); //데이터 삭제
		boolean dataCheck = list.isEmpty();
		//일반적인 메소드에 is가 붙으면 true/false(boolean 타입)을 반환함
		System.out.println(dataCheck); //데이터가 비어있는지 확인
		System.out.println("==========데이터 clear===========");
		for(int i=0; i<5; i++) {
			list.add(new Board());
		} //5개의 데이터 추가
		//문제1-1) 일반반복문으로 변경하기
		for(int i=0; i<5; i++) {
			Board b = list.get(i);
			b.setSubject("주제"+(index+1));
			b.setContent("내용"+(index+1));
			b.setWriter("작성자"+(index+++1));
			list.add(b);
			
//			list.get(i).setSubject("주제"+(i+1));
//			list.get(i).setContent("내용"+(i+1));
//			list.get(i).setWriter("작성자"+(i+1));
//			index++;
		}
		for(Board b:list) {
			System.out.println(b.getSubject()+", "+b.getContent()+", "+b.getWriter());
		}
		//문제1-2) 일반반복문으로 변경하기
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getSubject()+", "+list.get(i).getContent()+", "+list.get(i).getWriter());
		}
		
		//문제2) List의 데이터를 하나씩 꺼내어 객체 배열에 추가함
		
		String [] str = {"가", "나", "다", "라", "마", "바"};
		List<String> list2 = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			String merge = "";
			for(int j=0; j<(int)(Math.random()*10+1); j++) {
				int randIdx = (int)(Math.random()*str.length);
				merge += str[randIdx];
			}
			list2.add(merge);
		}
		list2.add("홍길동");
		boolean u = list2.contains("홍길동"); //홍길동이 포함(contains)되어 있는지 확인하는 메서드
		System.out.println(u);
		System.out.println("=====================");
		for(String i:list2) System.out.println(i);
		
		
		for(int i=0; i<boards.length; i++) {
			boards[i] = list.get(i);
		}
		index = 0;
		for(Board i:boards) {
			i = list.get(index);
		}
		
	}

}
