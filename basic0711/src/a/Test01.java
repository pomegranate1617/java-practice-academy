package a;


public class Test01 {
	
	public static String r(int a,int b,float c,String d){
		 System.out.println("r함수가 호출되었어요");
		 return c+"사랑"+(a+b+c+d)+d;
	}

	public static void main(String[] args) {
		System.out.println("r함수 호출되기전=>1)");
		String u= r(1,100,3.4f,"홍길동");
		System.out.println("r함수 호출후=>3)"+u);
		
	
		

	}

}
