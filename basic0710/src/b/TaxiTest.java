package b;

public abstract class TaxiTest {

	public static void main(String[] args) {
		Taxi a=new Taxi();
		a.setAvg(32.7f);
		a.setEng(12.4f);
		a.setMath(11.7f);
		a.setKorea(35.4);
		a.setTotal(5);
		System.out.println(a.getAvg());
		System.out.println(a.getMath());
		System.out.println(a.getKorea());
		System.out.println(a.getEng());
		System.out.println(a.getTotal());
		

	}

}
