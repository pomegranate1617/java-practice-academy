package b;

public class Car {

	
	public  int sum(int a,int b) {
			return a+b;
		}
	public  int minus(int a,int b) {
			return a-b;
		}
	public  int mul(int a,int b) {
			return a*b;
	}
	public  int mod(int a,int b) {
		return a%b;
	}
	String gugu(int a) {
		String result="";
		 for(int i=1;i<10;i++) {
			 result+=a+"x"+i+"="+(a*i)+"\n";
		
		 }
		 return result;
	}
}