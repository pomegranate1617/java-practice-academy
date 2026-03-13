package b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApplesPredicate {
	public static List<Apple> filterGreeApplesWithArgument(List<Apple> inventory,Predicate<Apple> p){
		List<Apple> result=new ArrayList<>();
		for(Apple apple:inventory) {
			if(p.test(apple))result.add(apple);
			
		}
		return result;
	}
//	public static List<Apple> filterGreeApples(List<Apple> inventory,Predicate<Apple> p){
	public static List<Apple> filterGreeApplesWeightThan130(List<Apple> inventory,Predicate<Apple> p){
		List<Apple> result=new ArrayList<>();
		for(Apple apple:inventory) {
			if(p.test(apple))result.add(apple);
			
		}
		return result;
	}
	

	public static void main(String[] args) {
		 List<Apple> inventory = Arrays.asList(
			        new Apple(80, "green"),
			        new Apple(155, "green"),
			        new Apple(120, "red"),
			        new Apple(120, "red"),
			        new Apple(133, "red"),
			        new Apple(124, "blue"),
			        new Apple(125, "bule")
			    );
		 
//		 List<Apple> filtered=filterGreeApples(inventory,(Apple a)->"blue".equals(a.getColor()));
		 List<Apple> filtered=filterGreeApplesWeightThan130(inventory,(Apple a)->a.getWeight()>130);
//		 List<Apple>filtered=filterApplesWeighThan130(inventory,(Apple a)->a.seight()>130&&"green.equals(a.getColor()))
		 
//		 for(Apple i:filtered)System.out.println(i);
		 filtered.forEach(System.out::println);
		
		

	}

}
