package b;

public class Test02For {

	public static void main(String[] args) {
		int [] arr= {11,23,45,67,78};//배열 선언과 동시에 값을 저장
		
		for(int i=0;i<arr.length ;i++) arr[i] +=7;
		for(int i=0;i<arr.length ;i++) System.out.println(arr[i]);
		
		
		
	}

}
