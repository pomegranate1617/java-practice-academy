package c;

public abstract class Animal {
	//일반메서드
	void breathe() {
		System.out.println("숨을 쉰다");//동물은 누구나 숨을 쉰다
	}
	//추상메서드

	
	abstract void sound();//동물마다 사람,강아지,고양이는 각각의 소래내는 것이 다르다
	//소리를 안낼수는 없다
	
	//하나이상의 추상 메서드가 있으면 추상 클래스
	//모든 메서드가 추상메서드 interface
	//인터페이스는 abstract를 생략가능
	
	//추상메서드는 무조건 상속받는 클래스에서 강제로override를 해서 기능을 구현해야되고
	//인터페이스는 implement로 상속(구현)을 해서 클래스를 생성하면서 추상메서드를 전체를 override해서 구현부를 채원야 한다
	//인터페이스는 규약만 있다
	//usb같은 것이 인터페이스다
	//usb메모리나,usb카메라,usb의 4개의 핀만 약속해놓고 기능은 각자 알아서 구현해라
	//인터페이스에서 구현부가 있는 베서드를 만들고 싶을 때가 잇다. default를 추가해서 구현한다

}
