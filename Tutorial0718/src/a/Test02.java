package a;

public class Test02 {

	public static void main(String[] args) {
		Car c=new Car();
		String u=c.padding(7);
		System.out.println(u);//"홍길,홍길,홍길,홍길,
			
		int v=c.korea(3.4f,10.7f);
		System.out.println(v);//두개의 숫자를 더한 결과가 여기에 나오고 싶어요
		
		String v1=c.palpal("권기현",3);//첫번째는 여러분의 이름을 전달하고 두번째는 여러분의 이름을 반복하여 결합
		System.out.println(v1);
		
		int rr=c.poto(4)+(int)c.cooling(3.4f);
		System.out.println(rr);//4*2+3.4f*3의 결과가 나와야 되요
		
		int arr[]= {10,20,37,40};
		//문1)반복문을 이용하여 arr배열의 데이터를 하나씩
		//꺼내어 Car클래스의 메서드(uu)를 호출하여 인자로 전달하고
		//uu메서드에서는 짝수인지 확인하고 짝수이면
		//true를 반환하고 그렇지 않으면 false를 반환함
		//여기에서 반환되는 값이 true인것이 몇개인가를 확인하세요
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			boolean uv=c.uu(arr[i]);
			if(uv) cnt++;
		}
		System.out.println(cnt);
		
		cnt=0;//위에서 한번 선언하고 값이 나왔으니 그 값 초기화
		for(int i:arr) {
			boolean uv=c.uu(i);
			if(uv) cnt++;
		}
		System.out.println(cnt);
		//"true=>"30,40",false=>13,37"
		String resultTrue="true=>";
		String resultFalse="flase=>";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) resultTrue+=c.starEven(arr[i])+",";
			else resultFalse+=c.starOdd(arr[i])+",";
		}
		String stripTrue=resultTrue.substring(0,resultTrue.length()-1);//문자열 짤라내기
		String stripFalse=resultFalse.substring(0,resultFalse.length()-1);//문자열 짤라내기
		//0번 index부터 문자열의 길이 -1을 하면 마지막 문자열을 제거
		System.out.println(resultTrue+","+stripFalse);
//		System.out.println(+","+resultFalse);
	
	}	

}
