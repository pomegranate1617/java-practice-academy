package a;

public class Car {
	String padding(int j) {
		
		String u="";
		for(int i=0;i<j;i++) {
			u+="홍길,";
			
		}
		return u;
	}
	int korea(float a,float b){
		return (int)(a+b);
	}
		
	String palpal(String a,int b) {
		String u="";
		for(int i=0;i<b;i++) {
			u+=a;
		}
		return u;
	}
	int poto(int a) {
		return a*2;
	}
	float cooling(float b) {
		return b*3;
	}
	//여기에 uu메서드 작성

	boolean uu(int i) {
		if(i%2==0) return true;
		else return false;	
	}
	String starEven(int i) {
		if(i%2==0)return ""+i;
		return"";
	}
	String starOdd(int i) {
		if(i%2==1)return ""+i;
		return"";
	}
	//
	
	

}

