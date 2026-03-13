package ch05_2;

public class CarTest {

	public static void main(String[] args) {
		Car a=new ChildCar();//추상메서드를 가진 클래스로 객체 생성 불가
		a.drive();
		a.run();
		a.eat();
		ICar b=new ChildICar();
		b.run();
		b.drive();
		b.eat();
	}

}
