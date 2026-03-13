package a;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4_Dog {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,3,4,5};
		List<Integer> list = new ArrayList<>();
		for(int i:arr) list.add(i);
		
		Dog d = new Dog();
		
		boolean v = d.contains(arr, 1);
		System.out.println(v);
		
		v = d.contains(list, 2);
		System.out.println(v);
		
		int v1 = d.containsCount(list, 3);
		System.out.println(v1);
		
		System.out.println("홍길동".equals("홍길동"));
		
	}

}
