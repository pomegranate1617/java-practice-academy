package c;

import java.util.Arrays;
import java.util.List;

public class Dish {
	private final String name;
	private final boolean vegeterian;
	private final int calories;
	private final Type type;
	
	public  Dish (String name,boolean vegeterian,int calories,Type type) {
		this.name=name;
		this.vegeterian=vegeterian;
		this.calories=calories;
		this.type=type;
	}
	
	String getName() {return this.name;}
	boolean isVegetarian() {return this.vegeterian;}
	int getCalories() {return this.calories;}
	Type getType() {return this.type;}
	public enum Type{//enum은 문자로 보이지만 그냥 숫자ㅏ(MEAT=0,FISH=1,OTHER=2)
		MEAT,
		FISH,
		OTHER
	}
	@Override
	public String toString() {
		return name;
		
	}
	public static final List<Dish> menu = Arrays.asList(
		      new Dish("pork", false, 800, Dish.Type.MEAT),
		      new Dish("beef", false, 700, Dish.Type.MEAT),
		      new Dish("chicken", false, 400, Dish.Type.MEAT),
		      new Dish("french fries", true, 530, Dish.Type.OTHER),
		      new Dish("rice", true, 350, Dish.Type.OTHER),
		      new Dish("season fruit", true, 120, Dish.Type.OTHER),
		      new Dish("pizza", true, 550, Dish.Type.OTHER),
		      new Dish("prawns", false, 400, Dish.Type.FISH),
		      new Dish("salmon", false, 450, Dish.Type.FISH)
		  );
	
}

