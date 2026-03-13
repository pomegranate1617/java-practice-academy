package a;

public class Student {
	private String name; //field(멤버변수, 필드), 속성(attribute)
	private int no;
	
	Student(){} //기본생성자
	
	Student(String name){ //문자열 하나를 받는 생성자
		this.name=name;
	}
	
	Student(String name, int no){ //문자열 하나와 정수를 받는 생성자
		this.name = name;
		this.no = no;
	}
	
	String getName() { //name에 대한 getter
		return this.name;
	}
	
	int getNo() {return this.no;} //no에 대한 getter
	
	void study() { //함수(method)
		System.out.println("학생이 공부하다");
	}
	
	//문제1) 축구를 한다, 학생 이름과 번호를 받아서 번호가 홀수번이면 "골을 넣었어요"를 반환하고
	//그렇지 않으면 "노골이에요"를 반환한다

//	void doFootball() {
//		if(no%2==1) {
//			System.out.println("골을 넣었어요");
//		}else System.out.println("노골이에요");
//	}
	
	String doFootball(String name, int no) {
		String result ="";
		if(no%2==1) result =name+"은(는) 골을 넣었어요";
		else result = name+"은(는) 노꼴이에요";
		return result;
	}
	//문제2) main함수에서 호출하여 작성하세요

}
