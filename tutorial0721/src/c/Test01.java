package c;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		String str [] = {"사랑1", "사랑3", "홍길동5", "김개똥15"};
		
		//일반반복문과 enhanced for를 활용해서
		//1+3+5+5 = 14가 나오도록 설계하세요
		System.out.println("=====(문제1)================");
		String x = "";
		int y = 0;
		for(int i=0; i<str.length; i++) {
			x = str[i].substring(str[i].length()-1, str[i].length());
			y += Integer.parseInt(x);	
		}
		System.out.println(y);
		System.out.println("=======enhanced for========");
		x = "";
		y = 0;
		for(String i:str) {
			x = i.substring(i.length()-1, i.length());
			y += Integer.parseInt(x);
		}
		System.out.println(y);
		System.out.println("=====(문제2)================");
		//문제2) 위의 list도 해결하세요 (문자열의 마지막 숫자를 정수로 변환하여 총합을 구하세요.) 
		List<String> list = new ArrayList<>();
		
		//일반 반복문을 사용할 때는 get 메서드 사용합니다
		//아래에 일반 반복문과 enhanced for문 사용
		for(int i=0; i<str.length; i++) {
			list.add(str[i]);
		}
		x = "";
		y = 0;
		for(int i=0; i<list.size(); i++) {
			x = list.get(i);
			x = x.substring(x.length()-1);
			y += Integer.parseInt(x);
		}
		System.out.println(y);
		System.out.println("=======enhanced for========");
		x = "";
		y = 0;
		for(String i:list) {
			x = i.substring(i.length()-1);
			y += Integer.parseInt(x);
		}
		System.out.println(y);

	}

}
