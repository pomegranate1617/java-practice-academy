package a;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4 {

	public static boolean contains(String [] a, String data) {
		//문제1) 반복문을 활용하여 data가 배열에 있으면 true를 반환하고
		//		없으면 false를 반환하기
		//같은 이름이 몇개인지 확인하는 방법은?
		boolean r = false;
		int cnt = 0;
		for(String i : a) {
			if(i.equals(data)) {
				cnt++;
				break;
			} 
		}
		return r;
	}
	

	public static int contains(List<String> a, String data) {
		//문제1) 반복문을 활용하여 data가 배열에 있으면 true를 반환하고
		//		없으면 false를 반환하기
		int cnt=0;
		for(String i:a) { //반복문을 순회하면서 이름이 같으면 cnt값을 1씩 증가시킴
			if(i.equals(data)) {
				cnt++;
				break;
			}
		}
		return cnt;
	} //메소드 overloading
	
	public static void main(String[] args) {
		
		String str[] = {"홍길동", "김말자", "신소라", "김유라"};
		List<String> list = new ArrayList<>();
		for(String i:str) list.add(i);
		boolean v = contains(str, "신소라2");
		System.out.println(v);
		int v1 = contains(list, "신소라");
		System.out.println(v1);
		System.out.println("홍길동".equals("홍길동"));
		
	}

}
