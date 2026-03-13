package b;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	public static void main(String[]args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<24;i++)list.add((i+1)*5);
		
		list.forEach(System.out::println);
		System.out.println();
		list.forEach(i->System.out.println(i));
	}
}
