package b;

public class MathTest2 {

	public static void main(String[] args) {
		Math [] mes = {new Math(),new Math(34,45),new Math(67,63,100)};
		mes[0].setKorea(34);
		mes[0].setEng(66);
		mes[0].setRural(88);
		mes[1].setRural(89);
		
		int total = mes[0].getKorea()+mes[0].getEng()+mes[0].getRural();
		System.out.println(total);
		for(Math i:mes) {
			System.out.println("국어:"+i.getKorea()+", 영어:"+i.getEng()+", 시골:"+i.getRural());
		}
		
		
		//m1, m2도 getter를 통해 데이터 값이 나오도록 하세요.
		
		//float rr = mes[].calcTotal(34.5f);
		//34.5를 3배한 결과를 반환함
		//System.out.println(rr);

	}

}
