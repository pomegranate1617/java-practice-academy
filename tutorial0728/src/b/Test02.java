package b;

import java.util.Arrays;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		Integer [] arr= {1,2,3,4};
		
		List<Integer> list=Arrays.asList(arr);
		list.stream().map(i-> new Peach(i,""+i,i*3.3f,i*10))
						.forEach(i->System.out.println(i));
		
	}

}
