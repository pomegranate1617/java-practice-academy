package ch03;

public class ConditoinalOperationEx {

	public static void main(String[] args) {
		int score=85;
		
		char grade= (score>99?'A':(score>80?'B':'F'));
		//문1 )if문으로 변경하세요
		if(score>99) {
			grade='A';
			
		}
		else if(score>80) {
			grade='B';
			
		}
		else {
			grade='F';
			
		}
		System.out.println(grade);
		
	}

}
