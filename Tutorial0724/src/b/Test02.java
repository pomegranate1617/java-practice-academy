package b;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		Tv t=new Tv();		
	    String a=t.pongpong(45);
	    System.out.println(a);
	    System.out.println("---------------------");
		//기능은 "홍길동을 45번 반복하여 문자열 결합하고
		//결합된문자열의 길이가 4의 배수이면 "짝수"를반환하고
		//그렇지 않으면 "홀수"를 반환함
		//반환된 값을 출력하세요 		
		int arr[][]= {
				{23,56,78,99,100},//반복횟수
				{2,3,4,5,6}//배수
		};
		String [] str= {"홍","말자","김","서방","김유라"};//어떤 것을 결합할거냐
		// arr 배열의 데이터를 하나씩 꺼내어 pongpong 메서드
		//호출시 인자로 값을 전달하고 반환되는문자열을 list에 저장 
		List<String> list=new ArrayList<>();
		for(int i =0;i<arr[0].length;i++) list.add(t.pongpong(str[i], arr[0][i]));
		for(String i: list) System.out.println(i);
		System.out.println("====================");
		list=new ArrayList<>();
		for(int i =0;i<arr[0].length;i++) list.add(t.pongpong(arr[1][i], str[i], arr[0][i]));
		for(String i: list) System.out.println(i);
		System.out.println("==========클래스사용한 출력=============");
		//클래스 생성후 메서드 호출 
		List<StringAndInteger> l=new ArrayList<>();
		for(int i =0;i<arr[0].length;i++) {//생성자를 통해 멤버변수의 값을 설정하고 리스ㅓ트에 추가 
			StringAndInteger b=   new StringAndInteger();
			b.setTimes(arr[1][i]);
			b.setIterateCnt(arr[0][i]);
			b.setName(str[i]);
			l.add(b);
		}
		list=new ArrayList<>();
		for(StringAndInteger i: l) {//5개의 리스트에서 하나씩 객체를 꺼내어 pongpong함수 호출 
			list.add(t.pongpong(i.getTimes(),i.getName(), i.getIterateCnt()));
		}
		for(String i: list) System.out.println(i);
	}

}
