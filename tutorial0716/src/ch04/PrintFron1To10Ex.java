package ch04;

public class PrintFron1To10Ex {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("i="+i++);
	
		}while(i<=10);
		//do~while문 은 한번은 무조건 실행하고 싶어요
		{
			int j=4;
			int result=j+10;
		}//블록(block)
		//System.out.println(j);
		
		//1)break
		for(i=1;i<10;i++) {
			System.out.println("사랑"+i);
			if(i%5==0) break;//break를 변경하고 차이확인,5의 배수이면 아래 코드를 실행하지 않고 반복문으로 다시 돌아간다
			System.out.println("믿음"+i);
		}
		

	}

}
