package g;

public class Test01 {

	public static void main(String[] args) {
		
		Sora x = i-> i.length(); //i 파라미터에는 실수(float)
		//반환되는 타입은 정수(integer)
		int r = x.t("곽은지");
		System.out.println(r);

	}

}
