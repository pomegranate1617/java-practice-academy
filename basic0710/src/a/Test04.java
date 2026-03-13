package a;

public class Test04 {

	public static void main(String[] args) {
		String strName[]= {
				
				"강민석님",
				"곽은지님",
				"김유라미인",
				"김찬우장신이다",
				"나신영 화가",
			    "이건호님이다",
			    "박민어제왔어요",
				"조형우 오늘 왔어요",
				"권기현 타이핑 연습이필요해요"
				
				
		};
		int v=0;
		for(int i=0;i<strName.length;i++) v+=strName[i].length();
		System.out.println("strName의 0번째의 문자열=>"+strName[0]);
		v+=strName[0].length();
		System.out.println("strName의 0번째의 문자열의길이=>"+v);
		System.out.println("strName의 1번째의 문자열=>"+strName[1]);
		v+=strName[1].length();
		System.out.println("strName의 1번째의 문자열의길이=>"+v);
		
//		v+=strName[0].length();
//		v+=strName[1].length();
//		v+=strName[2].length();
//		v+=strName[3].length();
		System.out.println(v);
		

	}

}
