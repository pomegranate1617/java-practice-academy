package b;

public class ㅆㄷㄴㅅ01 {

	public static String uu(int a,int b,String r) {//함수선언, 인자를 3개를 받아요(첫번째, 정수
		//두번째(정수),세번째는 문자열을 받아서
		//함수명은 uu고 반환되는 타입은 문자열
		
		if(a%b==0) return "사랑";//첫번째 인자값이 두번째 인자값의 배수이면 사랑을 호출한 main함수로 반환
		else return "행복";//그렇지 않으면 행복을 반환
	}
	public static void main(String[] args) {
		
		int jaj=5; //정수형 변수 선언후 값 5를 저장
		int uav=11;//정수형 변수 uav를 선언함과 동시에 11값을 저장
		String kk="사랑합니다"; //문자열변수 kk를 선언과 동시에 "사랑합니다:"를 저장
		String rr=uu(jaj,uav,kk);//rr은 uu를 저장
		//위에서 선언한 uu함수를 호출시 첫번째는 정수, 두번째는 정수, 세번째는 문자열을 전달하고 uu함수에서 계산된 결과를 받아서	
		//문자열로 선언된rr변수에 반환된 값을 저장		
		System.out.println(rr);//rr을 출력
	

	}

}
