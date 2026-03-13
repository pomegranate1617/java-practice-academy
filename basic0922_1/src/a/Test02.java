package a;

public class Test02 {

	public static void main(String[] args) {
		String []str= {"사랑","믿음","증오","복수","합창"};
		
		String u="";
		u+= str[0]+2;
		u+= str[1]+4;
		u+= str[2]+6;
		u+= str[3]+8;
		u+= str[4]+10;
		System.out.println(u);
		for(int i=0;i<5;i++) {
			u+=str[i]+2*(i+1);
		}
		
	}

}
