package b;

public class Peach {
	private int price;
	private String name;
	private float nana;
	private double dada;
	
	public Peach(int price,String name,float nana,double dada) {
		this.price=price;
		this.name=name;
		this.nana=nana;
		this.dada=dada;
	}
	

	int getPrice() {return this.price;}
	String getName() {return this.name;}
	float getNana() {return this.nana;}
	double getDada() {return this.dada;}
	
	void setPrice(int price) {this.price=price;}
	void setName(String name) {this.name=name;}
	void setNana(float nana) {this.nana=nana;}
	void setDada(double dada) {this.dada=dada;}
	@Override
	public String toString() {
		return "Peach [price=" + price + ", name=" + name + ", nana=" + nana + ", dada=" + dada + "]";
	}
	
}	
		
	
