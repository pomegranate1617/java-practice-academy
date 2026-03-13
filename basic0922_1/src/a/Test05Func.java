package a;

public class Test05Func {
	public static String ff(int aa) {
		String s="";
		for(int j=0;j<aa;j++) {
			s+="사랑";
		}
		return s;
	}

	public static void main(String[] args) {
		int [] data= {2,3,4,5,11,34,56,13};

	
		
		//문2)String 문자열 배열을 data배열의 길이만큼 선언하고 "사랑"문자열을 data숫자만큼 반복하여 문자열 결합하여 저장하세요
		String []a=new String[data.length];
		String b="사랑";
		for(int i=0;i<data.length;i++) {
			
			a[i]=ff(data[i]);
		}
		for(String i:a) {
			System.out.println(i);
		}
		System.out.println("=======================================================");
		//---------------------------------------
		String [] result=new String[data.length];
		int cnt=0;
		for(int i:data) {
			return[cnt++]=ff(i);
			}
		
		}
		for(String i:a) {
			System.out.println(i);
		}
			
		
	}

}
