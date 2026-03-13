package b;

public class CarTest {

	public static void main(String[] args) {
		int a=4;//기본자료형에 4를 저장
		
		//참조 자료형
		Car b=new Car();//설계도면(Car)를 가지고 제품을 찍어낸다
		//제품을 객체(object)라한다
		//클래스 설계도면이라서 바로 접근을 하는것이 아니라 생성된 제품(객체, b)
		//b를 통해서 설계도며의 멤버에 접근한다
		b.setPrice(500);
		b.setName("홍길동");
		System.out.println(b.getPrice()+100);
		System.out.println(b.getName()+"입니다");
		//객체 지향 언어(object oriented program)는 데이터를 보호해야 한다.
		
		

	}

}
