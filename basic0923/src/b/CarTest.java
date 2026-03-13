package b;

public class CarTest {

	public static void main(String[] args) {
		//클래스는 데이터 자료형(타입),클래스 명은 항상 대문자로 시작하는 것을 원칙으로 한다
		//클래스를 사용하는 변수는 소문자로 시작한다(관례)
		//클래스는 형체가 없다, 설계도면, 붕어빵틀(형체가 있지만 붕어빵을 제조)
		//Car설계도면이 있으면 이 Car설계도를 가지고 차를 생산함
		//생산하는데 Car설계도면으로 차를 생산하는데 Building을 만들지는 않는다.
		//제품을 생산하는 과정을 객체를 생성한다(instance화 한다)instantiation
		//메모리에 올라갔다는 뜻
		//그 메모리가 heap메모리에 올라갔다
		//메모리에 올리기 위해 객체 생성하려면 new를 사용하고
		//클래스명과 동일한 함수를 생성자(constructor)라고 한다
		Car car=new Car();//new Car()객체는 Heap에 위치해 있고
		//car 변수가 그 heap의 메모리 주소를 저장하고 있다,가리키고 있다
		//car변수를 그냥 변수라 하지않고 참조변수(reference)라 한다
		//생성자의 인자가 없는 것을 기본 생성자라 하고
		//인자가 있는 생성자도 있는데 개발자가 인자가 있는 일반 생성자를 만들면 기본 생성자는 자동으로 만들어 주다가
		//개발자가 기본생성자 말고 다른 생성자를 만들면 기본 생성자마저 만들어주지 않는다.
		//멤버변수와 함수의 꾸러미를 클래스라 하고
		//함수를 메서드라 합니다.
		//멤버변수(field),멤버변수는 데이터 이므로 외부에서 함부로 접근해서 수정될 수 있으면 안되므로
		//private접근제한자로 지정하고 getter,setter를 통해서 접근한다.
		String[]str= {"사랑합니다","증오","권기현","전별","김유라","나신영","그린아카데미"};
		String r=car.mm("사랑", 7);
		System.out.println(r);
		//반복문을 사용하여 mm을 호출하는데 첫버째 인자를 문자열 전달, 두번째 인자로는 문자열의 길이 전달하고 반환되는 문자열을
		String [] result=new String[str.length];//를 저장하고 출력하세요.
		//선생님정답
		int idx=0;
		for(String i:str) result[idx++]=car.mm(i,i.length());
		for(int i=0;i<str.length;i++)result[i]=car.mm(str[i], str[i].length());
		
		for(String i:result)System.out.println(i);
		for(int i=0;i<result.length;i++)System.out.println(result[i]);
		
		
		//내풀이
		for(int i=0;i<str.length;i++) {
			result[i]= car.mm(str[i],str[i].length());
		}
		System.out.println(result);
		
		for(String i:result) {
			System.out.println(i);
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
			
			
		
	}

}
