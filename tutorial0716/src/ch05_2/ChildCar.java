package ch05_2;

public class ChildCar extends Car{
	
	@Override
	void drive() {
		System.out.println("아들차가 운전해요");
	}
	
	
	@Override
	void eat() {
		System.out.println("아들차가 사탕을 먹어요");
	}
	
	
	@Override
	void run() {
		System.out.println("아들차가 달려요");
	}

}
