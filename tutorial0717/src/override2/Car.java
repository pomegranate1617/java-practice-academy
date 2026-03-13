package override2;

public class Car {
	private int price;
	Car(){
		
	}
	Car(int a){
		
	}
	Car(int a, String b){
		System.out.println(a+b);
	}
	Car(int a, String b, String c){
		System.out.println(a+(b+c).length());
	}
	Car(int a, float b, double c){
		System.out.println(a+(b/c));
	}
	
	int getPrice() {return this.price;}
	void setPrice(int price) {this.price = price;}
	
	void drive() {
		System.out.println("자동차를 몰아요");
	}

	

}
