package a;

public class Test01 {

	public static void main(String[] args) {
		SmartPhone a=new SmartPhone("x98","빨강");//클래스이름과 동일한 특이한 생성자
		System.out.println(a.getColor()+","+a.getModel());
		
		
		//색상은 setter로 호출하고 
		//결과를 출력하세요
//		b.setColor("빨강");
//		System.out.println(b.getColor()+b.getModel());
		
		SmartPhone b=new SmartPhone("x98");
		System.out.println(b.getColor()+b.getModel());
		b.call();
		
		float f=3;//자동형변환(up casting)
		int ii=(int)3.4f;//down casting 강제로 해야된다
		Phone pp=new SmartPhone("사랑");// 자동 업캐스팅
				//부모가 자식객체를 가리킬수 있다(저장 할수 있다)
				//다형성(polymorphism)
		SmartPhone rr=(SmartPhone)new Phone();

	}

}
