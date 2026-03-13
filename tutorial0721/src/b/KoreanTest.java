package b;

public class KoreanTest {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		k1.setSns("페이스북");
		//문제1) 이 코드를 보고 Korean 클래스 설계하기
		System.out.println("이름:"+k1.getName());
		System.out.println("주민등록번호:"+k1.getNumber());
		System.out.println("SNS:"+k1.getSns());
		System.out.println("===========================");
		Korean k2 = new Korean("김자반", "011225-2234567");
		k2.setSns("인스타그램");
		System.out.println("이름:"+k2.getName());
		System.out.println("주민등록번호:"+k2.getNumber());
		System.out.println("SNS:"+k2.getSns());
		
		System.out.println("===========================");
		boolean vv = k2.marathon(13,34.6f);
		//문제1) marathon 메서드 생성
		//첫번째는 정수로 받고 두번째는 flaot로 받아서
		//2개의 숫자를 더한 결과가 30보다 크면 true를 반환하고
		//그렇지 않으면 false를 반환함
		System.out.println(vv);
		
		String uv = k1.totoRide(22.4f);
		//문제2) totoRide 메서드 생성
		//실수 하나를 받아서 수 우 미 양 가 중 하나를 반환함
		//90 이상이면 수, 80 이상이면 우 ~~~ 60보다 작으면 낙제
		System.out.println(uv);
		
	}

}
