package d;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private String driver;
	private List<Integer> prices=new ArrayList<>();
	private List<List<Integer>> listOfList=new ArrayList<>();
	private List<String> reds=new ArrayList<>();
	private List<List<String>> yellow=new ArrayList<>();
	//getter,setter생성후 main함수에서 멤버변수에 데이터를 채우세요
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
	List<Integer> getPrices(){return this.prices;}
	List<List<Integer>> getlistOfList(){return this.listOfList;}
	List<String> getReds(){return this.reds;}
	List<List<String>> getYellow(){return this.yellow;}
	
	
	void setDriver(String driver) {this.driver=driver;}
	void setTires(Tire[] tires) {this.tires=tires;}
	void setPrices(List<Integer> prices) {this.prices=prices;}
	void setListOfList(List<List<Integer>>listOfList) {this.listOfList=listOfList;}
	void setReds(List<String>reds) {this.reds=reds;}
	void setYellow(List<List<String>>yellow) {this.yellow=yellow;}
	
	
	
	

}
