package b;

public class Math {
	Math(){};
	Math(int korea, int eng){
		this.korea=korea;
		this.eng=eng;
		
	}
	Math(int korea, int eng, int rural){
		this.korea=korea;
		this.eng=eng;
		this.rural=rural;
	}
	
	private int korea;
	private int eng;
	private int rural;
	
	int getKorea() {return this.korea;}
	void setKorea(int korea) {this.korea=korea;}
	
	int getEng() {return this.eng;}
	void setEng(int eng) {this.eng=eng;}
	
	int getRural() {return this.rural;}
	void setRural(int rural) {this.rural=rural;}
	
	float calcTotal(float a) {
		return (float)(a*3);
	}

}
