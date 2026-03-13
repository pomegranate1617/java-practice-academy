package ch04;

public class Q1 {

	public static void main(String[] args) {
		int [] arr= {11,22,34,56,78,100};
		//짝수의 합과 홀수의 합을 각각 구하세요.
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) even+=arr[i];
			
			else odd+=arr[i];
		}
		System.out.println("짝수의 합:"+even);
		System.out.println("홀수의 합:"+odd);
		
		//enhanced for
		for(int i:arr) {
			if(i%2==0) even+=i;
						
			else odd+=i;
		}
		System.out.println("짝수의 합:"+even);
		System.out.println("홀수의 합:"+odd);
		

	}

}
