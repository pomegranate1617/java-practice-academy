package f;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		for(int i=0;i<3;i++) {
			list.add("홍"+(i+1));
		}
		String u="";
		for(String i:list) {
			u+=i;
		}
		System.out.println(u);

	}

}
