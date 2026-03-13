package b;

public class MathTest {

	public static void main(String[] args) {
		Math m = new Math();
		Math m1 = new Math(34,45); //korea, eng
		Math m2 = new Math(34,45,100); //korea, eng, rural
		Math [] mes = {m,m1,m2};
		m.setKorea(34);
		m.setEng(66);
		m.setRural(88);
		m1.setRural(100);
		
		int total = m.getKorea()+m.getEng()+m.getRural();
		System.out.println(total);
		for(Math i:mes) {
			System.out.println("국어:"+i.getKorea()+", 영어:"+i.getEng()+", 시골:"+i.getRural());
		}
		
		
		//m1, m2도 getter를 통해 데이터 값이 나오도록 하세요.
		
		float rr = m.calcTotal(34.5f);
		//34.5를 3배한 결과를 반환함
		System.out.println(rr);
		
//		String str[] = {"한국사","영어","수학사","미술선생님","영어선생님"};
//		//str에서 반복문을 활용하여 calcTotal에 인자로 전달할 때 문자열의 길이를
//		//4배한 결과를 전달하고 반복문을 다 돌면서 호출한 결과의 반환된 값을 누적하여
//		//결과를 여기에서 출력하세요
//		float re = 0.0f;
//		for(int i=0; i<str.length; i++) {
//			re+= m.calcTotal(str[i].length()*4);
//		}
//		System.out.println(re);
//		
//		re=0.0f;
//		for(String i:str) {
//			re+= m.calcTotal(i.length()*4);
//		}
//		System.out.println(re);
//	}
		
		String[][] str= {
				{"한국사7","영어8","수학사9","미술선생님3","영어선생4"},
				{"한국사12","영어1","수학사1","미술선생님1","영어선생1"},
				{"한국사22","영어22","수학사22","미술선생님22","영어선생22"},
				{"한국사33","영어333","수학사33","미술선생님33","영어선생33"},
				{"한국사567","영어234","수학사1234","미술선생님111","영어선생222"}
		};
		
		float re = 0.0f;
		String x="";
		int y = 0;
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[0].length; j++) {
				//re+= m.calcTotal(str[i][j].length()*4);
				x = str[i][j].substring(str[i][j].length()-1, str[i][j].length());
				y += Integer.parseInt(x);
			}	
		}
		System.out.println(y);
		
		re=0.0f;
		x="";
		y=0;
		for(String [] i:str) { //2차원 문자열 배열에서 하나씩 꺼내어 일차원 배열이고
			for(String j:i) { //1차원 배열에서 문자열 하나씩 꺼내어 calcTotal 메서드 호출 시 문자열의 길이의 4배를 전달
				//re += m.calcTotal(j.length()*4);
				x = j.substring(j.length()-1, j.length());
				y+= Integer.parseInt(x);
			}
		}
		System.out.println(y);

	}
		
}
