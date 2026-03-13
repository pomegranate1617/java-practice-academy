package a;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(""+(i+1)*24);
		}//문제1) enhanced for문으로 list의 데이터 출력하기
		
		for(String i:list) {
			System.out.println(i);
		}
		
		List<Double> listD = new ArrayList<>();
		for(int i=0; i<10; i++) {
			listD.add((Math.random()*100)); //추가
			
		}//문제2) enhanced for문으로 list의 데이터 출력하기
		for(double i:listD) {
			System.out.println(i); //출력
		}
		
		String [] str = {"가","나","다","라","마","바"};
		char[] arr = {'B','C','E','F','1','2'};
		//enhanced for문으로 list의 데이터 출력하기
		for(String i:str) System.out.println(i);
		for(char j:arr) System.out.println(j);
		
		List<List<String>> listOfList = new ArrayList<>();
		for(int k=0; k<10; k++) {
			List<String> list2 = new ArrayList<>();
			for(int i=0; i<10; i++) { //List<String>에 10개의 데이터를 저장
				String data = "";
				for(int j=0; j<(int)((Math.random()*7+1));j++){ //문자열을 랜덤하게 몇개를 결합할지
					data += str[(int)(Math.random()*str.length)]; //배열에서 어떤 문자열 하나를 선택할지
				}
				list2.add(data); //랜덤한 문자열 하나씩 여러개(랜덤하게 반복되어 결합된)의 문자열을 List에 추가
			}
			listOfList.add(list2);
		}
		for(List<String> u : listOfList) {
			for(String r : u) {
				System.out.println(r);
			}
		}
		
		

	}

}
