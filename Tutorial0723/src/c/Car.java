package c;

public class Car {
	private String driver;
	private Tire  tires[]=new Tire[2];
	
	Car(){}
	Car(String driver,Tire[] tires){
		this.driver=driver;
		this.tires=tires;
		
		
	}
	Car(String a){
		this.driver=a;
	}
	String getDriver() {return this.driver;}
	Tire[] getTires(){return this.tires;}
	void setDriver(String driver) {this.driver=driver;}
	void setTires(Tire[] tires) {this.tires=tires;}
	
	
	

}
