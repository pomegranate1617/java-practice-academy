package ch02;

public class ByteEx {

	public static void main(String[] args) {
		byte var1=-56;
		//byte var2=128;//여기서 왜 오류가발생할까?(처음(358))
		byte var3=-128;
		
		//byte var4=-129;
		//byte는 8bit이므로 최상위비트(MSB=>Most significant Mit)는 부호(sign( bit
		//1이면 음수이고 0이면 양수
		//그래서 2^7이면 128이고 0부터 시작하므로 -128~0 ~127

		int var7=65534;//2byte=> 16bit
				
		float varf=23.5f;//4byte
		double vard=45.6;//8byte(더 정확하다,그치만 메모리공간 더 차지)
		
		System.out.printf("%11.6f",varf);
		System.out.printf("%11.8f",vard);
		
		
	}

}
