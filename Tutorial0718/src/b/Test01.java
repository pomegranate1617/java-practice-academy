package b;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//1)Yellow객체 생성
		Yellow y=new Yellow();
		
		String[] str= {"홍","길동","바보","아름다운","감다리","오다리"};
		//2)
		//yellow객체.beatiful(배열의 각각의 성분)
		String r="";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()%2==1) {
				r+=y.beautiful(str[i]);
				
			}
			
					
		}
		System.out.println(r);
		
		r="";
		for(String i:str) {
			if(i.length()%2==1) {
				r+=y.beautiful(i);
				
			}
		}
		System.out.println(r);
		
		
		//여기서 반복문을 사용하여 문자열의 길이가 홀수인것만 beautiful
		//메서드 호출
		//str배열에서 데이터 하나씩 꺼내어 문자열의 길이가 홀수 인것만
		//beautiful메서드 호출후 beautiful메서드에서는 기능이
		//홀수인 문자열에 "사랑"이라는 문자아ㅕㄹ을 결합한 결과를 반환gka
		//일반 반복문과 enhanced for문 둘다 사용함
		
		//3)2번이 완성되면 "사랑"은 그 메서드에서 고정되었으므로
		//호출하는 곳에서 두번째 인자로 전달할 수 있도록 하여 사용자가
		//필요에 따라 결합되는 문자열이 변경되도록 설계하세요
		//여기에서 overloading이 나옵니다.
		
		r="";
		for(String i:str) {
			if(i.length()%2==1) {
				r+=y.beautiful(i);
				
			}
		}
		System.out.println(r);
		r="";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()%2==1) {
				r+=y.beautiful(str[i],"마음");
				
			}
		}
		System.out.println(r);
		
		r="";
		for(String i:str) {
			if(i.length()%2==1) {
				r+=y.beautiful(i,"증오");
			}
		}
		System.out.println(r);
		
		
		
		int vv=y.toss(3.4f);//3.4*2
		System.out.println(vv);
		vv+=y.toss(3.4);//3.4*5=>정수로 변환
		System.out.println(vv);
		vv+=y.toss("사랑",7);//사랑문자열을 7번 결합하고 그 결합한 문자열의 길이
		System.out.println(vv);
		vv=0;
		vv+=y.toss(3);//10의 3승, 2를 전달하면 10의 제곱
		System.out.println(vv);//출력
		
		

	}

}
