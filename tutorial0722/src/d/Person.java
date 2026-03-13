package d;

public class Person{
	private String name;
	private int age;
	private int height;
	private int weight;
	
	Person(){}
	Person(String name, int age, int height, int weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	String getName() {return this.name;}
	int getAge() {return this.age;}
	int getHeight() {return this.height;}
	int getWeight() {return this.weight;}
	
	void setName(String name) {this.name=name;}
	void setAge(int age) {this.age=age;}
	void setHeight(int height) {this.height=height;}
	void setWeight(int weight) {this.weight=weight;}
}