package f;

public class Family extends Thread {
	private WashRoom wr;
	private String who;
	public Family(WashRoom wr,String name) {
		who=name;
		this.wr=wr;
	}
	@Override
	public void run() {//원하는 기능을 여기에 넣는다
		wr.foo(who);
		super.run();
	}
}

