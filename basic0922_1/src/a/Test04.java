package a;

public class Test04 {

	public static void main(String[] args) {
		String [] str=new String[6];
		
		//str에 저장하는데 "5","10","15","20","25","30"
		
		for(int i=0;i<6;i++) {
			str[i]=""+(5*(i+1));
		}
		
		for(String i:str) {
			System.out.println(i);
		}
		System.out.println("=======================================");
//		
//		for(int i=0;i<str.length;i++) {
//			str[i]=""+(5*(i+1));
//			System.out.println(""+str[i]);
//		}
//		System.out.println("=======================================");
//		int a=0;
//		for(String i:str) {
//			str[a++]=""+i
//		}
//		System.out.println(""+str[a++]);
//	}

}
