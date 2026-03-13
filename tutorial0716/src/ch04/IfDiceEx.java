package ch04;

public class IfDiceEx {

	public static void main(String[] args) {
		//문1) 반복문을 활용하여 100번 실해하여 1,2,3,4,5,6번이 각각 몇회가 발생했는지 프로그래밍하세요
		int cnt1=0, cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0;
		int cnts[]= {0,0,0,0,0,0};
			
		
		for(int i=0;i<100;i++) {
			int num= (int)(Math.random()*6) +1;//1~6
			if(num==1) {
				cnt1++;
				cnts[0]++;
				
			}		
			else if(num==2) {
				cnt2++;
				cnts[1]++;
				
			}
			else if(num==3) {
				cnt3++;
				cnts[2]++;
			}				
			else if(num==4) {
				cnt4++;
				cnts[3]++;
			}
			else if(num==5) {
				cnt5++;
				cnts[4]++;
			}
			else if(num==6) {
				cnt6++;
				cnts[5]++;
			}		
		}
		int total=0;
		System.out.println("1번은 "+cnt1);
		System.out.println("2번은 "+cnt2);
		System.out.println("3번은 "+cnt3);
		System.out.println("4번은 "+cnt4);
		System.out.println("5번은 "+cnt5);
		System.out.println("6번은 "+cnt6);
		for(int i=0;i<cnts.length;i++) {
			System.out.println(cnts[i]);
			total+=cnts[i];
		}
		if(total==100) System.out.println(true);
		else System.out.println(false);
		
		//random으로 숫자 10개 미만이 나오도록 하라
		//1,2,3,4,5 까지만 10개 미만으로 나오고 6은 상관없다
		
		for(int i=0;i<100;i++) {
			int num= (int)(Math.random()*6) +1;//1~6
			if(num==1) {
				
				if(cnts[0]>10) continue;//반복문을 빠져나가는 것이 아니라 다시 반복문으로 돌아간다
				cnts[0]++;
			}		
			else if(num==2) {
				cnts[1]++;	
			}
			
			else if(num==3) {
				cnts[2]++;	
			}
						
			else if(num==4) {
				cnts[3]++;	
			}
			else if(num==5) {
				cnts[4]++;	
			}
			else if(num==6) {
				cnts[5]++;
			}	
	}

}
}

