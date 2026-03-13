package c;

public class Yellow {
	private int []yy;
	private int total;
	private boolean rrr;
	
	int[] getYy() {return this.yy;}
	int getTotal() {return this.total;}
	boolean getRrr() {return this.rrr;}
	
	void setYy(int[]yy) {this.yy=yy;}
	void setTotal(int total) {this.total=total;}
	void setRrr(boolean rrr) {this.rrr=rrr;}
	
	String gugu(int a) {
		String u="";
		for(int i=0;i<9;i++) {
			u+=a+"x"+i+"="+(a*i)+"\n";
		}
		return u;
	}
	//Test01문4)내가쓴거
	int sung(int a,int b) {
		int c=1;
		for(int i=0;i<b;i++) {
			c*=a;
		}
		return c;
		
	}
	//Test01문4)선생님 정답
	int pow(int a,int b) {
		int r=1;
		for(int i=0;i<b;i++)r*=a;
		return r;
	}
	
	

}
