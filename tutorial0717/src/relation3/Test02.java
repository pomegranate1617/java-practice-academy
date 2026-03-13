package relation3;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		List<List<String>> listOfList = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			List<String> li = new ArrayList<String>();
			for(int j=0; j<10; j++) {
				li.add(""+(i+j));
			}
			listOfList.add(li);
		}
		for(List<String> i:listOfList) {
			for(String j:i) {
				System.out.println(j);
			}
		}

	}

}
