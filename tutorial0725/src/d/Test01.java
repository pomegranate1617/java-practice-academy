package d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class Test01 {

	public static void main(String[] args) {
		RemoteControl[] rc= {
				new Television(),
				new Audio(),
				new Video(),
				new Radio(),
				new Refrigerator(),
				new WashingMachine()
		};
		List<RemoteControl> list = Arrays.asList(rc);
		for(RemoteControl i :list) {
			if(i instanceof Radio) {
				Radio u = (Radio) i;
				u.turnOn();
			} else if(i instanceof Audio ) {
				Audio u = (Audio) i;
				u.turnOn();
			} else if(i instanceof Video ) {
				Video u = (Video) i;
				u.turnOn();
			} else if(i instanceof Refrigerator ) {
				Refrigerator u = (Refrigerator) i;
				u.turnOn();
			} else if (i instanceof WashingMachine) {
				WashingMachine u =(WashingMachine) i;
				u.turnOn();
			}else if (i instanceof Television) {
				Television u =(Television) i;
				u.turnOn();
			}
		}
	}
}
