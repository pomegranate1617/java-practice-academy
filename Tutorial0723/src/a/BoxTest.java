package a;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> b=new Box<>();
		b.drive(4);
		Box<Integer> b1=new Box<>(56);
		//문자열과 Float타입도 해보세요
		Box<Float> b2=new Box<>(4.7f);
		Box<String> b3=new Box<>("사과");
		
		
		System.out.println(b1.getContent());
		System.out.println(b2.getContent());
		System.out.println(b3.getContent());
	}
	

}
