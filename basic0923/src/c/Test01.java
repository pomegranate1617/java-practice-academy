package c;

public class Test01 {

	public static void main(String[] args) {
		int [] math= {20,30,40,50};
		
		Yellow y=new Yellow();
		y.setYy(math);
		for(int i:y.getYy())System.out.println(i);
		//문1)math의 총합을 저장할 수 있는 정수형 변수 total을 Yellow클래스에 추가하고
		//getter,setter생성하고 math의 총합을 setter로 전달하 후 getter로 출력하세요.		
//		int a=0;
//		for(int i=0;i<math.length;i++) {
//			a+=math[i];
//		}
//		y.setTotal(a);
		int total=0;
		for(int i:math)total+=i;
		y.setTotal(total);
		System.out.println("math의 총합:"+y.getTotal());
		//문2)math의 총합이 짝수이면 true를 반환하고 홀수이면 false를 반환
		//getter,setter생성
		//총합이 짝수이므로 setter를 통해 rrr멤버변수의 값이 true로 setting되도록
		if(y.getTotal()%2==0)y.setRrr(true);
		else y.setRrr(false);
		System.out.println(y.getTotal());
		System.out.println(y.getRrr());
		//Yellow클래스에서 메서드 생성 gugu
		//숫자를 받아서 문자열 반환하는 메서드
		//문3)gugu메서드 호출하여 구구단 출력
		String aa=y.gugu(5);
		System.out.println(aa);
		//문4)a^b승을 Yellow클래스에 생성
		int bb=y.sung(3,4);
		System.out.println(bb);
		int dd=y.pow(3,4);
		System.out.println(dd);
		//변수1부터 a를 b번 곱한 결과를 반환
		//문5)Math.random활용하여 gugu에서도 호출시 2단부터 9단까지 중 하나가 호출될 수 있도록 하세요
		String cc=y.gugu((int)(Math.random()*9+1));
		System.out.println(cc);
		
					
	}

}
