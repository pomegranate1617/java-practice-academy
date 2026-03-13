package a;

public class Test05 {

	public static void main(String[] args) {
		int arr[]= {2,3,6,8,12};
		float arr2[]= {11.2f,34.5f,56.7f};
		String str[]= {"a","b","c","d","e","f"};
		
		
		//일반 반복문(index가 필요한 반복문)
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		for(int i=0;i<arr2.length;i++) System.out.println(arr2[i]);
		for(int i=0;i<str.length;i++) System.out.println(str[i]);
		
		System.out.println("=========enhanced for 문======");
		
		
		// enhanced for 문
		for(int i:arr) System.out.println(i);
		for(float i:arr2) System.out.println(i);
		for(String i:str) System.out.println(i);
		
		
		
	}

}
