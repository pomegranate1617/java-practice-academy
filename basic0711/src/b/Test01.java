package b;

public class Test01 {
	
	public static void main(String[] args) {
		
		Car b=new Car();
		
		int a=2;
		int result=0;
		if(a==1) result=b.sum(3,4);
		else if(a==2)result=b.minus(10,2);
		else if(a==3)result=b.mul(10,2);
		else result=b.mod(10,3);
		System.out.println("result:"+result);
		String rr=b.gugu(4);
		System.out.println(rr);
		

	}

}
