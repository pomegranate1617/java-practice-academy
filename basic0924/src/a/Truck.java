package a;

public class Truck extends Car{//truck이 Car를 상속받아요
	private int me;
	
	public int getMe() {return this.me;}
	public void setMe(int me) {this.me=me;}
	
	@Override
		String walk(int a) {
		String v="";
		for(int i=0;i<a;i++) {
			v+="믿음";
		}
		return v;
		}
	
	
}
