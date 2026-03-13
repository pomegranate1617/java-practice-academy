package b;

public class CarTest02 {

	public static void main(String[] args) {
		Car[] cars= {new Car(),new Car(),new Car(),new Car()};//빈차 4대를 창고에 저장되어 있다
		String[]str= {"사랑","믿음","증오","갈등"};
		int cnt=0;
		for(Car i:cars)System.out.println(i.mm(str[cnt++], (int)(Math.random()*7)));
		System.out.println("===========================");
		double i=Math.random();//랜던임 숫자 0부터1보다 작은 숫자를 하나를 반환함
		int j=(int)(i*100);//0부터 99까지 자연수를 반환함
		System.out.println(j);
		
	}

}
