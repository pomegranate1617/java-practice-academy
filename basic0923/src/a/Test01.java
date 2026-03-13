package a;

import java.util.ArrayList;
import java.util.List;


//문6)public static 함수를 생성하여 사랑 문자열을 전달하고 두번째 인자로 숫자를 전달하면 사랑의문자열이
		//두번째 인자로 전달하는 수만큼 반복하여 문자열 결합한 결과를 반환하고 호출한 main함수에서 출력함
public class Test01 {
	
	public static String love(String a,int b) {
		String c="";
		for(int i=0;i<b;i++) {
			c+=a;		
		}
		return c;
		
	}
	public static void main(String[]args) {
		List<Integer>list=new ArrayList<>();
		
		int [] arr= {3,4,5,6,11,45,78};
		
		list.add(arr[0]*1);
		list.add(arr[1]*3);
		list.add(arr[2]*5);
		list.add(arr[3]*7);
		list.add(arr[4]*9);
		list.add(arr[5]*11);
		
		for(int i=0;i<6;i++) {
			list.add(arr[i]*(2*i+1));
		}
		//문2)arr배열을 5배하여 List<Float>에 저장
		List<Float> list2=new ArrayList<>();
		
		for(int i=0;i>arr.length;i++) {
			list2.add((float)arr[i]*5);
		}
		for(int i:arr) {
			list2.add((float)i*5);
		}
		//문3)arr배열에서 3의배수와 3의 배수가 아닌것의 총합과 갯수를 각각 구하세요
		int threeysum= 0;
		int threensum=0;
		int threey=0;
		int threen=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				threeysum+=arr[i];
				threey++;
			}
			else {
				threensum+=arr[i]; 
				threen++;
			}
			
		}
		
		
		System.out.println("3의 배수의 총합:"+threeysum+",3의 배수가 아닌것의 총합:"+threensum+",3의 배수의 갯수:"+threey+"3의 배수가 아닌것의 갯수:"+threen);
		
		//문4)float로 선언하여 저장한 데이터를 일반 반복문과enhanced for문을 활용하여 출력
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		for(float i:list2) {
			System.out.println(i);
		}
		//문5)반복문을 활용하여 "사랑"문자열을 10번 결합하여 문자열 출력
		String a="";
		for(int i=0;i<10;i++) {
			a+="사랑";
		}
		System.out.println(a);
		//문6)public static 함수를 생성하여 사랑 문자열을 전달하고 두번째 인자로 숫자를 전달하면 사랑의문자열이
		//두번째 인자로 전달하는 수만큼 반복하여 문자열 결합한 결과를 반환하고 호출한 main함수에서 출력함
		String d=love("사랑",3);
		System.out.println(d);
		
		
		
		
	}
}
