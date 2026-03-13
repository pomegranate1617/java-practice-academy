package a;

import java.util.ArrayList;
import java.util.List;

public class Rabbit {

	public boolean contains(String [] a, String data) {
		//문제1) 반복문을 활용하여 data가 배열에 있으면 true를 반환하고
		//		없으면 false를 반환하기
		//같은 이름이 몇개인지 확인하는 방법은?
		boolean r = false;
		for(String i : a) {
			if(i.equals(data)) {
				r = true;
				break;
			} 
		}
		return r;
	}
	

	public boolean contains(List<String> a, String data) {
		//문제1) 반복문을 활용하여 data가 배열에 있으면 true를 반환하고
		//		없으면 false를 반환하기
		boolean r = false;
		for(String i:a) { //반복문을 순회하면서 이름이 같으면 cnt값을 1씩 증가시킴
			if(i.equals(data)) {
				r = true;
				break;
			}
		}
		return r;
	} //메소드 overloading
	
	public int containsCount(List<String> a, String data) {
		//문제1) 반복문을 활용하여 data가 배열에 있으면 true를 반환하고
		//		없으면 false를 반환하기
		int cnt = 0;
		for(String i:a) { //반복문을 순회하면서 이름이 같으면 cnt값을 1씩 증가시킴
			if(i.equals(data)) {
				cnt++;
				break;
			}
		}
		return cnt;
	}
}
