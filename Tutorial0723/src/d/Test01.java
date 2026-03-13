package d;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		  	
				Tire a=new Tire();
				a.setColor("노랑");
				a.setPrice(80);
				a.setShape("네모");
				
				Tire b=new Tire();
				b.setColor("빨강");
				b.setPrice(90);
				b.setShape("세모");
				Tire [] arr={a,b};
				
				
				Car c=new Car("홍길동");
				c.setTires(arr);
				System.out.println(c.getDriver());
				int cnt=1;
				for(Tire i:c.getTires()) {
					System.out.println(cnt+++"의 타이어 가격:"+i.getPrice()+","+i.getColor()+","+i.getShape());
				}
				
				
				System.out.println(c.getDriver());
				//홍길동 노랑 80 네모 빨강 90세모
				for(Tire i:c.getTires()) {
					System.out.println(cnt+++"의 타이어 가격:"+i.getPrice()+"가격,"+i.getColor()+",모양"+i.getShape());
				}
				String[][] str= {
						{"홍","길","동"},
						{"감","사","합"},
						{"니","다","만세"}
				};
				List<List<String>>yellowList=new ArrayList<>();
						for(String[]s:str) {
							List<String>v=new ArrayList<>();
							for(String i:s) {
								v.add(i);
							}
							yellowList.add(v);
						}
						c.setYellow(yellowList);
						for(List<String> u:c.getYellow() {
							for(String r:u) {
								System.out.println(r);
							}
						}
						
						}
								
		}
}