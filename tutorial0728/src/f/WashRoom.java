package f;

public class WashRoom {
	//synchronized 
		void foo(String name) {
		System.out.println(name+"입장");
		for(int i=0;i<1000000;i++) {
			if(i==10000)System.out.println("끄으으응");
		}
		System.out.println("시원해");
	}

}
