package a;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {

			String [] str = {"가","나","다","라","마","바"};
			List<String> list2 = new ArrayList<>();
			for(int i=0; i<10; i++) { //List<String>에 10개의 데이터를 저장
				String data = "";
				int howManyIterate = (int)((Math.random()*7+1));
				System.out.println("반복횟수 : "+howManyIterate);
				for(int j=0; j<howManyIterate;j++){ //문자열을 랜덤하게 몇개를 결합할지
					int randIdx = (int)(Math.random()*str.length);
					System.out.println("randIdx : "+randIdx+", str[randIdx] : "+str[randIdx]);
					data += str[randIdx]; //배열에서 어떤 문자열 하나를 선택할지
				}
				list2.add(data); //랜덤한 문자열 하나씩 여러개(랜덤하게 반복되어 결합된)의 문자열을 List에 추가
			}
			for(String r : list2) System.out.println(r);
	}

}
