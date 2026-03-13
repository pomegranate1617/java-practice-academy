package d;

public interface RemoteControl {
	 void turnOn();
	 default void f() {
		 System.out.println("구현부가 있어요 , 인터페이스이지만 ");
	 }
}
