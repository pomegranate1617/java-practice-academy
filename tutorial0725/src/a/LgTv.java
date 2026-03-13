package a;

public class LgTv extends Tv{
	@Override
	void turnon() {
		System.out.println("LgTv를 켜다");
	}
	void visit(int a) {
		System.out.println(a+"번 방문한다");
	}
}
