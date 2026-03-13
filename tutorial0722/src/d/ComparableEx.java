package d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
	
	//이것은 이해하려면 정렬 알고리즘을 빠삭하게 알아야 한다
	//그냥 사용법을 익히자
	public static void main(String[] args) {
		
		List<Person> treeSet = new ArrayList<>();
		
		treeSet.add(new Person("홍길동", 45,170,87));
		treeSet.add(new Person("김자바", 25,56,89));
		treeSet.add(new Person("박자바", 31,450,100));
		//sort 메소드에 첫번째 인자(정렬하려는 데이터), 두번째 인자로 정렬하고자 하는 방법(람다식) 제공
//		Collections.sort(treeSet, (Person a, Person b)-> -(b.getAge()-a.getAge()));
		Collections.sort(treeSet, (Person a, Person b)-> -(b.getName().compareTo(a.getName())));
		
		for(Person i:treeSet) {
			System.out.println("이름:"+i.getName()+", 나이:"+i.getAge()+", 몸무게:"+i.getWeight()+", 키:"+i.getHeight());
		}
	}
}
