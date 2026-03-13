package c;

import java.util.Scanner;

public class RedTest {

	public static void main(String[] args) {
	Red [] reds= {
			new Red(),
			new Red(),
			new Red()
	};
	//총점,평균,grade를 setter로 저장하고
	int [][]scores= {
			{30,40,50},{60,65,70},{67,77,99},
	};
	int k=0;
	for(Red i:reds) {
			i.setEng(scores[k][0]);
			i.setMath(scores[k][1]);
			i.setKorea(scores[k][2]);
			i.setTotal(i.getEng()+i.getMath()+i.getKorea());
			i.setAvg(i.getTotal()/3.0f);
			i.setGrade(i.calcGrade(i.getAvg()));
			k++;
	}
	float total=0;
	
	for(Red i:reds) {
		System.out.println(i.getEng());
	}
	Scanner sc=new Scanner(System.in);
	int idx=0;
	do {
		System.out.println("숫자를 입력하세요 1,2,3,4)종료");
		idx=sc.nextInt();
		System.out.println(idx);
		if(idx==4)break;
		System.out.println("영어:"+reds[idx].getEng()+",수학:"+reds[idx].getMath()+",국어:"+reds[idx].getKorea()+",총점:"+reds[idx].getTotal()+",평균:"+reds[idx].getAvg()+",등급:"+reds[idx].getGrade());//국어,영어,수학,총점,평균,등급나오게?
		//여기(위)출력시 list의 데이터를 가지고 국어 영어 수학 총점 평균 등급 가져오도록
	}while(idx!=4);
	System.out.println("종료되었습니다");
	
	}

}
