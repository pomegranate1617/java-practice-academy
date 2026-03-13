package a;

public class Test04 {

	
	public static String gugu(int dan) {
		String result="";
		
		result +=dan+"x"+1+(dan*1)+"\n";
		result +=dan+"x"+2+(dan*2)+"\n";
		result +=dan+"x"+3+(dan*3)+"\n";
		result +=dan+"x"+4+(dan*4)+"\n";
		result +=dan+"x"+5+(dan*5)+"\n";
		result +=dan+"x"+6+(dan*6)+"\n";
		result +=dan+"x"+7+(dan*7)+"\n";
		result +=dan+"x"+8+(dan*8)+"\n";
		result +=dan+"x"+9+(dan*9)+"\n";
		
		return result;
	}
	
	public static void main(String[] args) {
		int dan=3;
		
		String r=gugu(dan);
		System.out.println(r);

	}

}
