package a;

public class Test05 {

	public static void main(String[] args) {
		double rand = Math.random(); //ex) 0.999999
		System.out.println(rand); //0보다 같거나 크고 1보다 작은 숫자 중의 하나를 준다.
		
		int randIdx = (int)(rand*10); //0~9까지 숫자 중의 하나를 준다. //9.999999 (int로 형변환) => 9
		System.out.println(randIdx);
	}

}
