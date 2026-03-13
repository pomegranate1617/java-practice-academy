package b;

public class Yellow {
	String beautiful(String a) {
		return a+"사랑";
	}
	String beautiful(String u,String h) {
		return u+h;
	}
	int toss(float a){
		return (int)a*2;
	}
	int toss(double b) {
		return(int)b*5;
		
	}
	int toss(String c,int a) {
		String t="";
		for(int i=0;i<a;i++) {
			t+=c;
			
		}
		return t.length();
	}
	int toss(int a) {
		int u=1;
		for(int r=0;r<a;r++) {
			u*=10;
			
		}
		return u;
	}

}
	
