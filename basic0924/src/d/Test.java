package d;

public class Test {

	public static void main(String[] args) {
		Temp<String> t1=new Temp<>();
		String[]str= {"홍길동","김말자","김개똥"};
		t1.init(str);
		
		t1.add("홍길동",str.length-1);
		
//		Temp<Integer> t2=new Temp<>();
//		t2.add(5);
		for(String i:t1.getTs())System.out.println(i);
		
		//Float를 사용하여 Temp클래스를 사용해보세요.
		Temp<Float> t2=new Temp<>();
		Float []ff= {12.3f,34.5f,23.7f};
		t2.init(ff);
		t2.add(9.6f, str.length-1);
		
		for(float i:t2.getTs())System.out.println(i);
		//템플릿을 사용해보고자 했던문제
		//add를 만들어 보고 싶었는데
		//배열은 크기가 고정되어 있어서
		//추가는 불가능
		
		//생성자로 변경하면 init를 호출하지 않아도 되므로 그렇게 되도록 해보세요.
	}

}
