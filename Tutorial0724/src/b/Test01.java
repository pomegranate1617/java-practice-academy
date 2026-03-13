package b;

public class Test01 {

	public static void main(String[] args) {
		Car c=new Car();
		Car d=new Car(5);
		
		c=new Car(23.4,"홍길동");
		c=new Car(23.4,"홍길동",34.5f);
		c=new Car("홍길동",23.4);
		c=new Car("홍길동",23.4,23.4f);
	//문1)
		//Tv객체 생성
		//인자로 100을 전달하고
		Tv tv=new Tv(100);
		//channelUP에서드와 channelDown
		//메서드를 호출하여
		for(int i=0;i<7;i++) {
			tv.channelUp();
		}
		System.out.println(tv.getChannel());
		//console에 107이 나온후
		//76이 나오도록하세요
		for(int i=0;i<31;i++) {
			tv.channelDown();
		}
		System.out.println(tv.getChannel());	
			
		
		
		
		//클래스명은 설계도면,형체가없다
		//무형,그래서 무조건 설계도면을 기반으로 제품을 생산한다(instantiate)
		//인스턴스화 한다=>메모리에 올라갔다,메모리가 heap
		//그 Heap 메모리에 생성된 객체를 stack 메모리에 그 주소를 가지고 있다
		//c가 stack 메모리에 위치해 있고 객체의 주소를 저장하고 있다
		//c를 참조변수라 한다(reference variable)
		
		//클래스명은 무조건 대문자로 시작하고 변수이름은 소문자로 시작한다
		//그래야 데이터 타입인지 변수인지 구별할 수 있다
		//클래스명과 동일한 함수를 생성자(constructor)라고 한다
		//그래서 생성자는 대문자로 시작한다
		//소괄호가 잇다, 함수호출이 일어나는 것과 같이 생성자 호출이 일어난다
		//겍체 생성시에만 호출된다
		//return 문이 없지만 void를 생성자 왼쪽에 적지 않느다
		

			

	}

}
