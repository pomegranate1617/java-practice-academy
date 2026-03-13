package relation3;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //다형성 (Polymorphism)
		for(int i=0; i<5; i++) {
			list.add(""+((i*10)+5));
		}
		
//		list.add(""+5);
//		list.add(""+15);
//		list.add(""+25);
//		list.add(""+35);
//		list.add(""+45);
		
		for(String i:list) System.out.println(i);
		String r = "";
		for(int i=0; i<5; i++) {
			r = list.get(i);
			System.out.println(r);
		}
		
		
	}

}
