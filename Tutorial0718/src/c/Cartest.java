package c;

public class Cartest {

	public static void main(String[] args) {
		Car c=new Car();
		Car d=new Car(5);
//		Car d2=new Car("5");
//		Car d3=new Car(5,"사랑");
//		Car d4=new Car(5,11.4f,"공주");
		System.out.println(d.getPrice());
		System.out.println(d.getName()+","+c.getPrice());
		
		int []arr= {1,2,3,4};//정수형 배열 선언과 동시에 값을 대입
		Car[] cars= {new Car(),new Car(),new Car()};
		
		String[] str= {"사랑합니다","증오합니다","고맙습니다"};
		//문1)setter를 이용하여 0번 index의 위치에 저장되어 있는 배열의 price와 neme의 값을 각각
		//가격은 1000,이름은 사랑합니다.로 변경하고
		//출력하세요
		for(int i=0;i<str.length;i++) {
			cars[i].setPrice((i+1)*1000);
			cars[i].setName(str[i]);
			System.out.println(cars[i].getPrice()+cars[i].getName());
			
		}
		
		
//		cars[1].setPrice(2000);
//		cars[1].setName("증오합니다");
//		System.out.println(cars[1].getPrice()+cars[1].getName());
//		
//		cars[2].setPrice(3000);
//		cars[2].setName("고맙습니다");
//		System.out.println(cars[2].getPrice()+cars[2].getName());
//		
		
		
		
		
		
	}

}
