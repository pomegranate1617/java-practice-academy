package a;

public class Test07Func {
	public static String gugu(int a) {
		String r="";
		for(int i=0;i<9;i++) {
			r+=a+"x"+(i+1)+"="+a*(i+1)+"\n";
		}
		return r;
	}

	public static void main(String[] args) {
//		Stirng r="";
//		r+="9x1=9"+"\n";
//		r+="9x2=18"+"\n";
//		r+="9x3=27"+"\n";
		
//		System.out.println(r);//문1)반복문으로 변경
		//문2)gugu함수를 생성하고 반환되는 문자열 출력
		
		System.out.println(gugu(3));
//		String aa=gugu(3);
//		System.out.println(aa);
//문3)data배열의 데이터를 하나씩 꺼내어 gugu함수 호출하고 출력하세요
		int [] data= {2,3,4,5,6,7,8,9};
		String b="";
		for(int i=0;i<data.length;i++) {
			b=gugu(data[i]);
		}
		System.out.println(b);
		for(int i:data) {
			String u=gugu(i);
			System.out.println(u);
		}
	}

}
