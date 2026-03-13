package ch16;

public class LambdaEx1 {

	public static void main(String[] args) {
		Car a = new Car();
		//함수형 인터페이스(Functional Interface)는 하나의 추상메서드만 가지고 있고
		//추상 메서드가 하나이므로 이름없는 함수(익명함수(Anonymous/람다)를 사용 가능
		//여러개가 있다고 하면 어떻게 이름없는 람다의 구별이 가능할지?
		
		int u = a.v((int x, int y) ->{
			int result = x+y;
			System.out.println("result : "+result);
			return result;
		});
		System.out.println("u1="+u);
		u = a.v((x,y)->{
			int result = x-y;
			System.out.println("result : "+result);
			return result;
		});
		System.out.println("u2="+u);

	}

}
