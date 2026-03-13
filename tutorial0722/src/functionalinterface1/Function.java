package functionalinterface1;

@FunctionalInterface
public interface Function<T, R> {
	R apply(T t); //함수형 인터페이스는 하나의 추상(abstract) 메서드만 있어야 한다
	//자바 라이브러리에서 제공하는 것을 우리가 모방해보자
	

}
