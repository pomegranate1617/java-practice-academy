//package ch02;
//
//public class PrimitiveAndStringDonversionEx {
//
//	public static void main(String[] args) {
//		int value1=Integer.parseInt("10");//문자열을 정수로 변환
//		double value2=Double.parseDouble("3.14");//문자열을 실수로 변환
//		boolean value3=Boolean.parseBoolean("true");//문자열을 boolean 타입으로 변환
//		int value4=0;
//		
//		if(value3) value4=20;
//		else value4=34;
//		double result =value1+value2+value4;
//		System.out.println(result);
//		
//		String [] bos= {"true","false","true","false","false","true","true"};
//		//문제1 불린타입으로 변환하여 트루가 몇개인가 구하세요
//		int count=0;
//		for(int i=0;i<bos.length;i++) {
//			boolean boss=Boolean.parseBoolean(bos[i]);
//			if(boss) count++;
//		}
//		System.out.println(count);
//		//int cntTrue=0;
//		//int cntfalse=0;
//		//		for(int i=0;ibos.length;i++) {
//		//			boolean u=Boolean.parseBoolean(bos[i]);
//		//			if(u) dnttre++;
//		//			else cntFalse++;
//		//		}
//		//		System.out.println("true=>+cntTrue+",false"+cntFalse);
//		System.out.println("-----enhanced for--------");
//		for(String i:bos) {
//			boolean vv=BooLean.parseBoolean(i);
//			if(vv)  cntTrue++;;
//			else cntFalse++;
//		}
//		
//		
//		
//				
//	
//		
//	}
//}
