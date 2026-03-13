package a;

public class SmartPhone extends Phone {
	SmartPhone(String model,String color){
		super();//부모 생성자 호출,맨위에 있어야 합니다
		this.color=color;
		this.model=model;
		System.out.println("자식 클래스의 문자열 2개를 받는 생성자호출~~~");
		
	
	}
	SmartPhone(String model){
		super("빨강");//생성자 호출은 항상 첫번째 줄에 할 수 있다
		this.model=model;
//		this(4); 생성자 호출은 항상 첫번째 줄에만 할 수 있다
		
		
	}
	@Override //재정의 한다,부모와 함수의 구조는 동일하고 기능부({})
	//안의 내용을 부모것을 무시하고 상속받는 자식에서 
	//기능을 다시 만들어 사용하겠다,오버로딩,오버라이딩 구분중요
	void call() {
		super.call();//부모의 멤버 연산자(.)를통해 호출한다.
		System.out.println("스마트폰으로 전화한다");
		
	}
	
}
