package c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		String str [] = {"사랑1", "사랑3", "홍길동5", "김개똥15"};
		
		Map<String, String> map = new HashMap<>();
		for(int i=0; i<str.length; i++) map.put(""+(i+1), str[i]);
		Set<String> keys = map.keySet(); //key값들의 모임
		String r = "";
		int tt = 0;
		//문제1) map의 value의 문자열 마지막 문자열을 정수로 변환하고 총 누적 합을 구하시오
		for(String i:keys) { //각 key값들의 모임에서 하나씩 꺼내어 
			System.out.println(map.get(i)); //map의 get메서드 호출 시 key값을 전달하면 value를 준다
			r = map.get(i);
			r = r.substring(r.length()-1);
			tt += Integer.parseInt(r);
		}
		System.out.println(tt);
		
		//문제1) map의 value의 문자열 마지막 문자열을 정수로 변환하고 총 누적 합을 구하시오
		
		//마지막 문제입니다.
		//1) 클래스 생성 (Car)
		Map<String, Car> mapName = new HashMap<>();
		for(int i=0; i<str.length; i++) {
			mapName.put(""+(i+1), new Car(str[i]));
		}
		keys = mapName.keySet();
		tt = 0;
		for(String i:keys) {
			String rr = mapName.get(i).getName();
			rr = rr.substring(rr.length()-1);
			tt += Integer.parseInt(rr);
		}
		System.out.println(tt);
		//멤버변수명 name
	
	
		//Car 객체를 5개 생성하고 map에 저장하고 각각의 name은 마지막 문자열이 숫자이고
		//그 숫자를 정수로 변환하여 5개 객체의 name의 마지막 운자열을 정수로 변환한 총합을 구하기

		
		
//		//일반반복문과 enhanced for를 활용해서
//		//1+3+5+5 = 14가 나오도록 설계하세요
//		System.out.println("(문제1)========================");
//		String x = "";
//		int y = 0;
//		for(int i=0; i<str.length; i++) {
//			x = str[i].substring(str[i].length()-1, str[i].length());
//			y += Integer.parseInt(x);	
//		}
//		System.out.println(y);
//		System.out.println("=======enhanced for========");
//		x = "";
//		y = 0;
//		for(String i:str) {
//			x = i.substring(i.length()-1, i.length());
//			y += Integer.parseInt(x);
//		}
//		System.out.println(y);
//		System.out.println("(문제2)========================");
//		//문제2) 위의 list도 해결하세요 (문자열의 마지막 숫자를 정수로 변환하여 총합을 구하세요.) 
//		List<String> list = new ArrayList<>();
//		
//		//일반 반복문을 사용할 때는 get 메서드 사용합니다
//		//아래에 일반 반복문과 enhanced for문 사용
//		for(int i=0; i<str.length; i++) {
//			list.add(str[i]);
//		}
//		x = "";
//		y = 0;
//		for(int i=0; i<list.size(); i++) {
//			x = list.get(i);
//			x = x.substring(x.length()-1);
//			y += Integer.parseInt(x);
//		}
//		System.out.println(y);
//		System.out.println("=======enhanced for========");
//		x = "";
//		y = 0;
//		for(String i:list) {
//			x = i.substring(i.length()-1);
//			y += Integer.parseInt(x);
//		}
//		System.out.println(y);

	}

}
