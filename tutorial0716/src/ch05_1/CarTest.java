package ch05_1;

public class CarTest {
	public static void f(Truck r) {
		System.out.println("f함수에서 truck이 실행해요");
		r.drive();
	}
	public static void f(Bus r) {
		System.out.println("f함수에서  bus가 실행해요");
		r.eat();
	}
	public static void f(Taxi r) {
		System.out.println("f함수에서 taxi가 실행해요");
		r.run();
	}//overloading (오버로딩) 함수간의 오버로딩 관계가 있다
	//함수명은 동일한데 함수매개변수의 갯수가 다르거나 데이터 타입이 다르면 구별가능

	public static void main(String[] args) {
		Car a=new Car();
		a.drive();
		
		Truck b=new Truck();
		b.drive();
		b.fire();
		
		Taxi t=new Taxi();
		Bus s=new Bus();
		t.run();
		s.eat();
		f(b);
		f(s);
		f(t);
		
		

	}

}
