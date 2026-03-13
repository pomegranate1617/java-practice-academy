package c;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a=new Animal() {//추상클래스라서 객체 생성 불가하지만 객체 생성과 동시에 오버라이딩하면서 객체 생성은 가능
			@Override
			void sound() {
				System.out.println("동물이 울어요");
			}
		};
		a.sound();
		Animal []animals= {a,new Human(),new Cat(),new Dog()};
		List<Animal> list=Arrays.asList(animals);
		
		for(Animal i:list) {
			if(i instanceof Cat) {
				Cat b=(Cat)i;
				b.sound();
			}else if(i instanceof Dog) {
				Dog b=(Dog)i;
				b.sound();
			}else if(i instanceof Human) {
				Human b=(Human)i;
				b.sound();
			}
		}

	}

}
