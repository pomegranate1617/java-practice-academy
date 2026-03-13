package b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {
	public static List<Apple> filterGreeApples(List<Apple> inventory){
		List<Apple> result=new ArrayList<>();
		
		for(Apple apple:inventory) {
			if("green".equals(apple.getColor())) result.add(apple);
		}
		return result;
	}
	

	public static void main(String[] args) {
		 List<Apple> inventory = Arrays.asList(
			        new Apple(80, "green"),
			        new Apple(155, "green"),
			        new Apple(120, "red")
			    );
		 
		 List<Apple> filtered=filterGreeApples(inventory);
		 for(Apple i:filtered)System.out.println(i);
		
		

	}

}
