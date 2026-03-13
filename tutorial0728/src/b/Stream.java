package b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {
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
		//과일 폭을 추가해달라고 고객이 요청했어요
		 List<Apple> inventory = Arrays.asList(
			        new Apple(80,34.4f, "yellow"),
			        new Apple(155,101.4f, "yellow"),
			        new Apple(120,100.2f, "red"),
			        new Apple(120,99.4f, "red"),
			        new Apple(133,11.24f, "red")
			       
			    );
		 
//		 List<Apple> filtered=filterGreeApples(inventory,(Apple a)->"blue".equals(a.getColor()));
//		 List<Apple> filtered=filterGreeApplesWeightThan130(inventory,(Apple a)->a.getWeight()>130);
//		  List<Apple>filtered=filterApplesWeighThan130(inventory,(Apple a)->a.seight()>130&&"green.equals(a.getColor()))
//		 List<Apple> filtered=inventory.stream()
//				 .filter((Apple a)->a.getWeight()<130&&"green".equals(a.getColor()))
//				 .collect(Collectors.toList());
		 //자바에서 map,filter,reduce를 사용하기위해서는 무조건 스트림으로 변환해야 한고
		 //우리가 필요한 데이터는 리스트 이므로 마지막에 다시 리스트로 변환함
		 
		 
//		 for(Apple i:filtered)System.out.println(i);
		 //무게가 120이상이고 색상이 노란색이며 폭이 88이상인것을 보내주세요.
		 //적오도 2개 이상 나오도록 하세요
		 List<Apple>filtered=inventory.stream()
				 .filter((Apple a)->a.getWeight()>=120&&"yellow".equals(a.getColor())&&a.getWidth()>=88)
				 .collect(Collectors.toList());
		 
		 for(Apple i:filtered)System.out.println(i);
		
		

	}

}
