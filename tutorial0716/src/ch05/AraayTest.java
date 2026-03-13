package ch05;

public class AraayTest {
	
	public static void u(int[]ar) {//ar은 u함수의 지역변수(local varivable)
		ar[1]=1000;
	}
	public static void main(String[] args) {
		
		int[]arr= {2,3,4,5};
		u(arr);//배열명은 주소,u함수에 주소를 전달하면 이게 참조(reference)
		for(int i:arr)System.out.println(i);

	}

}
