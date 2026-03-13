package b;

public class CarTest {

	public static void main(String[] args) {
		int a=5;//데이터 타입은 정수
		//a는 변수,5는 값
		Car b=new Car();//객체생성1
		b.setPrice(11);//2
		
		int r=b.getPrice();
		System.out.println(r);
		
		int p[]= {10,20,30,40,50};
		String n[]= {"홍길동","김말자","김개똥","홍말자","가나"};
		int rr[]= {5,6,7,11,34,56};
		int zzz[]= {23,45,67,8,911};
		String q[]= {"가","나","다","라","마"};
		//배열에서 하나씩 꺼내어 setter를 호출하고 getter로 출력하세요
		for(int i=0;i<5;i++) {
			b.setPrice(p[i]);
			b.setName(n[i]);
			b.setRr(rr[i]);
			b.setZz(zzz[i]);
			b.setQq(q[i]);
			System.out.println("가격:"+b.getPrice()+",이름:"+b.getName()+",rr:"+b.getRr()+",zz:"+b.getZz()+",zz:"+b.getQq());
		}
		//멤버변수 3개씩 만들고 트럭,버스,택시만들기
			
		
		
	}

}
