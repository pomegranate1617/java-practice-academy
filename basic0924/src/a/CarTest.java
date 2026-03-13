package a;

public class CarTest {

	public static void main(String[] args) {
		Car c=new Car(5);
		Car d=new Car();
		Car f=new Car(5,"노랑");
		
		System.out.println(f.getColor()+","+f.getPrice());
		Truck t=new Truck();
		String r=t.walk(3);
		System.out.println(r);
		
	}

}
