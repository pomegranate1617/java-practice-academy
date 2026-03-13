package a;

public class Box<T> {
	T content;
	
	Box(){}
	Box(T t){
		this.content=t;
	}
	
	void drive(T t) {
		System.out.println("운전을 잘해요"+t);
	}
	T getContent() {return this.content;}
}
