package list01;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		float [] arr = {11.2f, 45.6f, 99.7f};
		
		//여기에 List를 선언하고 데이터를 arr에서 하나씩 꺼내어 2배한 것을 추가하세요.
		List<Float> list = new ArrayList<>();
		for(float i:arr) list.add(i*2);
		for(float i:list) System.out.println(i);
		
		
		
		
		
		
		
		
		
//		List<Float> list = new ArrayList<>();
//		for(int i=0; i<arr.length; i++) list.add(arr[i]*2);
//		System.out.println(list);
		
		list.clear();
		for(float i:arr) list.add(i*2);
		//여기에서 list의 데이터를 출력하세요
		System.out.println(list);
		
		//문제2) 문자열 배열 선언하고 아무 문자열 5개를 저장한 후
		//정수형 리스트에 문자열의 길이를 저장
		//리스트의 숫자의 총합을 구하세요
		
		String [] str = {"가나", "다라마", "바","사아","자차카타","파하"};
		List<Integer> list1 = new ArrayList<>();
		int sum = 0;
		for(int i=0; i<str.length; i++) {
			list1.add(str[i].length());
			sum += list1.get(i);
		}
		System.out.println(sum);
		
		System.out.println("=======================================");
		
		//문제3) 마지막 문제, 클래스 생성(클래스명 Red)
		//멤버변수 (정수 rice, float blue, String coco)
		//getter, setter
		//객체 배열 5개 생성하고, 멤버변수를 setter로 다 채우고
		Red [] red = new Red[5]; //공간을 만든 것
		for(int i=0; i<5; i++) {
			red[i] = new Red(); //객체를 생성한 것
			red[i].setRice((i+1)*5);
			red[i].setBlue((i+1)*1.5f);
			red[i].setCoco("바보"+(i+1));
		}
		//enhanced for문을 활용하여 rice+blue+coco.length()를 하여
		List<Integer> redList = new ArrayList<>();
		for(Red i:red) {
			redList.add(i.getRice()+(int)(i.getBlue())+i.getCoco().length());
		}
		
		for(int i:redList) System.out.println(i);
		//각각의 객체마다 실수 또는 정수로 나올 것이고
		//각각의 정수를 정수형 list에 저장
		//결과 출력
	}
	

}
