package a;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private String driver;
	private List<Tire> tires=new ArrayList<>();
	
	Car(){}
	Car(String driver,List<Tire>tires){
		this.driver=driver;
		this.tires=tires;
	}
	String getDriver() {return this.driver;}
	List<Tire>getTires(){return this.tires;}
	void setDriver(String driver) {this.driver=driver;}
	void setTires(List<Tire> tires) {this.tires=tires;}
	
	
	

}
