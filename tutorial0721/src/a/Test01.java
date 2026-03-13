package a;

public class Test01 {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동",5); //객체의 주소가 0x100
		Student s2 = new Student("김말자",10); //객체의 주소가 0x200
		
		System.out.println(s1);
		System.out.println(s2);
		//hash code가 서로 다르므로 메모리 공간이 서로 다르다.
		System.out.println();
		//s2 = s1; //참조 타입이라 주소가 복사됨.
		//s1의 0x100번지가 s2로 저장되므로 
		//s2는 원래 0x200이었는데 갑자기 s1의 주소인 0x100으로 변경되었다.
		
		//학생 번호도 같이 나오도록 하세요.
		
		System.out.println("이름 : "+s1.getName()+", 번호 : "+s1.getNo());
		System.out.println("이름 : "+s2.getName()+", 번호 : "+s2.getNo());
		System.out.println();

		int [] arr = {11,23,44,67,78};
		for(int i=0; i<arr.length; i++) {
			System.out.println(s1.doFootball("홍길동", arr[i]));
		}
		System.out.println("=======enhanced for=======");
		for(int i:arr) {
			System.out.println(s2.doFootball("김말자", i));
		}
	}

}
