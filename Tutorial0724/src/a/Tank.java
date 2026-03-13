package a;

import java.util.ArrayList;
import java.util.List;

public class Tank {
	private int nodo;
	private int math;
	private int sora;
	private List<Integer> rr=new ArrayList<>();
	private List<String>uu=new ArrayList<>();
	
	void setNodo(int nodo) {this.nodo=nodo;}
	void setMath(int math) {this.math=math;}
	void setSora(int sora) {this.sora=sora;}
	void setRr(List<Integer> rr) {this.rr=rr;}
	void setUu(List<String>uu) {this.uu=uu;}
	
	int getNodo(){return this.nodo;}
	int getMath() {return this.math;}
	int getSora() {return this.sora;}
	List<Integer> getRr(){return this.rr;}
	List<String> getUu(){return this.uu;}
	

}
