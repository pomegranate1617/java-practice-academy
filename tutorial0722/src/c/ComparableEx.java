package c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

	public static void main(String[] args) {
		
		List<Person> treeSet = new ArrayList<>();
		
		treeSet.add(new Person("홍길동", 45,170,87));
		treeSet.add(new Person("김자바", 25,56,89));
		treeSet.add(new Person("박자바", 31,450,100));
		Collections.sort(treeSet);
		
		for(Person i:treeSet) {
			System.out.println("이름:"+i.getName()+", 나이:"+i.getAge()+", 몸무게:"+i.getWeight()+", 키:"+i.getHeight());
		}
	}
}
