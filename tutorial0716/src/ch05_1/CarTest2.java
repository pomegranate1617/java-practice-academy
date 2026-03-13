package ch05_1;

public class CarTest2 {
	public static void f(Car r) {
		System.out.println("f함수에서 truck이 실행해요");
		r.drive();
	}
	
	
	public static void main(String[] args) {
		Car a=new Car();
		Car b=new Truck();
		Car c=new Taxi();
		Car d=new Bus();
		f(b);
		f(c);
		f(d);
		Car[] cars=new Car[4];
		cars[0]=a;
		cars[1]=b;
		cars[2]=c;
		cars[3]=d;//다형성에 의해 배열에 자식 객체를저장 가능
		Car Cars[]= {
				new Car(),new Car(),
				new Truck(),new Car(),
				new Car(),new Bus(),
				new Car(),new Taxi()
				

		
		
		
		

	};

}
}
