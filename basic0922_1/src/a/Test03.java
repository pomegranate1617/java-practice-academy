package a;

public class Test03 {

	public static void main(String[] args) {
		String []str= {"사랑","믿음","증오","복수","합창"};
		
		String forloop="";
		String enhancedForLoop="";
		for(int i=0;i<str.length;i++) {
			forloop+=str[i];
		}
		for(String i:str)enhancedForLoop+=i;
		
		System.out.println(forloop+","+enhancedForLoop);
		
		System.out.println("==============문1)================");
		int [] uu= {2,3,4,5,6,77};
		int a=0;
		int b=0;
		for(int i=0;i<uu.length;i++) {
			a+=uu[i];
		}
		System.out.println(a);
		for(int i:uu) {
			b+=i;
		}
		System.out.println(b);
		
//		문2)실수형(float)배열 선언후 str배열의 문자열의 길이를 지금 선언한 float형 배열에 저장
		float []vv=new float[str.length];
		for(int i=0;i<str.length;i++) {
			vv[i]=(float)str[i].length();
		};
		int rrr=0;
		for(String i:str) {
			vv[rrr++]=i.length();
		}
		for(float i:vv) System.out.println(i);
		
		
	}

}
