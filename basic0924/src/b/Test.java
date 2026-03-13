package b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void ff(Car c) {//upcasting이 자동으로 일어난다
		c.drive();
		if(c instanceof FireCar) {//instanceof각각의 차에 맞는 기능이 제대로 들어가게끔검증?(경찰차가 불을끄는 기능을 갖지 않도록해줌)
			FireCar z=(FireCar)c;//강제로 downcasting해야 한다
			z.fire();
		}else if(c instanceof PoliceCar) {
			PoliceCar pp=(PoliceCar) c;//다운캐스팅
			pp.get();
		}
	}
//	public static void ff(Fafa c) {
//		
//	}
//	public static void ff(Me c) {
//		
//	}
//	public static void ff(Sister c) {
//		
//	}

	public static void main(String[] args) {
		
		Car c=new Car();
		FireCar f2=new FireCar();
		PoliceCar pc=new PoliceCar();
		Car c2=(Car)new PoliceCar();//자동형변환
		int z=(int)3.4f;//강제형변환
		float fff=(float)2;//자동형변환
		ff(c);
		ff(f2);
		ff(pc);
		System.out.println("=============================");
		
		Me m=new Me();
		m.getMoney();
		//문1)Sister는 아버지 일을 물려 받아서 노가다로 돈을 벌어요.
		Sister s=new Sister();
		s.getMoney();
		//다형성(형채가 다양하다)polymorphism
		//부모의 참조변수가 자식 객체를 가리킬 수 있다
		Fafa f=new Fafa();
		Fafa m1=new Me();
		Fafa s1=new Sister();
		//위에 처럼 다형성이 없다면 아래처럼 리스트를 만들어야 된다
		List<Fafa> li1=new ArrayList<>();
		List<Me> li2=new ArrayList<>();
		List<Sister> li3=new ArrayList<>();
		//------------------------------
		li1.add(s1);
		li1.add(m1);
		li1.add(f);
		//문1)li1에 저장된 객체를 사용하여 getMoney메서드를 호출(반복문)
		for(Fafa i:li1) {
			i.getMoney();
		}
		for(int i=0;i<li1.size();i++) {
			li1.get(i).getMoney();
		}
		//문2)
		Map<String,Fafa> map=new HashMap<>();
		//map에서 저장된 getMoney호출하세요
		
		map.put("가", s1);
		map.put("나", m1);
		map.put("다", f);
		Set<String > k=map.keySet();
		for(String i:k) {
			map.get(i).getMoney();
		}
		//문3)
		//Car클래스 생성,drive(){sysout("차가 부릉부릉")}
		//PoliceCar Car를 상속 받아서, 싸이렌 소리가 울려요,FireCar는 Car를 상속받아서 "불을 끄러 가는 중이에요"
		//다형성으로 List,Map,배열을 모두 사용해서 해보세요
		
		
		
		
		
		
		
		
	}

}
