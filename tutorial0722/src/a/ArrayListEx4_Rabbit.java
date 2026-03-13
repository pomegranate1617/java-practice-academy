package a;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4_Rabbit {
	
	public static void main(String[] args) {
		
		String str[] = {"홍길동", "김말자", "신소라", "김유라"};
		List<String> list = new ArrayList<>();
		for(String i:str) list.add(i);
		Rabbit r = new Rabbit();
		boolean v = r.contains(str, "신소라2");
		System.out.println(v);
		v = r.contains(list, "신소라");
		System.out.println(v);
		int v1 = r.containsCount(list, "신소라");
		System.out.println(v1);
		
	}
}
//문제1) Dog 클래스 생성

//문제2) main 함수에서는 정수형 배열과 정수형 List를 활용하여 똑같이 만드세요
