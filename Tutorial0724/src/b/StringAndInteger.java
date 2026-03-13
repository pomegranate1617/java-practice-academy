package b;

public class StringAndInteger {
	private int times;
	private int iterateCnt;
	private String name;
	
	StringAndInteger(){}
	StringAndInteger(int times, int iterateCnt, String name){
		this.name=name;
		this.times=times;
		this.iterateCnt=iterateCnt;
	}
	int getTimes() {return this.times;}
	int getIterateCnt() {return this.iterateCnt;}
	String getName() {return this.name;}
	
	void setTimes(int times) {this.times=times;}
	void setIterateCnt(int iterateCnt) {this.iterateCnt=iterateCnt;}
	void setName(String name) {this.name=name;}
}
