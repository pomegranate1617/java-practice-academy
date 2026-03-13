package b;

public class Korean {
	private String name;
	private String number;
	private String sns;
	private String nation;
	
	Korean(){}
	Korean(String name){
		this.name=name;
	}
	Korean(String name, String number){
		this.name=name;
		this.number=number;
		
	}
	Korean(String name, String number, String sns){
		this.name=name;
		this.number=number;
		this.sns=sns;
	}
	Korean(String name, String number, String sns, String nation){
		this.name=name;
		this.number=number;
		this.sns=sns;
		this.nation=nation;
	}
	String getName() {return this.name;}
	void setName(String name) {this.name=name;}
	
	String getNumber() {return this.number;}
	void setNumber(String number) {this.number=number;}
	
	String getSns() {return this.sns;}
	void setSns(String sns) {this.sns=sns;}
	
	String getNation() {return this.nation;}
	void setNation(String nation) {this.nation=nation;}
	
	boolean marathon(int a, float b) {
		int sum = a+(int)b;
		if(sum>30) return true; 
		return false;
	}
	
	String totoRide(float a) {
		String grade = "";
		if(a>=90) return grade = "수";
		else if(a>=80) return grade = "우";
		else if(a>=70) return grade = "미";
		else if(a>=60) return grade = "양";
		
		else return grade = "낙제입니다.";
	}

}



