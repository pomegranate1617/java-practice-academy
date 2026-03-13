package a;

public class Test02 {

	public static void main(String[] args) {
		float arr[]= {11.2f,13.5f,34.5f,23.7f};
		int arrInt[]=new int[4];//정수를 저장하기위한 4개의 크리를 가진
		//배열 생성
		
		for(int i=0;i<4;i++) {
			arrInt[i]=(int) arr[i];
	
		}
//		arrInt[0]=(float) arr[0];
//		arrInt[1]=(float) arr[1];
//		arrInt[2]=(float) arr[2];
//		arrInt[3]=(float) arr[3];
//		
//		
//		System.out.println(arrInt[0]);
//		System.out.println(arrInt[1]);
//		System.out.println(arrInt[2]);
//		System.out.println(arrInt[3]);
		for(int i=0;i<4;i++) {
			System.out.println(arrInt[i]);
		}
		float sumF=0.0f;
		int sumI=0;
		for(int i=0;i<arr.length;i++) sumF+=arr[i];
		for(int i=1;i<arrInt.length;i++) sumI+=arrInt[i];
		for(int i=0;i<4;i++) System.out.println(arrInt[i]);
		System.out.println("정수의 총합=>"+sumI);
		System.out.println("=======");
		for(int i=0;i<4;i++) System.out.println(arr[i]);
		System.out.println("실수의 총합=>"+sumF);
	
		
		}
}
