package f;

public class TreadTest {

	public static void main(String[] args) {
		WashRoom wr=new WashRoom();
				Family father=new Family(wr,"아버지");//쓰레드 5개 상속받음~~~~
				Family mother=new Family(wr,"어머니");
				Family brother=new Family(wr,"오빠");
				Family sister=new Family(wr,"언니");
				Family me=new Family(wr,"나");
				father.start();//쓰레드 시작
				//운영체제가 알아서 run함수를 실행시킨다
				mother.start();
				brother.start();
				sister.start();
				me.start();

	}

}
