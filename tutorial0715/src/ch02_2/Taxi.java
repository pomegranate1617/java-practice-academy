package ch02_2;

public class Taxi {
	public  String gugu(int a) {//메뉴1
		String result="";
		for(int i=1;i<10;i++) {
			result+=a+"x"+i+"="+(a*i)+"\n";
					
		}
		return result;
		
			
	}
	
	public  int pow(int a,int b) {//메뉴2
		int result2=1;
		for(int j=0;j<b;j++) {
			result2*=a;
		}
		return result2;
			
	}
	public  boolean isGreaterThanAandB(int a,int b) {//메뉴3
		boolean r=false;
		if(a>b) r=true;
		else r=false;
		return r;
	}
}
