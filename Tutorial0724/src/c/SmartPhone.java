package c;

public class SmartPhone extends Phone {
	private boolean wifi;
	private boolean onoff;
	
	boolean getWifi() {return this.wifi;}
	boolean isOnoff() {return this.onoff;}
	void setOnoff(boolean onoff) {this.onoff=onoff;}
	
	//생성자 선언
	
	SmartPhone(String model,String color){
		super.color=color;//this는 이클래스 내의 멤버변수 super는 부모 클래스의 멤버변수, 물려 받았으므로 this super같은 것이다
		super.model=model;
	}
	//메서드 선언
	void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("와이파이 상태를 변경했어요");
	}
	void internet() {
		System.out.println("인터넷을 연결합니다");
	}
	//문1)
	void onAndOff() {
		//여기를 채우세요
		this.onoff=!this.onoff;
		System.out.println(this.onoff);//이 함수를 번갈아 호출할때마다 true->false->false
	}
}
