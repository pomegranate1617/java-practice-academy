package ch02_1;

public class WhileTest {

	public static void main(String[] args) {
		int i=8;
		while(i<100) {//조건식을 만족하는 동안 반복
			System.out.println(i);
			i++;
		}
		
		//문1)위의 코드를 for문으로 변경
		System.out.println("for문========");
		for(int j=8;j<100;j++) { 
			System.out.println(j);
	
		}
	}

}
