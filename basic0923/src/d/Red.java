package d;

public class Red {
	private int math;
	private int korea;
	private int eng;
	private float avg;
	private float total;
	private String grade;
	
	void setMath(int math) {this.math=math;}
	void setKorea(int korea) {this.korea=korea;}
	void setEng(int eng) {this.eng=eng;}
	void setAvg(float avg) {this.avg=avg;}
	void setTotal(float total) {this.total=total;}
	void setGrade(String grade) {this.grade=grade;}
	
	
	int getMath() {return this.math;}
	int getKorea() {return this.korea;}
	int getEng() {return this.eng;}
	float getAvg() {return this.avg;}
	float getTotal() {return this.total;}
	String getGrade() {return this.grade;}
	
	String calcGrade(float avg) {
		String r="";
		if(avg>90) r="수";
		else if(avg>=80) r="우";
		else if(avg>=70) r="미";
		else if(avg>=60) r="양";
		else r="가";
		return r;
		
	}
	

}
