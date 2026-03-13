package b;

public class Tv {
	private int channel;
	private int times;
	private int iterateCnt;
	private String name;
	
	Tv(){}
	Tv(int channel){
		this.channel=channel;
	}
	void channelUp() {
		this.channel++;
	}
	void channelDown() {
		this.channel--;
	}
	String pongpong(int a) {
		String result="";
		for(int i =0;i<a;i++) {
			result+="홍길동";
		}
		String r ="";
		if(result.length()%4==0) r="짝수";
		else r="홀수";
		return r;
	}
	String pongpong(String b, int a) {
		String result="";
		for(int i =0;i<a;i++) {
			result+=b;
		}
		String r ="";
		if(result.length()%4==0) r="짝수";
		else r="홀수";
		return r;
	}
	String pongpong(int c,String b, int a) {
		String result="";
		for(int i =0;i<a;i++) {
			result+=b;
		}
		String r ="";
		if(result.length()%c==0) r="짝수";
		else r="홀수";
		return r;
	}
	//오버로딩(1) 4의 배수 고정
	//오버로딩(2) , 외부에서 호출시 무슨 배수인지 전달하는것까지 
	int getChannel() {return this.channel;}
}
