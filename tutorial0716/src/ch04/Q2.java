package ch04;

public class Q2 {

	public static void main(String[] args) {
		float [] arr= {11.3f, 12.6f,34.5f, 88.9f,123.7f,99.56f};
		//문2)50보다 같거나 큰것의 합과 갯수
		//50보다 작은 것의 합과 개수(일반반복문,enhanced for)
		float over=0.0f;
		float under=0.0f;
		int cntOver=0;
		int cntUnder=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=50) {
				over+=arr[i];
				cntOver++;
				
			}
			else {
				under+=arr[i];
				cntUnder++;
			}
		}
			
		
		System.out.println("50보다같거나 큰것의 합:"+over);
		System.out.println("50보다 작은것의 합:"+under);
		System.out.println("50보다 같거나 큰것의 갯수:"+cntOver);
		System.out.println("50보다 작은것의 갯수:"+cntUnder);
		 over=0.0f;
		 under=0.0f;
		 cntOver=0;
		 cntUnder=0;
		for(float i:arr) {
			if(i<=50) {
				over+=i;
				cntOver++;
				
			}
			else {
				under+=i;
				cntUnder++;
			}
		}
		System.out.println("50보다같거나 큰것의 합:"+over);
		System.out.println("50보다 작은것의 합:"+under);
		System.out.println("50보다 같거나 큰것의 갯수:"+cntOver);
		System.out.println("50보다 작은것의 갯수:"+cntUnder);
		
////package ch04;
//
//public class Q2 {
//
//	public static void main(String[] args) {
//		float [] arr= {11.3f, 12.6f,34.5f, 88.9f,123.7f,99.56f};
//		//문 2) 50보다 같거나 큰것의합과 갯수
//		int greatherThan50Sum=0, greatherThan50Cnt=0; 
//		//50보다 작은 것의 합과 개수(일반반복문 , enhanced for)
//		int lessThen50Sum=0, lessThen50Cnt=0;
//		System.out.println("==========일반 반복문====");
//		for(int i =0;i<arr.length;i++) {
//			if(arr[i]>=50) {
//				greatherThan50Sum+=arr[i];
//				greatherThan50Cnt++;
//			}else {
//				lessThen50Sum+=arr[i];
//				lessThen50Cnt++;
//			}
//		}
//		System.out.println("50보다 큰것들의 총합=>" +greatherThan50Sum+",개수=>" +greatherThan50Cnt);
//		System.out.println("50보다 작은것들의 총합=>" +lessThen50Sum+",개수=>" +lessThen50Cnt);
//		greatherThan50Sum=0;
//		greatherThan50Cnt=0; 
//		lessThen50Sum=0;
//		lessThen50Cnt=0;
//		
//		System.out.println("==========enhanced for====");
//		for(float i : arr) {
//			if(i>50) {
//				greatherThan50Sum+=i;
//				greatherThan50Cnt++;
//			}else {
//				lessThen50Sum+=i;
//				lessThen50Cnt++;
//			}
//			
//		}
//		System.out.println("50보다 큰것들의 총합=>" +greatherThan50Sum+",개수=>" +greatherThan50Cnt);
//		System.out.println("50보다 작은것들의 총합=>" +lessThen50Sum+",개수=>" +lessThen50Cnt);
//		//문 3) Q3 파일 생성후 
//		
//		String [] str= {"홍길동","김말자","그린","아카데미","노랑머리","호랑이"};
//		//문자열의 길이가 홀수인것들의 문자열 결합한하나의 문자열과 문자열의 길이가
//		//짝수인것들만 결합한 하나의 문자열 두개의 문자열을 각각 구하기  (일반반복문 , enhanced for)
//
//	}

}
				
			}
		
