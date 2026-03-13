package d;

public class Temp<T> {
	private T[] ts=null;
	void init(T[]v) {
		ts=v;
		System.out.println("배열의 크기:"+ts.length);
	}
	public void add(T t,int idx) {
		ts[idx]=t;
//		System.out.println(t3);
	}
	T[] getTs() {return this.ts;}
	
	
	
}
