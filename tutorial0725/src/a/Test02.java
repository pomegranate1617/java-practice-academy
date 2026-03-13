package a;

public class Test02 {
	
	
	public static void f(Phone p) {
		//소괄호 하고
		//여기를 채우고
		//main 함수에서 데이터를 전달하세요(호출하세요)
		if(p instanceof SmartPhone) {
			SmartPhone u=(SmartPhone) p;
			u.call();
		}else if(p instanceof CellularPhone) {
			CellularPhone u=(CellularPhone) p;
			u.call();
		}else {
			p.call();
		}
		
	}

	public static void main(String[] args) {
		Phone[] phones =new Phone[3];
		
		Phone sp=new SmartPhone("사랑");
		Phone cp=new CellularPhone();
		Phone motherPhone=new Phone();
		
		phones[0]=sp;
		phones[1]=cp;
		phones[2]=motherPhone;
		f(sp);
		f(cp);
		f(motherPhone);
		System.out.println("==========");
		
		
		//Phone가 부모이므로 저장은 되는데 
		//자식의 각각의 고유의 특징이 있음으므로
		//어떤 자식인지 확인하고 down casting 한후
		//해당 객체를 실행(호출)
		for(Phone i:phones) {
			if(i instanceof SmartPhone) {
				SmartPhone u=(SmartPhone) i;
				u.call();
			}else if(i instanceof CellularPhone) {
				CellularPhone u=(CellularPhone) i;
				u.call();
			}else {
				i.call();
			}
		}
		

	}

}
