package a;

public class Test05 {

	public static void main(String[] args) {
		int [] data= {2,3,4,5,11,34,56,13};
		//문1)짝수와 홀수의 합을 각각 구하는데 2가지 반복문을 활용하세요
		int even=0;
		int odd=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]%2==0) even+=data[i];
			else odd+=data[i];
		}
		System.out.println("짝수의 합:"+even+",홀수의 합:"+odd);
		even=0;
		odd=0;
		for(int i:data) {
			if(i%2==0) even+=i;
			else odd+=i;
		}
		System.out.println("짝수의 합:"+even+",홀수의 합:"+odd);
		
		//문2)String 문자열 배열을 data배열의 길이만큼 선언하고 "사랑"문자열을 data숫자만큼 반복하여 문자열 결합하여 저장하세요
		String []a=new String[data.length];
		String b="사랑";
		for(int i=0;i<data.length;i++) {
			String s="";
			for(int j=0;j<data[i];j++) {
				s+=b;
			}
			a[i]=s;
		}
		for(String i:a) {
			System.out.println(i);
		}
		System.out.println("=======================================================");
		//---------------------------------------
		String [] result=new String[data.length];
		int cnt=0;
		for(int i:data) {
			String s="";
			for(int j=0;j<i;j++) {
				s+=b;
			}
				result[cnt++]=s;
			
		}
		for(String i:a) {
			System.out.println(i);
		}
			
		
	}

}
