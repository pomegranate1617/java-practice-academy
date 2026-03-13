package ch03;

public class BirLogicEx {

	public static void main(String[] args) {
		System.out.println((45&25));//9,bit연산자 and,둘다1이면1
		//45=32(2^5)+8(2^3)+4(2^2)+1=101101(2)
		//25=16(2^4)+8(2^3)+1=        11001(2)
        //                           001001(2) 
		

		System.out.println((45|25));//9,bit연산자 or,하나라도1이면 1
		//45=32(2^5)+8(2^3)+4(2^2)+1=101101(2)
		//25=16(2^4)+8(2^3)+1=        11001(2)
		//                           111101(2) 
		
		System.out.println((45^25));//9,bit연산자 eXclusive or=>xor,서로 다르면 1
		//45=32(2^5)+8(2^3)+4(2^2)+1=101101(2)
		//25=16(2^4)+8(2^3)+1=        11001(2)
		//                           110100(2) =32+16+4
		System.out.println(2<<4);//2를 왼쪽으로 4bit이동(2^4)를 곱하기와 같다
		System.out.println(16>>2);//2를 오른쪽으로 4bit이동(2^4)를 나누기와 같다
		
		
		
		
	}

}
