package c;

import java.util.ArrayList;
import java.util.List;

public class RedTest {

	public static void main(String[] args) {
		List<Red> list=new ArrayList<>();
		for(int i=0;i<5;i++) {
			Red a=new Red();
			a.setDodo(i+1);
			a.setPopo((i+1)*6);
			a.setYudo("컴퓨터");
			a.setTongtong(3.6f);
			list.add(a);
		}
		for(Red i:list) {
			System.out.println(i.getPopo()+","+i.getDodo()+","+i.getTongtong()+","+i.getYudo());
		}
		int arr[]= {1,4,8,14,7};
		
		boolean r=true;
		for(int i=0;i<arr.length;i++) {
			r=list.get(0).turi(arr[i]);
		}
		System.out.println(r);
	}

}
//package c;

//public class RedTest {
//
//	public static void main(String[] args) {
//		Red[]reds=new Red[5];
//		for(int i=0;i<5;i++) {
//			reds[i]=new Red();
//			reds[i].setDodo(i+1);
//			reds[i].setPopo((i+1)*6);
//			reds[i].setYudo("컴퓨터");
//			reds[i].setTongtong(3.6f);
//		}
//		for(int i=0;i<5;i++) {
//			System.out.println(reds[i].getDodo()+reds[i].getPopo()+reds[i].getYudo()+reds[i].getTongtong());
//		}
//		int arr[]= {1,4,8,14,7};
//		
//		boolean r=true;
//		for(int i=0;i<arr.length;i++) {
//			r=reds[0].turi(arr[i]);
//		
//		}
//		System.out.println(r);
//		
		
		
		
		
		
		
