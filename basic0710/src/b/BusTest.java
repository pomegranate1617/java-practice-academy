package b;

public class BusTest {

	public static void main(String[] args) {
        int a=4;
		
		Bus b=new Bus();
		
		b.setuu(500);
		b.setvv("홍길동");
		b.setru("aa");
		b.setzk(3.2f);
		
		System.out.println(b.getuu()+100);
		System.out.println(b.getvv()+"입니다");
		System.out.println(b.getru()+"입니다");
		System.out.println(b.getzk()+100);
		
		
	}

}
