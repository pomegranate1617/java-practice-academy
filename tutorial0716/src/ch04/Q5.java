package ch04;

public class Q5 {

	public static void main(String[] args) {
		float [] arr= {10,20.5f,56.7f,11.2f,34.6f,67.8f,11,23f,34.6f,34.6f};
		System.out.println(arr.length);
		//0 1 2 3 x 5 6 7  x 9
		//총합을 구하는데 x(index가 4와,8인 부분)표 있는 부분은 제외하고 총합 구하세요
		float sum=0.0f;
		for(int i=0;i<arr.length;i++){
		  if(i!=0 && i%4==0) continue;//index가 4의 배수이면 누적하지 마라
		  sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println("====총합=====");
		sum=0;
		
		for(float i:arr)sum+=i;
		System.out.println(sum);
	}

}
