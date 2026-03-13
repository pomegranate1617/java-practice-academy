package b;

public class YellowTest {

	public static void main(String[] args) {
		Yellow yellow=new Yellow();
		yellow.setBlue(6);
		yellow.setRed(4.8f);
		yellow.setBlock("합니다");
		
		String i=yellow.getBlue()+yellow.getRed()+yellow.getBlock();
		System.out.println(i);
		
		String v=yellow.drive("홍길동",7);
		System.out.println(v);
		

	}

}
